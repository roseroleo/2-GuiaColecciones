/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.Comparator;

/**
 *
 * @author roser
 */
public class Pelicula implements Comparable<Pelicula> {

    private String titulo;
    private String director;
    private float duracion;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, float duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
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

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "\n  titulo=" + titulo + "\n  director=" + director + "\n  duracion=" + duracion;
    }

    @Override
    public int compareTo( Pelicula p1) {
        return this.titulo.compareTo(p1.titulo);
//        int resp = 0;
//        if (this.duracion > p2.getDuracion()) {
//            resp = 1;
//        } else if (this.duracion < p2.getDuracion()) {
//            resp = -1;
//        } else{
//            resp =0;
//        }
//        return resp;
    }
    
    public static Comparator<Pelicula> ordenarXTitulo = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p2.getTitulo().compareTo(p1.getTitulo());
        }
    };

}
