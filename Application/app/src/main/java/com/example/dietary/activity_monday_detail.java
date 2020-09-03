package com.example.dietary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activity_monday_detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monday_detail);
    }

    public void btn_monDetail(View view) {
        startActivity(new Intent(getApplicationContext(),activity_monday_detail2.class));
    }

    public void btn_monSelectSet(View view) {
        startActivity(new Intent(getApplicationContext(),activity_mon_selectSet.class));
    }
}
