package com.example.iui.demomvp.actionlogin;




import com.example.iui.demomvp.data.DataManager;
import com.example.iui.demomvp.data.network.ApiInterface;
import com.example.iui.demomvp.util.Commons;

/**
 * Created by iui on 12/19/2017.
 */

public class PresenterLogin implements LoginPresenterInterface {
    private LoginActivityInterface loginActivity;


    public PresenterLogin(LoginActivityInterface loginActivity) {
        this.loginActivity = loginActivity;
    }

    @Override
    public void onClickedSignIn(String email, String password) {
       int key = Commons.checkSignIn(email,password);
       String message = "";
       switch (key){
           case 0 :
               loginActivity.showDialogProgess("Loading...");
               break;
           case 1 :
                message = "Please input Email and Password";
                break;
           case 2 :
               message = "Email is wrong format !";
               break;

       }
        loginActivity.checkInputType(message);

    }


}
