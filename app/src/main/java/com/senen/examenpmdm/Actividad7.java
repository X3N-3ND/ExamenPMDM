package com.senen.examenpmdm;

import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.TextView;

public class Actividad7 extends MainActivity {
    TextView act7_textview_salida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_actividad7);
        act7_textview_salida = (TextView) findViewById(R.id.act7_textview_salida);
    }

    public boolean onKeyDown(int codigoTecla, KeyEvent evento) {
        super.onKeyDown(codigoTecla, evento);
        boolean procesada = true;
        switch (codigoTecla) {
            case KeyEvent.KEYCODE_R:
                act7_textview_salida.setText("Hacia arriba");
                break;
            case KeyEvent.KEYCODE_V:
                act7_textview_salida.setText("Hacia abajo");
                break;
            case KeyEvent.KEYCODE_D:
                act7_textview_salida.setText("Hacia la derecha");
                break;
            case KeyEvent.KEYCODE_G:
                act7_textview_salida.setText("Hacia la izquierda");
                break;
            case KeyEvent.KEYCODE_BACK:
                finish();
                break;
            default:
                procesada = false;
                break;
        }
        return procesada;
    }
}
