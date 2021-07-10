package com.xyz.threadappdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v) {
        //synchronized(this) {
            try {
                wait(10 * 1000);
            } catch (Exception e) {

            }
        //}
    }
}
