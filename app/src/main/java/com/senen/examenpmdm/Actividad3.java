package com.senen.examenpmdm;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;

public class Actividad3 extends MainActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new CanvasPersonalizado(this));

    }

    public class CanvasPersonalizado extends View {
        public CanvasPersonalizado (Context context) {
            super(context);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            Paint pincel1 = new Paint();
            pincel1.setColor(Color.BLUE);
            pincel1.setStrokeWidth(8);
            pincel1.setStyle(Paint.Style.FILL);
            Paint pincel2 = new Paint();
            pincel2.setColor(Color.RED);
            pincel2.setStrokeWidth(8);

            pincel2.setStyle(Paint.Style.FILL);
            canvas.drawCircle(150, 150, 100, pincel1);
            canvas.drawRect(300, 50, 500, 250, pincel2);
            canvas.drawCircle(150, 400, 100, pincel2);
            canvas.drawRect(300, 300, 500, 500, pincel1);
        }
    }
}
