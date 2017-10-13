package com.example.hywoman.myapplication_final;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Scene;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity_0919 extends AppCompatActivity {

    static int volume;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_0919);
        Log.i("TAG", "HYUW on Create");

      //start라는 버튼을 누르면 "Hello띄우기"
      final Button button = (Button) findViewById(R.id.Start);
        button.setOnClickListener(
            new Button.OnClickListener() {
                   public void onClick(View v) {
                     TextView textView = (TextView) findViewById(R.id.TextView);
                      textView.setText("Hello");
                }

            });
        //intend를 사용하여 장면전환

    }

    public void secondAct(View v) {
        Intent i = new Intent(this, MainActivity_2.class);
        this.startActivity(i);
    }
}


