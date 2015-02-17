package com.senen.examenpmdm;

import android.app.IntentService;
import android.content.Intent;

/**
 * Created by alumno on 17/02/2015.
 */
public class Actividad6_CustomIntentService extends IntentService {

    public static final String ACTION_PROGRESO = "com.senen.examenpmdm.action.PROGRESO";
    public static final String ACTION_FIN = "com.senen.examenpmdm.action.FIN";

    public Actividad6_CustomIntentService() {
        super("Actividad6_CustomIntentService");
    }

    @Override
    protected void onHandleIntent(Intent intent)
    {
        int iter = intent.getIntExtra("iteraciones", 20);

        for(int i=1; i<=iter; i++) {
            tareaLarga();

            //Comunicamos el progreso
            Intent bcIntent = new Intent();
            bcIntent.setAction(ACTION_PROGRESO);
            bcIntent.putExtra("progreso", i*5);
            sendBroadcast(bcIntent);
        }

        Intent bcIntent = new Intent();
        bcIntent.setAction(ACTION_FIN);
        sendBroadcast(bcIntent);
    }

    private void tareaLarga()
    {
        try {
            Thread.sleep(1000);
        } catch(InterruptedException e) {}
    }
}
