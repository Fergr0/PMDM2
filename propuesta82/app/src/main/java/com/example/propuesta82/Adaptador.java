package com.example.propuesta82;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class Adaptador extends FragmentStatePagerAdapter {

    private int numTabs;

    public Adaptador(FragmentManager fm, int numTabs) {
        super(fm);
        this.numTabs = numTabs;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;

        switch (position) {
            case 0:
                fragment = new Primero();  // Primer fragmento
                break;
            case 1:
                fragment = new segundo();  // Segundo fragmento
                break;
            case 2:
                fragment = new tercero();  // Tercer fragmento
                break;
        }

        return fragment;
    }

    @Override
    public int getCount() {
        return numTabs;
    }
}
