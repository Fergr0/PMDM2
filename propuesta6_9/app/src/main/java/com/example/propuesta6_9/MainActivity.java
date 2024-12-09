package com.example.propuesta6_9;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private String[] options = {"Opción A", "Opción B", "Opción C", "Opción D", "Opción E"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        // Configuramos el adaptador para el ListView
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, options);
        listView.setAdapter(adapter);

        // Registramos el menú contextual para el ListView
        registerForContextMenu(listView);
    }

    // Este método se llama cuando se realiza un LongClick en un item del ListView
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        // Inflamos el menú contextual
        getMenuInflater().inflate(R.menu.menu_contextual, menu);
    }

    // Este método maneja las acciones cuando se selecciona una opción del menú contextual
    @Override
    public boolean onContextItemSelected(MenuItem item) {
        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        int position = info.position;

        // Usamos if-else en lugar de switch
        if (item.getItemId() == R.id.option_1) {
            // Acción para la opción 1A
            System.out.println("Opción 1A seleccionada para: " + options[position]);
            return true;
        } else if (item.getItemId() == R.id.option_2) {
            // Acción para la opción 2A
            System.out.println("Opción 2A seleccionada para: " + options[position]);
            return true;
        } else {
            return super.onContextItemSelected(item);
        }
    }
}