package com.example.actividades_tema_5;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity4 extends AppCompatActivity {

    private EditText editTextNumber1, editTextNumber2;
    private CheckBox checkBoxSum, checkBoxRes;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        // Referencias a los elementos de la interfaz
        editTextNumber1 = findViewById(R.id.editTextNumber1);
        editTextNumber2 = findViewById(R.id.editTextNumber2);
        checkBoxSum = findViewById(R.id.checkBoxSum);
        checkBoxRes = findViewById(R.id.checkBoxRes);
        textViewResult = findViewById(R.id.textViewResult);

        // Configuración de los listeners de los CheckBox
        checkBoxSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate();
            }
        });

        checkBoxRes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate();
            }
        });
    }

    private void calculate() {
        // Verificar si ambos EditText tienen valores
        if (TextUtils.isEmpty(editTextNumber1.getText()) || TextUtils.isEmpty(editTextNumber2.getText())) {
            textViewResult.setText("Por favor, ingrese ambos números.");
            return;
        }

        // Convertir los valores de los EditText a enteros
        int number1 = Integer.parseInt(editTextNumber1.getText().toString());
        int number2 = Integer.parseInt(editTextNumber2.getText().toString());

        StringBuilder result = new StringBuilder();

        // Realizar las operaciones según el estado de los CheckBox
        if (checkBoxSum.isChecked()) {
            int sum = number1 + number2;
            result.append("Suma: ").append(sum).append("\n");
        }

        if (checkBoxRes.isChecked()) {
            int subtraction = number1 - number2;
            result.append("Resta: ").append(subtraction).append("\n");
        }

        // Mostrar el resultado en el TextView
        if (result.length() > 0) {
            textViewResult.setText(result.toString());
        } else {
            textViewResult.setText("Seleccione una operación");
        }
    }
}