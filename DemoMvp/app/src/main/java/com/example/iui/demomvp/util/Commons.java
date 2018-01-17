package com.example.iui.demomvp.util;

import android.text.TextUtils;

/**
 * Created by Admin on 12/25/2017.
 */

public class Commons {
    public static int checkSignIn(String email,String password){
        //goi service get Data
        int key = 0;
        if (TextUtils.isEmpty(email) || TextUtils.isEmpty(password)) {
//            message = "Please input Email and Password";
            return key = 1;
        } else if (!email.matches(Keyss.emailParent)) {
//            message = "Email is wrong format !";
            return key = 2;
        } else if (email.matches(Keyss.emailParent)) {
            return key = 0;

        }
        return key;
    }
}
