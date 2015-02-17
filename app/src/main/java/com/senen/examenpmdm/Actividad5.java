package com.senen.examenpmdm;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Actividad5 extends MainActivity{
    private EditText numi, expi;
    private TextView salidi;
    private int numero, exponente, resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_actividad5);
        numi = (EditText) findViewById(R.id.etNum);
        expi = (EditText) findViewById(R.id.etExp);
        salidi = (TextView) findViewById(R.id.tvSalida);
    }

    public void calcularPotencia(View view) {
        salidi.setText("");
        resultado = 0;
        numero = Integer.parseInt(numi.getText().toString());
        exponente = Integer.parseInt(expi.getText().toString());
        salidi.append(numero + "^" + exponente + " = ");
        new Thread(new Runnable() {
            public void run() {
                for (int n = 1; n < exponente; n++) {
                    if (resultado != 0) {
                        resultado = resultado * numero;
                    }
                    if (resultado == 0) {
                        resultado = numero * numero;
                    }
                }
                ;
            }
        }
        ).start();
        SystemClock.sleep(500);
        salidi.append(Integer.toString(resultado));
        resultado = 0;
    }
}
