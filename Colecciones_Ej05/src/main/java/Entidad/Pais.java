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
public class Pais {

    private String nombre;

    public Pais() {
    }

    public Pais(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static Comparator<Pais> ordenarNombre = new Comparator<Pais>() {
        @Override
        public int compare(Pais p1, Pais p2) {
            return p1.getNombre().compareTo(p2.getNombre());
        }
    };
}

