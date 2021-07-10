package com.example.mahe.threadapp;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;
import android.os.AsyncTask;

import java.io.InputStream;
import java.lang.Integer;
import java.net.URL;

import android.os.Handler;
import android.os.Message;

public class MainActivity extends AppCompatActivity {

    /*Handler h=new Handler() {
        @Override
        public void handleMessage(Message m){
            TextView t=(TextView)findViewById(R.id.tv);
            t.setText("20 seconds over since button click");
        }
    };*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v) {
        /*Thread t = new Thread() {
            public void run() {*/
                //long endTime = System.currentTimeMillis() + 10 * 1000;
                //while (System.currentTimeMillis() < endTime) {
                    /*synchronized (this) {
                        try {
                            wait(10*1000);
                            //wait(endTime - System.currentTimeMillis());
                        } catch (Exception e) {
                        }
                    }*/
                //}
                //h.sendEmptyMessage(0);
            //}
        //};
                //t.start();
                //h.sendEmptyMessage(0);
        //TextView myTextView = (TextView)findViewById(R.id.tv);
        //myTextView.setText("20 seconds over");


        new WaitTask().execute();

        /*Bitmap b=null;
        try {
            b = BitmapFactory.decodeStream((InputStream)new URL("http://ashwath-rao.webs.com/Ashwath_Rao_B.jpg").getContent());
        }catch(Exception e) {

        }
        ImageView iv=(ImageView)findViewById(R.id.iv);
        iv.setImageBitmap(b);*/
    }

    private class WaitTask extends AsyncTask<Void,Integer,Void> {
        protected Void doInBackground(Void...voids) {
            long startTime = System.currentTimeMillis();
            long endTime = startTime + 20 * 1000;
            while (System.currentTimeMillis() < endTime) {
                synchronized (this) {
                    try {
                        //wait( endTime-System.currentTimeMillis());
                        wait(1000);
                        publishProgress((int)(System.currentTimeMillis()-startTime)/1000);
                    } catch (Exception e) {
                    }
                }

            }
            return null;
        }
        protected void onPostExecute(Void result) {
            TextView myTextView = (TextView) findViewById(R.id
                    .tv);
            myTextView.setText("20 seconds elapsed since button click");
        }
        public void onProgressUpdate(Integer...progress) {
            TextView tv = (TextView) findViewById(R.id.tv);
            tv.setText(progress[0].toString());

        }
    }

}


