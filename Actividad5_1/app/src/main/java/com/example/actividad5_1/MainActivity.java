package com.example.actividad5_1;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Animation miAnimacion = AnimationUtils.loadAnimation(this, R.anim.alfa1);
        Animation animacion2 = AnimationUtils.loadAnimation(this, R.anim.escala1);
        TextView miTexto = (TextView) findViewById(R.id.miTexto);
        miAnimacion.setRepeatMode(Animation.RESTART);
        miAnimacion.setRepeatCount(20);
        miTexto.setAnimation(miAnimacion);

    }
}