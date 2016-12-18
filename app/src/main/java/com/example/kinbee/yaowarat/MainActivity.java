package com.example.kinbee.yaowarat;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;

import com.example.kinbee.yaowarat.HTTPmanager.HTTPmanager;
import com.example.kinbee.yaowarat.adapter.RecyclerViewAdapter;
import com.example.kinbee.yaowarat.model.Loginrespont;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Callback;



public class MainActivity extends ActionBarActivity {

    private GridLayoutManager lLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle(null);

        Toolbar topToolBar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(topToolBar);
        topToolBar.setSubtitle("YAOWARAT");
        topToolBar.setLogoDescription(getResources().getString(R.string.logo_desc));

        List<ItemObject> rowListItem = Tab1();
        lLayout = new GridLayoutManager(MainActivity.this, 2);

        RecyclerView rView = (RecyclerView)findViewById(R.id.recycler_view);
        rView.setHasFixedSize(true);
        rView.setLayoutManager(lLayout);

        RecyclerViewAdapter rcAdapter = new RecyclerViewAdapter(MainActivity.this, rowListItem);
        rView.setAdapter(rcAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        if(id == R.id.action_refresh){
            Toast.makeText(MainActivity.this, "Refresh App", Toast.LENGTH_LONG).show();
        }
        if(id == R.id.action_new){
            Toast.makeText(MainActivity.this, "Create Text", Toast.LENGTH_LONG).show();
        }

        return super.onOptionsItemSelected(item);
    }

    /*private List<ItemObject> getAllItemList(){

        List<ItemObject> allItems = new ArrayList<ItemObject>();
        allItems.add(new ItemObject("United States", R.drawable.one));
        allItems.add(new ItemObject("Canada", R.drawable.two));
        allItems.add(new ItemObject("United Kingdom", R.drawable.three));
        allItems.add(new ItemObject("Germany", R.drawable.four));
        allItems.add(new ItemObject("Sweden", R.drawable.five));
        allItems.add(new ItemObject("United Kingdom", R.drawable.six));
        allItems.add(new ItemObject("Germany", R.drawable.seven));
        allItems.add(new ItemObject("Sweden", R.drawable.eight));
        allItems.add(new ItemObject("United States", R.drawable.one));
        allItems.add(new ItemObject("Canada", R.drawable.two));
        allItems.add(new ItemObject("United Kingdom", R.drawable.three));
        allItems.add(new ItemObject("Germany", R.drawable.four));
        allItems.add(new ItemObject("Sweden", R.drawable.five));
        allItems.add(new ItemObject("United Kingdom", R.drawable.six));
        allItems.add(new ItemObject("Germany", R.drawable.seven));
        allItems.add(new ItemObject("Sweden", R.drawable.eight));

        return allItems;
    }*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabHost = (TabHost) findViewById(R.id.tabhost);

        TabHost.TabSpec tabSpec = tabHost.newTabSpec("tab1")
                .setIndicator("1")
                .setContent(new Intent(this, Tab1.class));

        TabHost.TabSpec tabSpec2 = tabHost.newTabSpec("tab2")
                .setIndicator("2")
                .setContent(new Intent(this, AddReviewActivity.class));

        TabHost.TabSpec tabSpec3 = tabHost.newTabSpec("tab3")
                .setIndicator("3")
                .setContent(new Intent(this, Tab3.class));

        tabHost.addTab(tabSpec);
        tabHost.addTab(tabSpec2);
        tabHost.addTab(tabSpec3);
    }
}