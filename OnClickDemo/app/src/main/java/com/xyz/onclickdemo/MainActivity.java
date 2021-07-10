package com.xyz.onclickdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.view.View.OnClickListener;
import android.content.Intent;
import android.net.Uri;

public class MainActivity extends AppCompatActivity implements OnClickListener{

    private EditText et1;
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=(EditText)findViewById(R.id.et);
        btn=(Button)findViewById(R.id.btn);
        btn.setOnClickListener(this);
    }

    public void onClick(View v) {
        Intent in;
        Uri telno=Uri.parse("tel:9837373737");
        in=new Intent(Intent.ACTION_DIAL,telno);
        startActivity(in);
        //Toast.makeText(getApplicationContext(),"Button is clicked",Toast.LENGTH_LONG).show();
    }
}