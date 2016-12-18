package com.example.kinbee.yaowarat.HTTPmanager;

import com.example.kinbee.yaowarat.model.Loginrespont;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by kinbee on 12/11/2016 AD.
 */

public interface APIservice {
    @FormUrlEncoded
    @POST("login.php")
    Call<Loginrespont> checklogin(@Field("strUser") String user, @Field("strPass") String pass);


}
