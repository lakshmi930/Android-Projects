package com.xyz.appwithspinnerdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String[] states;
    private ArrayAdapter<String> aa;
    private Spinner sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp=(Spinner)findViewById(R.id.spinner);
        states=getResources().getStringArray(R.array.states);
        aa=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,states);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp.setAdapter(aa);
    }
    public void onClick(View v)
    {
        Toast.makeText(this,"Your state is "+sp.getSelectedItem(), Toast.LENGTH_LONG).show();
    }
}
