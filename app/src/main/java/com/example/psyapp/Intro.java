package com.example.psyapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

public class Intro extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setBackgroundResource(R.drawable.back);
        setContentView(layout);

        new Thread(){
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Intent i = new Intent(Intro.this, MainActivity.class);
                startActivity(i);
                finish(); //현재 화면(Activity) 종료
            }
        }.start();
    }
}






