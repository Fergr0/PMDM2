package com.example.propuesta62;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.GridView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    
    private TextView texto;
    private GridView grideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        String[] elementos = new String[]{"España", "Portugal", "Francia", "Brasil", "Alemania","Dinamarca", "Noruega", "Rusia", "Italia", "Argentina"};
        grideo = findViewById(R.id.grideo);
        texto = findViewById(R.id.texto);
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, elementos);
        grideo.setAdapter(adaptador);
        grideo.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long id) {
                String pulsado = (String) adapterView.getItemAtPosition(i);
                texto.setText(pulsado);
            }
        });


    }
}