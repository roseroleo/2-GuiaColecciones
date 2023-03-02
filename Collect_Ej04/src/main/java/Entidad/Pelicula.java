/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author roser
 */
public class Pelicula {

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

    //Crear metodo toString para mostrar los elementos de la lista
    @Override
    public String toString() {
        return "\n  titulo=" + titulo + "\n  director=" + director + "\n  duracion=" + duracion;
    }
    
    //Implementar metodos abstractos de la interfaz Comparable
//    @Override
//    public int compareTo(Pelicula p) {
//        return this.director.compareTo(p.getDirector());
//    }
}
