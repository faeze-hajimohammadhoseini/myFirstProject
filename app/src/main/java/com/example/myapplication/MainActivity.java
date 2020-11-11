package com.example.myapplication;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView textView1;

    private Button btnLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView1.setText("dear friend \n i love you more daily.i wish you could see yourself \n  the way i see you and i wish you could love yourself \n the way i love you .and above all , i wish your life is \n everything you deserve because ,in my opinion , you \n deserve the world . i will stand by you forever . my\n heart will always belong to you .");
                btnLogin.setText("i wish you have a good day ");
            }
        });


        Toast.makeText(this,"welcome to my first app dear",Toast.LENGTH_LONG).show();


    }
    private  void initView(){

        textView1= findViewById(R.id.txt_first);

        btnLogin= findViewById(R.id.btn_login);
    }
}