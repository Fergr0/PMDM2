package com.example.actividad5_3;

import com.example.actividad5_3.R;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView texto1;
    TextView texto2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Button btn1 = findViewById(R.id.boton1);
        Button btn2 = findViewById(R.id.boton2);
        Button btn3 = findViewById(R.id.boton3);
         texto1 = findViewById(R.id.texto);
         texto2 = findViewById(R.id.texto2);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        if(id == R.id.boton1){
            texto1.setText("Boton pulsado");
        } else if (id == R.id.boton2) {
            texto2.setText("Boton 2 Pulsado");
        }else{
            texto2.setText("Boton 3 pulsado");
        }
    }
}