/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.ArrayList;

/**
 *
 * @author roser
 */
public class Alumno {
    //Atributos
    private String alumnos;
    private ArrayList<Integer> notas;
    
    //Constructores

    public Alumno(String alumnos, ArrayList<Integer> notas) {
        this.alumnos = alumnos;
        this.notas = notas;
    }
    
    public Alumno(ArrayList<Integer> notas) {
        this.notas = notas;
    }
    
    public Alumno() {
    }
    
    //Getter & Setter

    public String getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String alumnos) {
        this.alumnos = alumnos;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }
    
    //ToString

    @Override
    public String toString() {
        return "Alumno{" + "Nombre = " + alumnos + ", notas = " + notas + '}';
    }
    
}
