package com.example.psyapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resultactivity);
        TextView result = findViewById(R.id.result);

        //이전 화면에서 넘어온 데이터 수신
        Intent i = getIntent();
        int score = i.getIntExtra("score", 100);
        if (score > 70) {
            result.setText("왕변태 축하해요");
        } else {
            result.setText("곧 왕변태 축하해요");
        }
    }
}
