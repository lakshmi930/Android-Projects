package com.xyz.threadappdemoanr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.os.Handler;
import android.os.Message;
import android.widget.TextView;
import java.lang.Runnable;
import java.lang.Thread;

public class MainActivity extends AppCompatActivity {

    Handler h;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=(TextView)findViewById(R.id.tv);
        h=new Handler(){
            public void handleMessage(Message m){
                tv.setText("10 seconds wait over");
            }
        };
    }

    public void onClick(View v){
        new Thread(new Runnable(){

            public void run()
            {
                synchronized(this) {
                    try {
                        wait(10000);
                    } catch (Exception e) {

                    }

                }
            }
        }).start();
        h.sendEmptyMessage(0);
    }
}
