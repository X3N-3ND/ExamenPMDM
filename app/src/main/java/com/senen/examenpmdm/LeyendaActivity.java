package com.senen.examenpmdm;

import android.os.Bundle;
import android.widget.TextView;

public class LeyendaActivity extends MainActivity {
    private TextView textoLeyenda;

    @Override public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_leyenda);
        textoLeyenda = (TextView) findViewById(R.id.leyenda_textview);
        textoLeyenda.setText("Actividad 1: Paso de datos\n" +
            "Actividad 2: Transición\n" +
            "Actividad 3: Canvas\n" +
            "Actividad 4: Action Bar\n" +
            "Actividad 5: Hilos\n" +
            "Actividad 6: Progreso\n" +
            "Actividad 7: Teclado\n" +
            "Actividad 8: Pantalla\n" +
            "Actividad 9: SQLite3\n\n© Senén Córdoba Quiles\nTodos los derechos reservados.");
    }


}
