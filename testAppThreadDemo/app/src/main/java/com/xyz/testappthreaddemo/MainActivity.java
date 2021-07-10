package com.xyz.testappthreaddemo;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Handler h=new Handler() {
        @Override
        public void handleMessage(Message m){
            TextView t=(TextView)findViewById(R.id.tv);
            t.setText("20 seconds over since button click");
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v) {
        synchronized (this) {
            try {
                wait(20 * 1000);
            }catch(Exception e){
            }
        }
        h.sendEmptyMessage(0);
    }
}
