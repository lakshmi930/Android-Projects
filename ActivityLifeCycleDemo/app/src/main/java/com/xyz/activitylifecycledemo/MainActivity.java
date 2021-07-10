package com.xyz.activitylifecycledemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=(TextView)findViewById(R.id.tv);
        tv.setText(tv.getText()+"\nCreated");
    }
    @Override
    protected void onStart() {
        super.onStart();
        tv.setText(tv.getText()+"\nStarted");
    }
    @Override
    protected void onResume() {
        super.onResume();
        tv.setText(tv.getText()+"\nResumed");
    }
    @Override
    protected void onStop() {
        super.onStop();
        tv.setText(tv.getText()+"\nStopped");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        tv.setText(tv.getText()+"\nDestroyed");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        tv.setText(tv.getText()+"\nRestarted");
    }
    @Override
    protected void onPause() {
            super.onPause();
            tv.setText(tv.getText()+"\nPaused");
    }
}
