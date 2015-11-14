package com.juanzendejas.logintest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityChangePassword extends AppCompatActivity {

    EditText editTextNewPassword;
    TextView textViewAlert;
    Button buttonChangePassword;
    Button cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_password);

        cancel = (Button) findViewById(R.id.buttonCancel);
        cancel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                Intent login = new Intent(getApplicationContext(), ActivityLogin.class);

                startActivity(login);
                finish();
            }

        });

        editTextNewPassword = (EditText) findViewById(R.id.newPassword);
        textViewAlert = (TextView) findViewById(R.id.alertPassword);
        buttonChangePassword = (Button) findViewById(R.id.buttonChangePassword);
    }
}
