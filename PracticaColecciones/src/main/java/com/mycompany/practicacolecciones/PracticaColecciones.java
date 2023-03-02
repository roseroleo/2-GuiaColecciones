/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.practicacolecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author roser
 */
public class PracticaColecciones {

    public static void main(String[] args) {
        //Crear listas, conjuntos y mapas
        ArrayList<Integer> numerosA = new ArrayList();
        HashSet<Integer> numerosB = new HashSet();
        HashMap<Integer, Character> numerosC = new HashMap();
        //Toma la Lista, el Conjunto y el Mapa del ejemplo y agrega 5 objetos a cada uno.
        for (int i = 0; i < 5; i++) {
            //Agregar elemento a la lista
            numerosA.add(i);
            //Agregar elemento al conjunto
            numerosB.add(i * 2);
            //Agregar elemento al mapa
            numerosC.put(i, (char) (i + 97));
        }
        //Toma la Lista, el Conjunto y el Mapa que hiciste previamente y elimina en cada uno un objeto de
        //cada forma que aprendiste arriba.
        //Remover elemento de una lista
        numerosA.remove(3);
        //remover elemento de un conjunto (borramos el elemento -si esta-
        numerosB.remove(2);
        //Remover elemento de un mapa (borrando la llave)
        numerosC.remove(1);
        System.out.print("ArrayList = " + numerosA + "\n");
        System.out.print("HashSet = " + numerosB + "\n");
        System.out.print("HashMap = " + numerosC + "\n");

        //Recorrer la lista, conjunto o mapa
        System.out.println("Recorriendo listas");
        for (Integer variableVacia1 : numerosA) {
            System.out.println(variableVacia1);
        }
        System.out.println("Recorriendo conjuntos");
        for (Integer variableVacia2 : numerosB) {
            System.out.println(variableVacia2);
        }
        System.out.println("Recorriendo mapa");
        for (Map.Entry<Integer, Character> variableVacia3 : numerosC.entrySet()) {
            System.out.println(variableVacia3.getKey() + " -> " + variableVacia3.getValue());
        }
        //*****OBJETO ITERATOR*****
        //Crear el objeto iterator (LISTAS)
        Iterator<Integer> i1 = numerosA.iterator();
        System.out.println("Elementos de la lista ");
        int c = 1;
        //hasNext(): booleano indica si existen aun elemenos que iterar
        //Recorrer la lista con iterator
        while (i1.hasNext()) {
            //Eliminar un objeto de la lista
            if ((int) i1.next() == 0) {
                System.out.println("Numero a remover " + i1.next());
                i1.remove();
            }
        }
        for (Integer rr : numerosA) {
            System.out.println(rr + "");
        }

//        Crear el objeto iterator (CONJUNTOS)
        System.out.println("Elementos del conjunto ");
        c = 1;
        Iterator i2 = numerosB.iterator();
        while (i2.hasNext()) {
            if ((int) i2.next() == 4) {
                i2.remove();
            }
            //Recorrer la lista con iterator
            System.out.println("Elemento " + (c++) + " = " + (i2.next()));
        }

    }

}
