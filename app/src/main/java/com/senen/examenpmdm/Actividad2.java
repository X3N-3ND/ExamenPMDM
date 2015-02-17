package com.senen.examenpmdm;

import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Actividad2 extends MainActivity{
    ImageView transicion;
    TransitionDrawable transicionDw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_actividad2);
        transicion = (ImageView) findViewById(R.id.act2_imageview);
        transicionDw = (TransitionDrawable) getResources().getDrawable(R.drawable.act2_transicion);
        transicion.setImageDrawable(transicionDw);
    }

    public void act2_accionTransicion(View view){
        transicionDw.startTransition(3000);
    }
}
