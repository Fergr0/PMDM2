package com.example.propuesta6_1;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private ListView listaview;
    private TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        listaview = findViewById(R.id.listaview);

        String[] elementos = new String[]{"España", "Portugal", "Francia", "Brasil", "Alemania","Dinamarca", "Noruega", "Rusia", "Italia", "Argentina"};
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, elementos);
        listaview.setAdapter(adaptador);

        texto = findViewById(R.id.texto);

        listaview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String pulsado = (String) adapterView.getItemAtPosition(i);
                texto.setText(pulsado);
            }
        });
    }
}