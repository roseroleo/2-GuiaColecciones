/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/*Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.  
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
public class ServicioTienda {

    Map<String, Integer> listaProd = new HashMap<>();
    String nombre;
    int precio;
    Scanner lr = new Scanner(System.in);

    //Agregar productos a una lista HashMap
    public void agregarProducto() {
        boolean agregar = true;
        while (agregar) {
            System.out.println("**** PRODUCTOS A AGREGAR ****");
            System.out.print("Producto ");
            nombre = lr.next();
            System.out.print("Precio  ");
            precio = lr.nextInt();
            listaProd.put(nombre, precio);
            System.out.println("\nDesea agregar otro producto? S/N  ");
            if (lr.next().equalsIgnoreCase("N")) {
                agregar = false;
            }
        }
    }

    //Modificar el precio de un producto
    public void modificarPrecio() {
        System.out.println("**** PRODUCTOS A MODIFICAR ****");
        System.out.print("Nombre del producto ");
        nombre = lr.next();
        System.out.print("Nuevo Precio  ");
            precio = lr.nextInt();
        Iterator it = listaProd.keySet().iterator();
        while(it.hasNext()){
            if (it.next().equals(nombre)){
                listaProd.replace(nombre, precio);
            }
        }
    }

    //Eliminar un producto
    public void eliminarProducto(){
        System.out.println("**** PRODUCTOS A ELIMINAR ****");
        System.out.print("Nombre del producto ");
        nombre = lr.next();
        Iterator it = listaProd.keySet().iterator();
        while(it.hasNext()){
            if (it.next().equals(nombre)){
                it.remove();
//                listaProd.remove(it.next());
            }
        }
    }
    
    //Mostrar lista
    public void imprimirLista() {
        System.out.println("Mostrar con forEach");
        for (Entry<String, Integer> aux : listaProd.entrySet()) {
            System.out.println(aux.getKey() + " -- " + aux.getValue());
        }
    }
    

}
