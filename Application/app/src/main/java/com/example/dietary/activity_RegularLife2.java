package com.example.dietary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activity_RegularLife2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__regular_life2);
    }

    public void btn_preWorkout(View view) {
        startActivity(new Intent(getApplicationContext(),activity_preWorkout_detail.class));
    }

    public void btn_monday(View view) {
        startActivity(new Intent(getApplicationContext(),activity_monday_detail.class));
    }

    public void btn_helpBot(View view) {
        startActivity(new Intent(getApplicationContext(),UserAssiActivity.class));
    }
}
