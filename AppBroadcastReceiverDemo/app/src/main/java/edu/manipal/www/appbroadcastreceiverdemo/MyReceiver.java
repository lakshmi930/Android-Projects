package edu.manipal.www.appbroadcastreceiverdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MyReceiver extends BroadcastReceiver {

    private String tag="MyReceiver";
    @Override
    public void onReceive(Context c, Intent in)
    {
        Log.i(tag,"System Booted");
    }
}
