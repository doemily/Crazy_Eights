package com.example.crazyeights;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class CardView {
    private Paint imgPaint = new Paint();
    protected void onDraw(Canvas canvas) {
        imgPaint.setColor(Color.BLACK)
        Bitmap cardBack = BitmapFactory.decodeResource(getResources(), R.drawable.backOfCard);
        canvas.drawBitmap(cardBack, 550, 50, imgPaint);

    }
}
