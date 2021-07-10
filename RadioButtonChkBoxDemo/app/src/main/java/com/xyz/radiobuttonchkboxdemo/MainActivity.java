package com.xyz.radiobuttonchkboxdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioButton rbMale;
    private EditText etUN;
    private CheckBox chb1,chb2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etUN = (EditText)findViewById(R.id.etUN);
        rbMale=(RadioButton)findViewById(R.id.rbMale);
        chb1=(CheckBox)findViewById(R.id.chbRE);
        chb2=(CheckBox)findViewById(R.id.chbSTP);
    }
    public void register(View v){
        String msg;
        msg="UN :"+etUN.getText().toString();
        msg=msg+"Gender:"+(rbMale.isChecked()?"Male":"Female");
        msg=msg+"Recv Email"+(chb1.isChecked()?"Yes":"No");
        msg=msg+"Share with Third Party"+(chb2.isChecked()?"Yes":"No");
        Toast.makeText(this,msg,Toast.LENGTH_LONG).show();
    }
}
