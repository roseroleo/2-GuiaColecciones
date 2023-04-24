/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList. 
 */
public class ServPerro {

    private ArrayList<String> razas = new ArrayList();

    //Solicitar datos de la nueva raza
    Scanner lr = new Scanner(System.in);

    public void crearRaza() {
        boolean salir = false;
        String raza;
        int cont = 0;
        do {
            cont++;
            System.out.println("Agregar raza del perro " + cont + " o [S] para salir : ");
            raza = lr.nextLine();
            razas.add(raza);
            if (raza.toUpperCase().equals("S")) {
                razas.remove(razas.size() - 1);
                System.out.println("Lista inicial...");
                imprimir(razas);
                salir = true;
            }
        } while (!salir);
    }

    /*
Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista.  Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.*/
    public void eliminarRaza(ServPerro sp1) {
        ArrayList<String> raza = sp1.razas;
        Iterator item = raza.iterator();
        boolean eliminado = false;
        System.out.println("Raza a eliminar?");
        String razaEliminar = lr.next();
        while (item.hasNext() && !eliminado) {
            if (item.next().equals(razaEliminar)) {
                item.remove();
                eliminado = true;
            }
        }
        if (eliminado) {
            System.out.println("Lista final...");
            imprimir(raza);
        } else {
            System.out.println("La raza no se encuentra en la lista");
            imprimir(raza);

        }
    }

    //Imprimir 
    public void imprimir(ArrayList<String> lista) {
        Collections.sort(lista);
        for (String r1 : lista) {
            System.out.println(r1);
        }

    }
}
