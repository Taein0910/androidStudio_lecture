package com.example.ti; //package명

import androidx.appcompat.app.AppCompatActivity; //Activity 사용선언

import android.os.Bundle; //다양한 변수 타입 매핑

public class Basic extends AppCompatActivity { //Activity의 디자인 클래스을 부모로 하여 상속된 class 생성

    @Override
    protected void onCreate(Bundle savedInstanceState) { //액티비티가 초기화될때
        super.onCreate(savedInstanceState); //화면 가로/세로 전환에 필요
        setContentView(R.layout.activity_basic); //layout을 보여줌
    }
}
