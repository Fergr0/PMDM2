package com.example.actividades_tema_5;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {

    private EditText editTextNumber1, editTextNumber2;
    private CheckBox checkBoxSum, checkBoxSubtract;
    private Button buttonCalculate;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        // Referencias a los controles de la interfaz
        editTextNumber1 = findViewById(R.id.editTextNumber1);
        editTextNumber2 = findViewById(R.id.editTextNumber2);
        checkBoxSum = findViewById(R.id.checkBoxSum);
        checkBoxSubtract = findViewById(R.id.checkBoxRes);
        buttonCalculate = findViewById(R.id.buttonCalculate);
        textViewResult = findViewById(R.id.textViewResult);

        // Configuración del botón para realizar las operaciones
        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate();
            }
        });
    }

    private void calculate() {
        // Convertir valores de EditText a enteros
        int number1 = Integer.parseInt(editTextNumber1.getText().toString());
        int number2 = Integer.parseInt(editTextNumber2.getText().toString());

        StringBuilder result = new StringBuilder();

        // Verificar las operaciones seleccionadas y realizar los cálculos
        if (checkBoxSum.isChecked()) {
            int sum = number1 + number2;
            result.append("Suma: ").append(sum).append("\n");
        }
        if (checkBoxSubtract.isChecked()) {
            int subtraction = number1 - number2;
            result.append("Resta: ").append(subtraction).append("\n");
        }

        // Mostrar los resultados en el TextView
        if (result.length() > 0) {
            textViewResult.setText(result.toString());
        } else {
            textViewResult.setText("Seleccione una operación");
        }
    }
}