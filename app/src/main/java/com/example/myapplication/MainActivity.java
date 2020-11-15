package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnLogin;
    private EditText edtUsername;
    private EditText edtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

//        Intent i = new Intent(MainActivity.this,SplashActivity.class);


        btnLogin = findViewById(R.id.btn_submit);
        edtUsername = findViewById(R.id.edit_username);
        edtPassword = findViewById(R.id.edit_password);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = edtUsername.getText().toString().toLowerCase().trim();
                String password = edtPassword.getText().toString().toLowerCase().trim();

                if (username.equals("") || password.equals("")) {
                    Toast.makeText(MainActivity.this, "Username or Password are empty", Toast.LENGTH_LONG).show();
                        if (username.equals("setayesh")&& password.equals(false)){
                            Toast.makeText(MainActivity.this, "password is wrong", Toast.LENGTH_LONG).show();
                        }
                } else {
                    if (username.equals("setayesh") && password.equals("1234")) {
                        Intent i = new Intent(MainActivity.this,AdvertisementActivity.class);
                        startActivity(i);
                        finish();
                    }
                }

            }
        });
    }
}