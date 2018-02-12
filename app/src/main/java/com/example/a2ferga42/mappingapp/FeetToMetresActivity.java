package com.example.a2ferga42.mappingapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FeetToMetresActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) implements onClickListener {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b = (Button)findViewById(R.id.btn1);

    }

    public void onClick(View view)
    {
        TextView tv = (TextView)findViewById(R.id.tv1);
        EditText et = (EditText)findViewById(R.id.et1);
        double feet = Double.parseDouble(et.getText().toString());
        double metres = feet*0.305;
        tv.setText("In metres that is:" + metres);
    }
}
