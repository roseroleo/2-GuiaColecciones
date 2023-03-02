/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 * En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno.
 * Se pide toda la información al usuario y ese Alumno se guarda en una lista de
 * tipo Alumno y se le pregunta al usuario si quiere crear otro Alumno o no.
 */
public class servicioAlumno {

    //Almacenar datos del alumno en una lista
    Scanner lr = new Scanner(System.in);

    public void crearAlumno(ArrayList<Alumno> lista) {
        boolean salir = false;
        while (!salir) {
            //Solicitar datos del alumno
            System.out.println("Ingrese el nombre del alumno ");
            String nombre = lr.next();
            ArrayList<Integer> notas = new ArrayList();
            for (int i = 0; i < 3; i++) {
                System.out.println("Ingrese la nota " + (i + 1));
                notas.add(lr.nextInt());
            }
            System.out.println("Desea agrear otro alumno S/N ");
            //crear objeto tipo Alumno para asignarle los datos
            Alumno a1 = new Alumno(nombre, notas);
            if (lr.next().toUpperCase().equals("N")) {
                salir = true;
            }
            //Agregar el nuevo alumno a la lista
            lista.add(a1);
        }
    }

    /*    
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos.  Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
     */

    //Buscar el elemento en la lista y obtener sus notas
    public void buscarNombre(ArrayList<Alumno> lista) {
        System.out.println("Ingres alumno a consultar ");
        String nombre = lr.next();
        //Objeto iterator para recorrer la lista
        Iterator<Alumno> it = lista.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().getAlumnos().contains(nombre)) {
                ArrayList<Integer> notas = lista.get(i).getNotas();
                notaFinal(notas);
            }
            i++;
        }
    }
    public void notaFinal(ArrayList<Integer> notas) {
        int suma = 0;
        for (Integer nota : notas) {
            suma += nota;
        }
        double notaFinal = (double) suma / 3; //Cast para resultado en decimales
        System.out.println("Nota Final = " + notaFinal);
    }
}
