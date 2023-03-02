/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.collect_ej04;

import Entidad.Pelicula;
import Servicio.servicioPelicula;
import java.util.ArrayList;

/**
 *
 * @author roser
 */
public class Collect_Ej04 {

    public static void main(String[] args) {
        servicioPelicula sp = new servicioPelicula();
        
        ArrayList<Pelicula> listaP = new ArrayList();
        sp.crearPelicula(listaP);
        sp.mostrarPelis(listaP);
//        sp.mostrarPeliMayor1H(listaP);
        sp.mostrarPeliOrdenDuracion(listaP);
//        sp.mostrarPeliOrdenAlfabetico();
        
        System.out.println("Hello World!");
    }
}
