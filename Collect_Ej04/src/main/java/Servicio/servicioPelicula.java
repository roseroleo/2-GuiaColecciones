/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Servicio;

import Entidad.Pelicula;
import java.util.ArrayList;
//import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author roser
 */
public class servicioPelicula {

    public void crearPelicula(ArrayList<Pelicula> listaP) {
        Scanner lr = new Scanner(System.in);
        //Solicita datos 
        boolean agregar = true;
        while (agregar) {
            System.out.println("*** DATOS DE LA PELICULA A AGREGAR ***");
            System.out.println("Titulo ");
            String titulo = lr.next();
            System.out.println("Director ");
            String director = lr.next();
            System.out.println("Duracion Horas ");
            float duracion = lr.nextFloat();
            //Instanciamos un objeto para asignarle los datos y agregarlo a la lista
            Pelicula pelicula = new Pelicula(titulo, director, duracion);
            listaP.add(pelicula);
            System.out.print("Desea agregar otra pelicula S/N ");
            if (lr.next().equalsIgnoreCase("N")) {
                agregar = false;
            }
        }
    }

//• Mostrar en pantalla todas las películas.
    public void mostrarPelis(ArrayList<Pelicula> listaP) {
        Iterator<Pelicula> it = listaP.iterator();
        System.out.println("Mostrando todas la peliculas");
        int c = 0;
        while (it.hasNext()) {
            System.out.println("Pelicula " + (c++) + it.next());
        }
    }

//• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
    public void mostrarPeliMayor1H(ArrayList<Pelicula> listaP) {
        System.out.println("Mostrando las peliculas con una duración mayor a 1 hora");
        for (Pelicula pelicula : listaP) {
            if (pelicula.getDuracion() > 1) {
                System.out.println("Pelicula " + pelicula);
            }
        }
    }

//• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
//pantalla.
    public void mostrarPeliOrdenDuracion(ArrayList<Pelicula> listaP) {
        System.out.println("Mostrando las peliculas ordenadas por duracion");
        
        //Uso de la funcion LAMBDA para ordenar una lista de objetos
        listaP.sort((Pelicula p1, Pelicula p2) -> p1.getDuracion() > p2.getDuracion());
        for (Pelicula pelicula : listaP) {
            System.out.println("Pelicula " + pelicula);
        }
    }
}

//    public void mostrarPeliOrdenAlfabetico() {
//
//    }
//
//    public void mostrarPeliOrdenDirector() {
//
//    }

//bookList.sort((Books a , Books b) -> a.getAuthor().compareTo(b.getAuthor()));
//        bookList.forEach((s)->System.out.println(s));
