package com.xyz.listviewclickdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.AdapterView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{


    String[] items={"A","B","C"};
    private ArrayAdapter aa;
    private ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=(ListView)findViewById(R.id.lv);
        aa=new ArrayAdapter(this,android.R.layout.simple_list_item_1,items);
        lv.setAdapter(aa);
        lv.setOnItemClickListener(this);
    }
    public void onItemClick(AdapterView<?> av, View v, int i, long l)
    {
        if(i!=0){
            String temp=items[0];
            items[0]=items[i];
            items[i]=temp;
            aa.notifyDataSetChanged();
        }

    }
}
