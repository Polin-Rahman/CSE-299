package com.example.dietary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FitnessAssiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fitness_assi);
    }


    public void btn_RegularLife(View view) {
        startActivity(new Intent(getApplicationContext(),activity_RegularLife1.class));
    }

    public void btn_BusyLife(View view) {
        startActivity(new Intent(getApplicationContext(),into_BusyLife.class));
    }
}
