package com.senen.examenpmdm;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Toast;

public class Actividad6 extends MainActivity {

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
            for (int i = 1; i <= 20 && !isCancelled(); i++) {
                res *= i;
                SystemClock.sleep(500);
                publishProgress(i * 100 / 20);
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
            Toast.makeText(Actividad6.this,"Archivo subido",Toast.LENGTH_SHORT).show();
        }

        @Override
        protected void onCancelled() {
            Toast.makeText(Actividad6.this,"Subida de archivo cancelada.\nIntentelo en unos minutos.",Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_actividad6);
    }

    public void subirArchivo(View view) {
        MiTarea tarea = new MiTarea();
        Toast.makeText(Actividad6.this,"Subiendo archivo...",Toast.LENGTH_SHORT).show();
        tarea.execute();
    }
}

