package edu.manipal.www.appwithlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.ArrayAdapter;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayAdapter<CharSequence> aa;
    CharSequence[] states = {"Karnataka", "Delhi", "Andhra Pradesh","Maharashtra", "Madhya Pradesh"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.listView);

        aa = new ArrayAdapter<CharSequence>(this, android.R.layout.simple_list_item_1, states);

        lv.setAdapter(aa);
    }
}

