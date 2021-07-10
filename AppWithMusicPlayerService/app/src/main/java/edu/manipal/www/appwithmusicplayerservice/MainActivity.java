package edu.manipal.www.appwithmusicplayerservice;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Intent i;
    Button btSt,btSp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btSt = (Button) findViewById(R.id.btnStart);
        btSp=(Button) findViewById(R.id.btnStop);


        /*MediaPlayer player;
        player = MediaPlayer.create(this, R.raw.mogo);
        player.setLooping(true); // Set looping
        player.setVolume(100,100);
        player.start();*/
    }

    public void onClick(View v) {
        i=new Intent(this,BackgroundSoundService.class);
        if(v==btSt) {
            startService(i);
            Toast.makeText(this,"Service Started", Toast.LENGTH_LONG).show();
        }
        else if(v==btSp)
            stopService(i);
            Toast.makeText(this,"Service Stopped", Toast.LENGTH_LONG).show();

    }
}
