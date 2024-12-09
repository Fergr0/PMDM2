package com.example.actividad5_1;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main4);
        TextView miTexto = (TextView) findViewById(R.id.texto5);
        miTexto.setText("Todo construido desde Java \nTamaño 20dp, Italic, color Blue");
        Typeface miFUente = Typeface.createFromAsset(getAssets(), "font/segunda.ttf");
        miTexto.setTypeface(miFUente);
    }
}