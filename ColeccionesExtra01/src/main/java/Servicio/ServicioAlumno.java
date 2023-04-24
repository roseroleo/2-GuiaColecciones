/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

//import java.text.ParseException;
import Entidad.Alumno;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author roser
 */
public class ServicioAlumno {
//Crear los métodos de A – B -M (Alta – Baja – modificación ) que manipulen los
//objetos de este tipo.

    Scanner lr = new Scanner(System.in);
    ArrayList<Alumno> alumno = new ArrayList();

    public void darAlta() {
        
        alumno.add(new Alumno("uno","1","ecu",new Date()));
        alumno.add(new Alumno("dos","2","chi",new Date(+0)));
        alumno.add(new Alumno("tres","3","arg",new Date(+1)));
        alumno.add(new Alumno("cuatro","4","ven",new Date(30)));
//        boolean agregar = true;
//        while (agregar) {
//            System.out.println("*** INGRESAR ALUMNO ***");
//            System.out.print("Nombre ");
//            String nombre = lr.next();
//            System.out.print("Apellido ");
//            String apellido = lr.next();
//            System.out.print("Nacionalidad  ");
//            String nacionalidad = lr.next();
//            //llamar al metodo ingresarFecha
//            Date fecha = ingresarFecha();
//            //Agregar datos de cada alumno a la lista
//            alumno.add(new Alumno(nombre, apellido, nacionalidad, fecha));
//            System.out.print("Desea seguir agregando S/N ");
//            if (lr.next().equalsIgnoreCase("N")) {
//                agregar = false;
//            }
//        }
    }

    public void darBaja() {
        System.out.println("*** INGRESAR ALUMNO A DAR DE BAJA***");
        System.out.print("Nombre ");
        String baja = lr.next();
        Iterator<Alumno> it = alumno.iterator();
        while (it.hasNext()) {
            if (it.next().getNombre().equals(baja)) {
                it.remove();
            }
        }
    }
    
    public void modificar(){
        System.out.println("*** INGRESAR CRITERIO DE MODIFICACION ***");
        System.out.print("Nombre ");
        String baja = lr.next();
        Iterator<Alumno> it = alumno.iterator();
        while (it.hasNext()) {
            if (it.next().getNombre().equals(baja)) {
                it.remove();
            }
        }
    }

    public Date ingresarFecha() {
        boolean seguir = true;
        Date fecha1 = null;
        while (seguir) {
            System.out.print("Fecha de nacimiento: DD-MM-AAAA  ");
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            String date = lr.next();
//        String date = fecha;
            try {
                fecha1 = formatoFecha.parse(date);
            } catch (Exception e) {
                System.out.println("Fomato invalido");
            }

            if (!formatoFecha.format(fecha1).equals(date)) {
                System.out.println("Fomato invalido");
            } else {
                seguir = false;
            }
        }
        return fecha1;
    }

    public void imprimir() {
        for (Alumno aux : alumno) {
            System.out.println(aux);
        }
    }
}
