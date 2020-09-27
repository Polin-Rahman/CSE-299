package com.example.dietary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class NutritionAssiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutrition_assi);
    }

    public void btn_bmi(View view) {
        startActivity(new Intent(getApplicationContext(),BMI.class));
    }

    public void btn_helpBot(View view) {
        startActivity(new Intent(getApplicationContext(),UserAssiActivity.class));
    }
}
