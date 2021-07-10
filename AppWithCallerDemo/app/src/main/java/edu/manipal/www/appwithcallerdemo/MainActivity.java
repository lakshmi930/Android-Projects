package edu.manipal.www.appwithcallerdemo;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et=(EditText)findViewById(R.id.telNo);
    }
    public void onClick(View v)
    {
        if(et.getText().toString().trim().equals(""))
        {
            Toast.makeText(this,"Enter a telephone no.",Toast.LENGTH_LONG).show();
            return;
        }
         //Intent in = new Intent(Intent.ACTION_DIAL);
        Intent in = new Intent(Intent.ACTION_CALL);
        in.setData(Uri.parse("tel:" + et.getText()));


        int MY_PERMISSIONS_REQUEST_CALL_PHONE=1;
        if(ContextCompat.checkSelfPermission(this,android.Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED)
        {
            ActivityCompat.requestPermissions(this, new String[]{android.Manifest.permission.CALL_PHONE},MY_PERMISSIONS_REQUEST_CALL_PHONE);
        }
        if(ContextCompat.checkSelfPermission(this,android.Manifest.permission.CALL_PHONE)==PackageManager.PERMISSION_GRANTED)
            try {
                startActivity(in);
            } catch (SecurityException e) {
            }
        }
}