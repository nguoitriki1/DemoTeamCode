package com.example.iui.demomvp.data.network;

import com.example.iui.demomvp.util.Keyss;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

/**
 * Created by Admin on 12/25/2017.
 */

public class ApiHelper {
    private static Retrofit retrofit;
    public Retrofit getApiClient(){
        if (retrofit== null){
            retrofit = new Retrofit.Builder().
                    baseUrl(Keyss.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addConverterFactory(ScalarsConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
