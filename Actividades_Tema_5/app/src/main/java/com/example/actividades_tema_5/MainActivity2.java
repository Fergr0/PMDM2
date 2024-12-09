package com.example.actividades_tema_5;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    private TextView textViewSelectedItem;
    private Spinner spinnerOptions;
    private Button buttonShowSelection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Referencias a los elementos del layout
        textViewSelectedItem = findViewById(R.id.textview_selected_item);
        spinnerOptions = findViewById(R.id.spinner_options);
        buttonShowSelection = findViewById(R.id.button_show_selection);

        // Configuración de opciones del Spinner
        String[] items = {"Opción 1", "Opción 2", "Opción 3", "Opción 4"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, items);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerOptions.setAdapter(adapter);

        // Configuración del botón para mostrar el elemento seleccionado
        buttonShowSelection.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                // Obtiene el elemento seleccionado y lo muestra en el TextView
                String selectedItem = spinnerOptions.getSelectedItem().toString();
                textViewSelectedItem.setText(selectedItem);
            }
        });
    }
}