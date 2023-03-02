/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.colecciones_ej05;

import Entidad.Pais;
import Servicio.ServicioPais;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

/*
Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente) 
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto. 
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.
 */
public class Colecciones_Ej05 {

    public static void main(String[] args) {
        Scanner lr = new Scanner(System.in);
        ServicioPais s1 = new ServicioPais();
//        HashSet<Pais> listaPais = new HashSet();
        boolean seguir = true;
        while (seguir) {
            s1.ingresarPais();
            System.out.println("Desea continuar S/N ");
            if (lr.next().equalsIgnoreCase("N")) {
                seguir = false;
            }
        }
        s1.imprimir();
        s1.eliminarPais();
        s1.imprimir();
    }
}
