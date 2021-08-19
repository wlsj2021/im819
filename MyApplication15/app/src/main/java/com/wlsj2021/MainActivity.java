package com.wlsj2021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.wlsj2021.myapplication.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getSupportActionBar();
    }
}