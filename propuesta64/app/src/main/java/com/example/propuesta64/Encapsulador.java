package com.example.propuesta64;

public class Encapsulador {
    private int imagen;
    private String titulo;
    private String texto;
    private boolean dato1;

    public Encapsulador(int imagen, String titulo, String texto, boolean dato1){
        this.imagen = imagen;
        this.titulo = titulo;
        this.texto = texto;
        this.dato1 = dato1;
    }

    public int getImagen() {
        return imagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getTexto() {
        return texto;
    }

    public boolean getDato1() {
        return dato1;
    }
}
