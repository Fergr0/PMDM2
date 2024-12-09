package com.example.ejercicio6;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        //recojo el intent
        Intent intent = getIntent();

        // Recibir la cadena y el decimal del Intent
        String cadena = intent.getStringExtra("cadena");
        double numero = intent.getDoubleExtra("numero", 0.0);


        Toast toast = Toast.makeText(this, "La cadena es: " + cadena + " y el número es: " + numero, Toast.LENGTH_LONG);
        toast.show();
    }
}