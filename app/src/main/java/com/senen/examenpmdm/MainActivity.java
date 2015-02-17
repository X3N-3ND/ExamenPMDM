package com.senen.examenpmdm;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main);
    }

    //Aquí empiezan los metodos llamados por los onClick de cada Button del layout.

    public void accionAct01(View view) {
        Intent i = new Intent(this, Actividad1_1.class);
        startActivity(i);
    }

    public void accionAct02(View view) {
        Intent i = new Intent(this, Actividad2.class);
        startActivity(i);
    }

    public void accionAct03(View view) {
        Intent i = new Intent(this, Actividad3.class);
        startActivity(i);
    }

    public void accionAct04(View view){
        Intent i = new Intent(this, Actividad4.class);
        startActivity(i);
    }
//
    /*public void accionAct05(View view){
        Intent i = new Intent(this, Actividad1_1.class);
        startActivity(i);
    }

    public void accionAct06(View view){
        Intent i = new Intent(this, Actividad1_1.class);
        startActivity(i);
    }

    public void accionAct07(View view){
        Intent i = new Intent(this, Actividad1_1.class);
        startActivity(i);
    }

    public void accionAct08(View view){
        Intent i = new Intent(this, Actividad1_1.class);
        startActivity(i);
    }

    public void accionAct09(View view){
        Intent i = new Intent(this, Actividad1_1.class);
        startActivity(i);
    }

    public void accionAct10(View view){
        Intent i = new Intent(this, Actividad1_1.class);
        startActivity(i);
    }*/

    //Fín de los métodos personalizados.

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
