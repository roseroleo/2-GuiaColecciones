/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Pais;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/*
El programa pedirá un país en un bucle, se guardará el país en el
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
public class ServicioPais {

    TreeSet<Pais> listaPais = new TreeSet<>(Pais.ordenarNombre);
    Scanner lr = new Scanner(System.in);

    //Ingresar datos de la lista
    public void ingresarPais() {
        System.out.println("Ingrese un pais");
        String nombre = lr.nextLine();
        Pais p1 = new Pais(nombre);
        listaPais.add(p1);
    }

    //Eliminar pais
    public void eliminarPais() {
        System.out.println("Ingrese un pais a eliminar");
        String nombre = lr.nextLine();
        Iterator<Pais> it = listaPais.iterator();
        while (it.hasNext()) {
            if (it.next().getNombre().equals(nombre)) {
                it.remove();
            }
        }
    }

    //Imprimir lista
    public void imprimir() {
        for (Pais aux : listaPais) {
            System.out.println(aux.getNombre());
        }
    }
}
