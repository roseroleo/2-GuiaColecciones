/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.colecciones_ej04;

import Entidad.Pelicula;
import Servicio.ServicioPelicula;
import java.util.ArrayList;

/**
 *
 * @author roser
 */
public class Colecciones_Ej04 {

    public static void main(String[] args) {
        ServicioPelicula sp = new ServicioPelicula();
        ArrayList<Pelicula> listaP = new ArrayList();
        sp.crearPelicula();
        sp.mostrarPelis();
        sp.mostrarPeliMayor1H();
        sp.mostrarPeliOrdenDuracion();
        sp.mostrarPeliOrdenDirector();
        sp.mostrarPeliOrdenTitulo();
        sp.mostrarPeliAlrevez();
    }
}
