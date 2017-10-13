package com.example.hywoman.myapplication_final;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity_2 extends AppCompatActivity {

    Button b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_2);
    }

    public void onClick(View v) {
        TextView aa = (TextView) findViewById(R.id.TextView);

        TextView bb = (TextView) findViewById(R.id.TextView);
        bb.setText((aa.getText()));

        Button cc = (Button) findViewById(R.id.button2);



    }

    public void secondAct(View v) {
        Intent i = new Intent(this, MainActivity_3.class);
        this.startActivity(i);
    }

}

