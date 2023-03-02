/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.colecciones_ej06;

import Servicio.ServicioTienda;
import java.util.Scanner;

/*Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.  
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.  
 */
public class Colecciones_Ej06 {

    public static void main(String[] args) {
        Scanner lr = new Scanner(System.in);
        ServicioTienda st = new ServicioTienda();
        //Menu de opciones
        boolean salir = false;
        while (!salir) {
            System.out.println("***** MENU DE OPCIONES *****");
            System.out.println("1 - Agregar producto");
            System.out.println("2 - Modificar precio");
            System.out.println("3 - Eliminar producto");
            System.out.println("4 - Mostrar lista de productos");
            System.out.println("5 - Salir\n");
            int var = lr.nextInt();

            switch (var) {
                case 1:
                    st.agregarProducto();
                    break;
                case 2:
                    st.modificarPrecio();
                    break;
                case 3:
                    st.eliminarProducto();
                    break;
                case 4:
                    st.imprimirLista();
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion no válida");
            }
        }
    }
}
