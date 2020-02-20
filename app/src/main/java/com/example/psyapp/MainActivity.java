package com.example.psyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView 기능 두가지
        //(1) 현재 Activity에 보여줄 화면 설정
        //(2) res/layout 화면 자원을 객체화 (메모리에 올려줌)
        setContentView(R.layout.mainactivity);

        Button b = findViewById(R.id.button1);  //mainactivity.xml 파일내 button1 찾아오기
        b.setOnClickListener( this  );  //b버튼을 감시

        Button b2 = findViewById(R.id.button2);
        b2.setOnClickListener(this);

    }

        @Override
        public void onClick(View view) {  //callback method
            //버튼이 클릭되었을 경우 호출 되는 콜백 메소드

        //button1, button2 클릭 구분
        int id = view.getId();  //클릭된 버튼에 id값 가져오기
        if ( id == R.id.button1) {
            //명시적인 화면 전환
            Intent i = new Intent(this, SecondActivity.class);
            startActivity( i );    // 화면 전환
        }else if ( id == R.id.button2) {
            //암시적인 화면 전환
            Uri number = Uri.parse("tel:02112119");
            Intent dial = new Intent(Intent.ACTION_DIAL, number);
            startActivity(dial);
        }


    }
}







