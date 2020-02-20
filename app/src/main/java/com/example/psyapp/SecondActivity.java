package com.example.psyapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class SecondActivity extends Activity {
    int score = 50;
    int count = 1;
    TextView question;

    //버튼클릭을 감시하기 위한 클래스
    class MyListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            count = count + 1;  //count++;
            int id = view.getId();
            switch (id) {
                case R.id.yes:
                    score = score + 5;
                    break;
                case R.id.no:
                    score = score + 3;
                    break;
            }
            switch (count) {
                case 2:
                    question.setText("두번째 질문");
                    break;
                case 3:
                    question.setText("세번째 질문");
                    break;
                case 4:
                    question.setText("네번째 질문");
                    break;
                case 5:
                    question.setText("다섯번째 질문");
                    break;
                case 6:
                    //결과 화면 호출
                    Intent i = new Intent(SecondActivity.this, ResultActivity.class);
                    //화면간 데이터 전달
                    i.putExtra("score", score);
                    startActivity(i);

                    //화면에 모양만 변경
//                    setContentView(R.layout.resultactivity);
//                    TextView result = findViewById(R.id.result);
//                    if (score > 70) {
//                        result.setText("왕변태 축하해요");
//                    }else {
//                        result.setText("곧 왕변태 축하해요");
//                    }
            }


        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondactivity);
        Button y = findViewById(R.id.yes);
        Button n = findViewById(R.id.no);
        question = findViewById(R.id.question);


        MyListener m = new MyListener();
        y.setOnClickListener(m);
        n.setOnClickListener(m);

        question.setText("바퀴벌레의 수명이 평상시 매우 궁금하다?");

    }
}







