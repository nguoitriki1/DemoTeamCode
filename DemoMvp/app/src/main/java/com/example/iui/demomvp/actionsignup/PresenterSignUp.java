package com.example.iui.demomvp.actionsignup;

/**
 * Created by Admin on 12/25/2017.
 */

public class PresenterSignUp implements SignUpPresenterInterface {
    private SignUpActivityInterface signUpActivityInterface;

    public PresenterSignUp(SignUpActivityInterface signUpActivityInterface) {
        this.signUpActivityInterface = signUpActivityInterface;
    }
}
