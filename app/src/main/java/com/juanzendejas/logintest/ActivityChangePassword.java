package com.juanzendejas.logintest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityChangePassword extends AppCompatActivity {

    EditText newpass;
    TextView alert;
    Button changepass;
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

        newpass = (EditText) findViewById(R.id.newPassword);
        alert = (TextView) findViewById(R.id.alertPassword);
        changepass = (Button) findViewById(R.id.buttonChangePassword);
    }
}
