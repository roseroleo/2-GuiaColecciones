/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.colec_ej01;

import Servicio.ServPerro;
import java.util.Scanner;

/**
 *
 * @author roser
 */
public class Colec_Ej01 {

    public static void main(String[] args) {
        Scanner lr = new Scanner(System.in);
        ServPerro sP = new ServPerro();
        sP.crearRaza();
        sP.eliminarRaza(sP);

    }
}
