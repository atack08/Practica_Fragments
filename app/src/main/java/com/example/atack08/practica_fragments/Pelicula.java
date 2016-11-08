package com.example.atack08.practica_fragments;

/**
 * Created by Atack08 on 08/11/2016.
 */

public class Pelicula {

    private String titulo,director;
    private  int duracion, fecha;

    public Pelicula(String titulo ,String director, int duracion, int fecha) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
        this.fecha = fecha;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }
}
