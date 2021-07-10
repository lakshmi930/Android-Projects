package edu.manipal.www.appwithnotificationdemo;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String CHANNEL_ID="channel";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createNotificationChannel();
    }


    public void onClick(View v) {
        NotificationCompat.Builder mBuilder=new NotificationCompat.Builder(this,CHANNEL_ID)
                .setSmallIcon(R.drawable.index)
                .setContentTitle("Meeting")
                .setContentText("Meeting at 10 AM")
                .setPriority(NotificationCompat.PRIORITY_DEFAULT);
                //.setAutoCancel(true);
        NotificationManagerCompat notificationManager = NotificationManagerCompat.from(this);
        int notificationId = 1;
        notificationManager.notify(notificationId,mBuilder.build());
    }

    private void createNotificationChannel()
    {
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            CharSequence name =getString(R.string.channel_name);
            String description=getString(R.string.channel_description);
            int importance = NotificationManager.IMPORTANCE_DEFAULT;
            NotificationChannel channel=new NotificationChannel(CHANNEL_ID,name,importance);
            channel.setDescription(description);
            NotificationManager notificationManager = getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(channel);
        }

    }
}
