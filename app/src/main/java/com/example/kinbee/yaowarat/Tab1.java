package com.example.kinbee.yaowarat;

/**
 * Created by Admin on 12/17/16.
 */

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;
import java.util.List;
import java.util.ArrayList;
public class Tab1 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab1);

        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.linear);
        linearLayout.setBackgroundColor(Color.parseColor("#f62355"));

    }
    public List<ItemObject> getAllItemList(){

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
    }
}
