package com.example.student4.circle;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.*;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;

import java.util.Random;

public class Games70 extends Activity
{
    DrawView d = new DrawView(this);
    final Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(d);
    }

    class DrawView extends View {

        Paint paint;

        public DrawView(Context context) {
            super(context);
            paint = new Paint();
        }

        @Override
        protected void onDraw(Canvas canvas)
        {
            paint.setColor((int) Color.rgb(random.nextInt(), random.nextInt(), random.nextInt()));
            canvas.drawCircle(100, 100, 50, paint);

        }
    }
}