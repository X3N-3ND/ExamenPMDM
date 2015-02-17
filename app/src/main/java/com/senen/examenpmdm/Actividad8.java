package com.senen.examenpmdm;

import android.graphics.Point;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.TextView;

public class Actividad8 extends MainActivity {
    private TextView tvX, tvY, difX, difY;
    private Point pantalla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_actividad8);
        pantalla = new Point();
        tvX = (TextView) findViewById(R.id.act8_textview_posx);
        tvY = (TextView) findViewById(R.id.act8_textview_posy);
        difX = (TextView) findViewById(R.id.act8_textview_restx);
        difY = (TextView) findViewById(R.id.act8_textview_resty);
    }

    @Override
    public boolean onTouchEvent (MotionEvent event) {
        super.onTouchEvent(event);
        float x = event.getX();
        float y = event.getY();
        updateView(x, y);
        return true;
    }

    private void updateView(float x, float y){
        tvX.setText("Posición X = " + x);
        tvY.setText("Posición Y = " + y);
        difX.setText("X restante = " + (x - pantalla.x));
        difY.setText("Y restante = " + (y - pantalla.y));
    }
}
