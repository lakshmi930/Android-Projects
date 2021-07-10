package com.xyz.optionandcontextmenu;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private ConstraintLayout consl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        consl=(ConstraintLayout)findViewById(R.id.cl);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu m){
        MenuInflater mi=getMenuInflater();
        mi.inflate(R.menu.main_menu,m);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem mi){
        switch(mi.getItemId()){
            case R.id.red:
                consl.setBackground(Color.red);
                //consl.setBackground(Color.red);
                return true;
            case R.id.green:
                consl.setBackground(Color.green);
                //consl.setBackground(Color.green);
                return true;
            case R.id.blue:
                consl.setBackground(Color.blue);
                //consl.setBackground(Color.blue);
                return true;
            default:
                return super.onOptionsItemSelected(mi);
        }
    }
}
