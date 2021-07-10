package com.xyz.listviewitemclickdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private String[] pom={"Rohith","Bumrah","Virat","Ravindra Jadeja","Dhoni"};

    private ListView lv;
    private ArrayAdapter<String> aa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=(ListView)findViewById(R.id.lv);
        aa=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,pom);
        lv.setAdapter(aa);
        lv.setOnItemClickListener(this);
    }

    public void onItemClick(AdapterView<?> av, View v,int i,long l){
        if(i!=0) {
            String temp=pom[0];
            pom[0]=pom[i];
            pom[i]=temp;
        }
        aa.notifyDataSetChanged();
    }
}
