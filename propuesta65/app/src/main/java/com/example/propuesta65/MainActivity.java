package com.example.propuesta65;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.example.propuesta65.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        String mensaje = "";

        if (item.getItemId() == R.id.lunes) {
            mensaje = "Has seleccionado Lunes";
        } else if (item.getItemId() == R.id.martes) {
            mensaje = "Has seleccionado Martes";
        } else if (item.getItemId() == R.id.miercoles) {
            mensaje = "Has seleccionado Miércoles";
        } else if (item.getItemId() == R.id.jueves) {
            mensaje = "Has seleccionado Jueves";
        } else if (item.getItemId() == R.id.viernes) {
            mensaje = "Has seleccionado Viernes";
        } else if (item.getItemId() == R.id.sabado) {
            mensaje = "Has seleccionado Sábado";
        } else if (item.getItemId() == R.id.domingo) {
            mensaje = "Has seleccionado Domingo";
        } else if (item.getItemId() == R.id.martesSub1) {
            mensaje = "Primera hora";
        } else if (item.getItemId() == R.id.martesSub2) {
            mensaje = "Segunda hora";
        } else if (item.getItemId() == R.id.martesSub3) {
            mensaje = "Tercera hora";
        } else{
            mensaje = "No reconocido";
        }

        // Mostrar mensaje
        Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show();

        return true;
    }



}