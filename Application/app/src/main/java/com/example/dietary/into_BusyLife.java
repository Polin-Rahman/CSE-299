package com.example.dietary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class into_BusyLife extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_into__busy_life);
    }

    public void btn_busyIntro(View view) {
        startActivity(new Intent(getApplicationContext(),activity_BusyLife.class));
    }
}
