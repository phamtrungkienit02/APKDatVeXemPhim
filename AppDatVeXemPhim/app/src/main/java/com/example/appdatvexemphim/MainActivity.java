package com.example.appdatvexemphim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button btnSignUp = (Button) findViewById(R.id.btnSignUp);
        Button btnSignIn = (Button) findViewById(R.id.btnSignIn);
        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent activitySignIp = new Intent(MainActivity.this, SignInActivity.class);
                startActivity(activitySignIp);
            }
        });

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent activitySignUp = new Intent(MainActivity.this, SignUpActivity.class);
                startActivity(activitySignUp);
            }
        });
    }
}