package com.example.ti;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class FlappyBird extends AppCompatActivity {

    private GameView gameView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_flappy_bird);

        gameView = new GameView(this);
        setContentView(gameView);
    }
}