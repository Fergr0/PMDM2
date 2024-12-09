package com.example.actividades_tema_5;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Prop5_5 extends AppCompatActivity {

    RadioGroup grupo;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_prop55);

        grupo = findViewById(R.id.grupo);
        resultado = findViewById(R.id.resultado);

        grupo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                cambia(i);
            }
        });

    }

    public void cambia(int id){
        RadioButton seleccionado = findViewById(id);

        resultado.setText(seleccionado.getText());
    }


}