package com.xyz.spinnerdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private String countries[]={"India","Russia","Nepal","Sri Lanka"};
    private ListView sp;
    private ArrayAdapter<String> aa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp=(ListView)findViewById(R.id.spinner);
        aa=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,getResources().getStringArray(R.array.countries));
        //aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp.setAdapter(aa);
        sp.setOnItemClickListener(this);
    }
    protected void onClick(View v) {
        Toast.makeText(this,"Selected item is "+sp.getSelectedItem(),Toast.LENGTH_LONG).show();
    }
    public void onItemClick(AdapterView<>v,View v2,int i,long l){

    }
}
