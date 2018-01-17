package com.example.iui.demomvp.data.network;

import com.example.iui.demomvp.data.network.model.UserSignIn;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * Created by Admin on 12/25/2017.
 */

public interface ApiInterface {
    @Headers({"Content-Type: application/json; charset=utf-8"})
    @POST("login.php")
    Call<ResponseBody> callLogin(@Body UserSignIn jsonObj);
}
