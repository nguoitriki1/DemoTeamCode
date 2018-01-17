package com.example.iui.demomvp.actionsignup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.iui.demomvp.R;

public class SignUpActivity extends AppCompatActivity implements SignUpActivityInterface {
    private PresenterSignUp presenterSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        presenterSignUp = new PresenterSignUp(this);
    }
}
