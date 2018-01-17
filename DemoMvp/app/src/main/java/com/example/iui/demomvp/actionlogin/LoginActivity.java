package com.example.iui.demomvp.actionlogin;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.iui.demomvp.R;
import com.example.iui.demomvp.actionsignup.SignUpActivity;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener,LoginActivityInterface {
    private EditText edtEmail,edtPassword;
    private Button btnSignIn;
    private PresenterLogin presenter;
    private TextView txtSignUp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtEmail = findViewById(R.id.edt_email);
        edtPassword = findViewById(R.id.edt_pass);
        btnSignIn = findViewById(R.id.btn_login);
        btnSignIn.setOnClickListener(this);
        presenter = new PresenterLogin(LoginActivity.this);
        txtSignUp = findViewById(R.id.txt_signup);
        txtSignUp.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_login :
                presenter.onClickedSignIn(edtEmail.getText().toString().trim(),edtPassword.getText().toString());
                break;
            case R.id.txt_signup :
                Intent intent = new Intent(LoginActivity.this, SignUpActivity.class);
                startActivity(intent);
                break;
        }
    }


    @Override
    public void showMesage(String message) {
        Toast.makeText(this,""+message,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showDialogProgess(String message) {
       ProgressDialog pDialog = new ProgressDialog(this);
        pDialog.setMessage("Loading...");
        pDialog.show();

    }

    @Override
    public void checkInputType(String checkInputMessage) {
        Toast.makeText(this,checkInputMessage+"",Toast.LENGTH_SHORT).show();
    }

}
