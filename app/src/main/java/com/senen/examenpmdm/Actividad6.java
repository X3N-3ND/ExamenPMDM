package com.senen.examenpmdm;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Actividad6 extends MainActivity {
    private EditText entrada;
    private TextView salida;

    class MiTarea extends AsyncTask<Integer, Integer, Integer> {
        private ProgressDialog progreso;

        @Override
        protected void onPreExecute() {
            progreso = new ProgressDialog(Actividad6.this);
            progreso.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
            progreso.setMessage("Subiendo Archivo...");
            progreso.setCancelable(true);
            progreso.setMax(100);
            progreso.setProgress(0);
            progreso.show();
            progreso.setOnCancelListener(new OnCancelListener() {
                @Override
                public void onCancel(DialogInterface dialog) {
                    MiTarea.this.cancel(true);
                }
            });
        }

        @Override
        protected Integer doInBackground(Integer... n) {
            int res = 1;
            // aqui iria la carga del archivo en background pero no hay que
            // hacerla es un ejemplo.
            for (int i = 1; i <= 20 && !isCancelled(); i++) {
                res *= i;
                SystemClock.sleep(200);
                publishProgress(i * 100 / 20); //0,2 segundos por 20 progresos = 4 segundos, cada prograso es de 5% por lot anto necesita 20 para llegar al 100%
            }
            return res;
        }

        @Override
        protected void onProgressUpdate(Integer... porc) {
            progreso.setProgress(porc[0]);
        }

        @Override
        protected void onPostExecute(Integer res) {
            progreso.dismiss();
            salida.append("Archivo subido");
        }

        @Override
        protected void onCancelled() {
            salida.append("Subida de archivo " + entrada.getText().toString()
                    + " Cancelada\n\n por favor intentelo en unos minutos.");
        }
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_actividad6);
        /*entrada = (EditText) findViewById(R.id.act6);
        salida = (TextView) findViewById(R.id.salida);*/
    }

    public void subirArchivo(View view) {
        salida.setText("");// limpia antes de escribir uno nuevo
        MiTarea tarea = new MiTarea();
        tarea.execute();
    }
}

