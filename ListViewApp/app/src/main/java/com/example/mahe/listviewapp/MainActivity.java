package com.example.mahe.listviewapp;

/**
 * Created by MAHE on 8/29/2016.
 */

        import android.app.ListActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.ArrayAdapter;
        import android.widget.ListView;
        import android.widget.Toast;

public class MainActivity extends ListActivity
{
    String[] iplwinners = {
            "Rajasthan Royals",
            "Deccan Chargers",
            "Chennai Super Kings",
            "Chennai Super Kings",
            "Kolkata Knight Riders",
            "Mumbai Indians",
            "Kolkata Knight Riders",
            "Mumbai Indians",
            "Sunrisers Hyderabad"
    };

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//---no need to call this---
//setContentView(R.layout.main);
        ListView lv = (ListView)getListView();
        lv.setTextFilterEnabled(true);

        setListAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, iplwinners));
        lv.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
    }
    public void onListItemClick(
            ListView parent, View v, int position, long id)
    {
        Toast.makeText(this,
                "You have selected " + iplwinners[position],
                Toast.LENGTH_SHORT).show();
    }
}