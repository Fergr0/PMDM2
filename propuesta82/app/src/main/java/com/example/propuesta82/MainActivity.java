package com.example.propuesta82;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager paginador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Vinculamos el TabLayout y el ViewPager
        tabLayout = findViewById(R.id.tabLayout);
        paginador = findViewById(R.id.contenedor2);

        // Añadimos las pestañas (tab)
        tabLayout.addTab(tabLayout.newTab().setText("Primero"));
        tabLayout.addTab(tabLayout.newTab().setText("Segundo"));
        tabLayout.addTab(tabLayout.newTab().setText("Tercero"));

        // Crear el adaptador y asignarlo al ViewPager
        Adaptador adaptador = new Adaptador(getSupportFragmentManager(), tabLayout.getTabCount());
        paginador.setAdapter(adaptador);

        // Sincronizamos el cambio de Tab con el ViewPager
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                // Cambiar de página cuando seleccionamos un tab
                paginador.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                // No se necesita hacer nada aquí
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                // No se necesita hacer nada aquí
            }
        });

        // Sincronizar el ViewPager con el TabLayout
        paginador.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        // Inicialmente seleccionamos el primer tab
        tabLayout.getTabAt(0).select();
    }
}
