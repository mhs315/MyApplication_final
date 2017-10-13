package com.example.hywoman.myapplication_final;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity_3 extends AppCompatActivity {

    static int volume;
    private RadioButton Name;
    private RadioButton Class;
    private RadioButton Feel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_3);

        RadioButton r1;
        RadioButton r2;
        RadioButton r3;

        Name = (RadioButton) findViewById(R.id.Name);
        Class = (RadioButton) findViewById(R.id.Class);
        Feel = (RadioButton) findViewById(R.id.Feel);

        Name.setOnCheckedChangeListener(new MyRadioButtonListener());
        Class.setOnCheckedChangeListener(new MyRadioButtonListener());
        Feel.setOnCheckedChangeListener(new MyRadioButtonListener());

    }

    private class MyRadioButtonListener implements RadioButton.OnCheckedChangeListener {

        //@Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

            if (isChecked) {
                String message = String.format("%s MinHyunSeo", buttonView.getText());
                Toast.makeText(buttonView.getContext(), message, Toast.LENGTH_LONG).show();
            } else if (isChecked) {
                String message = String.format("%s 2B_216230054", buttonView.getText());
                Toast.makeText(buttonView.getContext(), message, Toast.LENGTH_LONG).show();
            } else {
                String message = String.format("%s Perfect!!", buttonView.getText());
                Toast.makeText(buttonView.getContext(), message, Toast.LENGTH_LONG).show();
            }
        }


        }
        //첫페이지로 넘어가는 goback
        public void NextScene(View ccc) {
            Intent i = new Intent(this, MainActivity_0919.class);
            startActivity(i);
        }


        //next
        public void secondAct(View v) {
            Intent i = new Intent(this, MainActivity.class);
            this.startActivity(i);
        }
    }
