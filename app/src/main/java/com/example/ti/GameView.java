package com.example.ti;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.view.View;

public class GameView extends View {

    private Bitmap bird;

    private Bitmap bgImage;

    private Paint scorePaint = new Paint();

    private Paint levelPaint = new Paint():

    public GameView(Context context) {
        super(context);
        bird = BitmapFactory.decodeResource(getResources(), R.drawable.bird1);

        bgImage = BitmapFactory.decodeResource(getResources(), R.drawable.bg);

        scorePaint.setColor(Color.BLACK);
        scorePaint.setTextSize(32);
        scorePaint.setTypeface(Typeface.DEFAULT_BOLD);
        scorePaint.setAntiAlias(true);

        levelPaint.setColor(Color.DKGRAY);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawBitmap(bird, 0, 0, null);
    }
}
