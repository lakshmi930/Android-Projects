package edu.manipal.www.appwithoptionmenucontextmenudemo;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ConstraintLayout cl;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cl=(ConstraintLayout)findViewById(R.id.cl);
        tv=(TextView)findViewById(R.id.tv);
        registerForContextMenu(tv);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu m)
    {
        MenuInflater mi = getMenuInflater();
        mi.inflate(R.menu.menus,m);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem mi)
    {
        switch(mi.getItemId()) {
            case R.id.red:
                    cl.setBackgroundColor(Color.RED);
                    break;
            case R.id.green:
                    cl.setBackgroundColor(Color.GREEN);
                    break;
            case R.id.blue:
                    cl.setBackgroundColor(Color.BLUE);
                    break;
            default:
                return super.onOptionsItemSelected(mi);
        }
        return true;
    }

    @Override
    public void onCreateContextMenu(ContextMenu cm, View v, ContextMenu.ContextMenuInfo cmi) {
        MenuInflater minf=getMenuInflater();
        minf.inflate(R.menu.menus,cm);
    }

    @Override
    public boolean onContextItemSelected(MenuItem mi){
        switch(mi.getItemId()) {
            case R.id.red:
                tv.setBackgroundColor(Color.RED);
                break;
            case R.id.green:
                tv.setBackgroundColor(Color.GREEN);
                break;
            case R.id.blue:
                tv.setBackgroundColor(Color.BLUE);
                break;
            default:return super.onContextItemSelected(mi);
        }
        return true;
    }
}