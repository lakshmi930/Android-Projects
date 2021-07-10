package com.example.ashwath.appwithlistviewitemclick;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import android.widget.Toast;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements OnItemClickListener{

    ListView lv;
    ArrayAdapter<CharSequence> aa;
    ArrayList<CharSequence> al;
    CharSequence[] states = {"Karnataka", "Delhi", "Andhra Pradesh","Maharashtra", "Madhya Pradesh"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.listView);
        al = new ArrayList<CharSequence>();
        for(int i=0;i<states.length;i++)
            al.add(states[i]);
        aa = new ArrayAdapter<CharSequence>(this, android.R.layout.simple_list_item_1, al);

        lv.setAdapter(aa);
        lv.setOnItemClickListener(this);
    }

    public void onItemClick(AdapterView<?> av,View v,int pos,long id)
    {
        CharSequence current = (CharSequence)av.getItemAtPosition(pos);

        al.remove(current);
        al.
        aa.notifyDataSetChanged();
    }
}

