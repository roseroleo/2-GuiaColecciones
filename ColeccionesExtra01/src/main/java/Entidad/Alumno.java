/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.Date;

/*Crea una clase Alumnos, donde tendrá como Atributos el nombre, apellido, la nacionalidad y
su fecha de nacimiento. La nacionalidad podrá ser ARGENTINA – CHILENA – VENEZOLANA
solamente.
 */
public class Alumno {
    private String nombre;
    private String apellido;
    private String nacionalidad;
    private Date fecha;

    public Alumno() {
    }

    public Alumno(String nombre, String apellido, String nacionalidad, Date fecha) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apellido=" + apellido + ", nacionalidad=" + nacionalidad + ", fecha=" + fecha + '}';
    }

    
    
    
}
