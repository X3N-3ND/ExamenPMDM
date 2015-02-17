package com.senen.examenpmdm;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
//
public class Actividad1_2 extends Actividad1_1 {
    private TextView muestraDni, muestraGrupo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_actividad1_2);
        Bundle extras = getIntent().getExtras();
        muestraDni = (TextView) findViewById(R.id.act1_textview_dni);
        muestraGrupo = (TextView) findViewById(R.id.act1_textview_grupo);
        muestraDni.setText(extras.getString("dni"));
        muestraGrupo.setText(extras.getString("grupo"));
    }

    public void act1_2_accionCorrecto(View view){
        Toast.makeText(this, "Guardando datos...", Toast.LENGTH_SHORT).show();
        finish();
    }

    public void act1_2_accionIncorrecto(View view){
        finish();
    }
}
