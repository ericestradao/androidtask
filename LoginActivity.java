package com.example.uidesign;

import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class LoginActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }

    public void next(View v) {

        TextView warpas = (TextView) findViewById(R.id.warningpass);
        TextView warmail = (TextView) findViewById(R.id.warningmail);
        EditText email = (EditText) findViewById(R.id.email);
        EditText pass = (EditText) findViewById(R.id.password);
        EditText pass2 = (EditText) findViewById(R.id.password2);

        if (pass2.getText().toString().equals(pass.getText().toString())) {
            warpas.setText("");
            email = (EditText) findViewById(R.id.email);
            Log.d("Email:", email.getText().toString());
            EditText password = (EditText) findViewById(R.id.password);
            Log.d("Password:", password.getText().toString());
            EditText password2 = (EditText) findViewById(R.id.password2);
            Log.d("Repeat:", password2.getText().toString());


        } else {
            warpas.setVisibility(View.VISIBLE);
            warpas.setText("Wrong Password");
        }


    }


}





