package com.example.kinbee.yaowarat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

import com.example.kinbee.yaowarat.HTTPmanager.HTTPmanager;
import com.example.kinbee.yaowarat.model.Loginrespont;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity {

    EditText edtUser, edtPass;
    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_login);
        edtUser = (EditText) findViewById(R.id.UsernameEDT);
        edtPass = (EditText) findViewById(R.id.PasswordEDT);

        btnLogin = (Button) findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                HTTPmanager.getInstanc().service.checklogin(edtUser.getText().toString()
                        ,edtPass.getText().toString()).enqueue(new Callback<Loginrespont>() {
                    @Override
                    public void onResponse(Call<Loginrespont> call, Response<Loginrespont> response) {

                        if (response.isSuccessful()){
                            Loginrespont data=response.body();
                            if (data.getStatusID().equals("1")){
                                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                                startActivity(intent);
                            }
                            Log.e( "onResponse: ", "incorect");
                        }
                        else
                        Log.e( "onResponse: ", "not success");

                    }

                    @Override
                    public void onFailure(Call<Loginrespont> call, Throwable t) {
                        Log.e( "onResponse: ", "fails");

                    }
                });
            }
        });


    }
}