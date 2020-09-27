package com.example.dietary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activity_mon_selectSet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mon_select_set);
    }

    public void btn_helpBot(View view) {
        startActivity(new Intent(getApplicationContext(),UserAssiActivity.class));
    }
}
