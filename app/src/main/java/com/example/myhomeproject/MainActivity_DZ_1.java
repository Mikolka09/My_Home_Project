package com.example.myhomeproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity_DZ_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("OnCreate", "OnCreate: " + System.currentTimeMillis());
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("OnStart", "OnStart: " + System.currentTimeMillis());
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("OnResume", "OnResume: " + System.currentTimeMillis());
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("OnPause", "OnPause: " + System.currentTimeMillis());
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("OnStop", "OnStop: " + System.currentTimeMillis());
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("OnRestart", "OnRestart: " + System.currentTimeMillis());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("OnDestroy", "OnDestroy: " + System.currentTimeMillis());
    }

    public void putDown(View view) {
        Log.i("onClick", "Button: Put Down");
    }
}