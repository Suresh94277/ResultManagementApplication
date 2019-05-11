package com.example.resultmanagementapplication;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
private Button signin, login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        signin = findViewById(R.id.signin);
        signin.setOnClickListener(this);
        login = findViewById(R.id.login);
        login.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.signin:

                Intent intent = new Intent(MainActivity.this, SignIn.class);
                startActivity(intent);
                break;

            case R.id.login:

                Intent intent1 = new Intent(MainActivity.this, LogIn.class);
                startActivity(intent1);
                break;
                default:


            }
        }

    }


