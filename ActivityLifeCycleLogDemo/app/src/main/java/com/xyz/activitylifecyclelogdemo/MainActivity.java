package com.xyz.activitylifecyclelogdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        Log.d("LC","onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LC","onStart()");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LC","onResume()");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LC","onStop()");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LC","onDestroy()");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("LC","onRestart()");
    }
}
