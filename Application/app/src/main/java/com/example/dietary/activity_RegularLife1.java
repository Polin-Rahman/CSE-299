package com.example.dietary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activity_RegularLife1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__regular_life1);
    }

    public void btn_RegularLife1(View view) {
        startActivity(new Intent(getApplicationContext(),activity_RegularLife2.class));
    }
}
