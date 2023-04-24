/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Pelicula;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.stream.*;
import java.util.Scanner;
import java.util.Comparator;

/**
 *
 * @author roser
 */
//En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
//todos sus datos y guardándolos en el objeto Pelicula.
//Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
//crear otra Pelicula o no.
public class ServicioPelicula {

    ArrayList<Pelicula> listaP = new ArrayList();
    Scanner lr = new Scanner(System.in);

    public void crearPelicula() {
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
//• Mostrar en pantalla todas las películas. ***USAMOS UN ITERATOR***

    public void mostrarPelis() {
        Iterator<Pelicula> it = listaP.iterator();
        System.out.println("Mostrando todas la peliculas");
        int c = 0;
        while (it.hasNext()) {
            System.out.println("Pelicula " + (c++) + it.next());
        }
    }
//• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
// *** USAMOS UN BUCLE FOREACH PARA RECORRER LA LISTA***

    public void mostrarPeliMayor1H() {
        System.out.println("Mostrando las peliculas con una duración mayor a 1 hora");
        for (Pelicula e : listaP) {
            if (e.getDuracion() > 1) {
                System.out.println("Pelicula " + e);
            }
        }
    }
//• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
//pantalla. *** USAMOS LA FUNCION LAMBDA PARA ORDENAR LA LISTA DE OBJETOS ***

    public void mostrarPeliOrdenDirector() {
        System.out.println("Mostrando las peliculas ordenadas por director");
        listaP.sort((Pelicula p1, Pelicula p2) -> p1.getDirector().compareTo(p2.getDirector()));
        listaP.forEach((pelicula) -> System.out.println(pelicula));
    }

    //• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
//pantalla. ****UTILIZAMOS INTERFAZ COMPARATOR PARA ORDERNAR LA LISTA DE OBJETOS****
    public void mostrarPeliOrdenDuracion() {
        System.out.println("Mostrando las peliculas ordenadas por duracion");
        //Interfaz Comparator para ordenar la lista 
        Collections.sort(listaP, new Comparator<Pelicula>() {
            //Implementarmos metodos abstractos y logica de comparacion   
            @Override
            public int compare(Pelicula p1, Pelicula p2) {
                int resp = 0;
                if (p1.getDuracion() > p2.getDuracion()) {
                    resp = 1;
                } else if (p1.getDuracion() < p2.getDuracion()) {
                    resp = -1;
                } else {
                    resp = 0;
                }
                return resp;
            }
        });
        //Uso de un FOREACH corto para mostrar la pelicula
        listaP.forEach((pelicula) -> System.out.println(pelicula));
    }
// • Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
// *** USAMOS LA INTERFAZ COMPARABLE ***

    public void mostrarPeliOrdenTitulo() {
        System.out.println("Mostrando las peliculas ordenadas por titulo");
        //Implementamos interfaz Comparable en la Entidad, para ordenar la lista
        Collections.sort(listaP);
        listaP.forEach((pelicula) -> System.out.println(pelicula));
    }
    
    public void mostrarPeliAlrevez(){
        System.out.println("Mostrando las peliculas ordenadas por titulo Z -> A");
        Collections.sort(listaP, Pelicula.ordenarXTitulo);
        for (Pelicula peli : listaP) {
            System.out.println(peli);
        }
    }
}
