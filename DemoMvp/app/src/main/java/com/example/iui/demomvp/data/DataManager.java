package com.example.iui.demomvp.data;

import okhttp3.ResponseBody;
import retrofit2.Call;

/**
 * Created by Admin on 12/25/2017.
 */

public interface DataManager {
    Call<ResponseBody> Login (String email, String password);
}
