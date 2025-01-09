package com.example.propuesta9_2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Crear instancias de los fragmentos
        Fragment fragment1 = new Fragmento1();
        Fragment fragment2 = new Fragmento2();

        // Agregar los fragmentos a los contenedores
        addFragment(fragment1, R.id.fragment_container1);
        addFragment(fragment2, R.id.fragment_container2);
    }

    // Método para agregar fragmentos dinámicamente
    private void addFragment(Fragment fragment, int containerId) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(containerId, fragment);
        fragmentTransaction.commit();
    }
}
