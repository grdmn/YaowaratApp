package com.example.kinbee.yaowarat.HTTPmanager;

import com.google.gson.Gson;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by kinbee on 12/11/2016 AD.
 */

public class HTTPmanager {
    static HTTPmanager instanc;
    public APIservice service;

    public static HTTPmanager getInstanc() {
        if (instanc==null){
            instanc = new HTTPmanager();
            return instanc;
        }
        return instanc;
    }

    public HTTPmanager() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://foodyth.azurewebsites.net/Yaowarat/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        service = retrofit.create(APIservice.class);

    }



}
