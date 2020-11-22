package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

import java.util.Map;

public class MainActivity extends AppCompatActivity {
    private Button btnLogin;
    private EditText edtUsername;
    private TextInputLayout edtPassword;
    private TextView txtLengthError;
    private TextView txtUppercaseError;
    private TextView txtLowercaseError;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        initView();

        btnLogin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                txtLengthError.setVisibility(View.GONE);
                txtLowercaseError.setVisibility(View.GONE);
                txtUppercaseError.setVisibility(View.GONE);

                String username = edtUsername.getText().toString().trim();
                String password = edtPassword.getEditText().getText().toString().trim();


                if (username.equals("setayesh") && password.equals("1234Setayesh")) {
                    Intent i = new Intent(MainActivity.this, AdvertisementActivity.class);
                    startActivity(i);
                    finish();
                }

                if (username.equals("") || password.equals("")) {
                    Toast.makeText(MainActivity.this, MessageHelper.PASSWORD_EMPTY_ERROR, Toast.LENGTH_LONG).show();
                } else {
                    Map<String, Boolean> validatorMap = AuthenticationUtils.validatePassword(password);
                    boolean hasLowercase = validatorMap.get("LOWER");
                    boolean hasUppercase = validatorMap.get("UPPER");
                    if (password.length() < 8) {
                        txtLengthError.setVisibility(View.VISIBLE);
                        txtLengthError.setText(MessageHelper.PASSWORD_LENGTH_ERROR);
                    }
                    if (!hasLowercase) {
                        txtLowercaseError.setVisibility(View.VISIBLE);
                        txtLowercaseError.setText(MessageHelper.PASSWORD_LOWER_ERROR);
                    }
                    if (!hasUppercase) {
                        txtUppercaseError.setVisibility(View.VISIBLE);
                        txtUppercaseError.setText(MessageHelper.PASSWORD_UPPER_ERROR);
                    }

                }

            }
        });
    }

    private void initView() {


        btnLogin = findViewById(R.id.btn_Login);
        edtUsername = findViewById(R.id.edit_username);
        edtPassword = (TextInputLayout) findViewById(R.id.edit_password);
        txtLengthError = findViewById(R.id.txt_Length_error);
        txtLowercaseError = findViewById(R.id.txt_Lowercase_error);
        txtUppercaseError = findViewById(R.id.txt_Uppercase_error);


    }

}