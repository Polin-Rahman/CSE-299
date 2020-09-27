package com.example.dietary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LogInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
    }

    /*click and start new activity
        using this method
      initialized button with id in xml file
    */

    public void btn_SignupForm(View view) {
        startActivity(new Intent(getApplicationContext(),SignUpActivity.class));
    }

    public void btn_overView(View view) {
        startActivity(new Intent(getApplicationContext(),overView.class));
    }

    public void btn_mainLogin(View view) {
        startActivity(new Intent(getApplicationContext(),mainLoginActivity.class));
    }
}
