package com.example.iui.demomvp.data;

import android.os.Bundle;

import com.example.iui.demomvp.data.network.ApiHelper;
import com.example.iui.demomvp.data.network.ApiInterface;
import com.example.iui.demomvp.data.network.model.UserSignIn;

import okhttp3.ResponseBody;
import retrofit2.Call;

/**
 * Created by Admin on 12/25/2017.
 */

public class AppDataManager implements DataManager {
    private ApiHelper apiHelper;
    private static AppDataManager appDataManager;

    public static AppDataManager newInstance(ApiHelper apiHelper) {
        if (appDataManager == null) {
            appDataManager = new AppDataManager(apiHelper);
        }
        return appDataManager;
    }

    public AppDataManager(ApiHelper apiHelper) {
        this.apiHelper = apiHelper;
    }


    @Override
    public Call<ResponseBody> Login(String email, String password) {
        UserSignIn userSignIn = new UserSignIn(email,password);
        apiHelper.getApiClient().create(ApiInterface.class).callLogin(userSignIn);


        return null;
    }
}

