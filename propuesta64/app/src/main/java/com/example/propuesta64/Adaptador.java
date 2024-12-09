package com.example.propuesta64;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.Objects;

public abstract class Adaptador extends BaseAdapter {

    private ArrayList<?> entradas;
    private int R_layout_IdView;
    private Context contexto;

    public Adaptador(Context contexto, int R_layout_IdView, ArrayList<?> entradas){
        super();
        this.contexto = contexto;
        this.entradas = entradas;
        this.R_layout_IdView = R_layout_IdView;
    }

    public abstract void onEntrada(Object entrada, View view);


    public int getCount(){return entradas.size();}

    public Object getItem(int posicion){return this.entradas.get(posicion);}

    public long getItemId(int posicion){return posicion;}

    public View getView(int posicion, View view, ViewGroup pariente){
        if (view == null){
            LayoutInflater vi = (LayoutInflater) contexto.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = vi.inflate(R_layout_IdView, null);
        }
        onEntrada(entradas.get(posicion), view);
        return view;
    }



}
