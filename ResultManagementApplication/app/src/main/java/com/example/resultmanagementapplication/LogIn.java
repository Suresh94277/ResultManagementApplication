package com.example.resultmanagementapplication;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LogIn extends AppCompatActivity implements View.OnClickListener {
    ProgressDialog progressDialog;
    Button LogIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        progressDialog=new ProgressDialog(this);
        LogIn = findViewById(R.id.LogIn);
    }
    public void progressChange()
    {
        progressDialog.setTitle("Softwarica");
        progressDialog.setMessage("Please Wait");
        progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);

        progressDialog.setCancelable(true);

        progressDialog.setCanceledOnTouchOutside(true);
        progressDialog.show();
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(LogIn.this, Welcome.class);
        startActivity(intent);
        progressChange();
        new Handler().postDelayed(new Runnable() {
            public void run() {
                progressDialog.dismiss();
            }
        }, 1000);

    }
}
