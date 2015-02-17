package com.senen.examenpmdm;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Actividad1_1 extends MainActivity{
    EditText act1_button_dni, act1_button_grupo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_actividad1_1);
        act1_button_dni = (EditText) findViewById(R.id.act1_layout_et_dni);
        act1_button_grupo = (EditText) findViewById(R.id.act1_layout_et_grupo);
    }

    public void accionPasoDatos(View view){
        Intent i = new Intent(this, Actividad1_2.class);
        i.putExtra("dni", act1_button_dni.getText().toString());
        i.putExtra("grupo", act1_button_grupo.getText().toString());
        startActivity(i);
        finish();
    }
}
