package com.example.actividad5_1;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        TextView texto2 = (TextView) findViewById(R.id.texto2);
        texto2.setText("Todo construido desde Java \nTamaño 20dp, Italic, color Blue");
        Typeface miFUente = Typeface.createFromAsset(getAssets(), "font/segunda.ttf");
        texto2.setTypeface(miFUente);
        texto2.setTextColor(getResources().getColor(R.color.red));
        texto2.setTextSize(20);
    }
}