/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Revolver;

/**
 *
 * @author roser
 */
public class ServicioRevolver {

    //• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
    //deben ser aleatorios.
    public Revolver llenarRevolver() {
        Revolver r = new Revolver();
        int pT = (int) (Math.random() * 6); //Random va desde 0 a 5
        int pA = (int) (Math.random() * 6);
        r.setPosTambor(pT);
        r.setPosAgua(pA);
        return new Revolver(pT, pA);
    }

    //• mojar(): devuelve true si la posición del agua coincide con la posición actual
    public boolean mojar(Revolver r) {
        boolean mojado = false;
        if (r.getPosTambor() == r.getPosAgua()) {
            mojado = true;
        }
        return mojado;
    }

    //• siguienteChorro(): cambia a la siguiente posición del tambor
    public void siguienteChorro(Revolver r) {
        int actual = r.getPosTambor();
        if (actual == 5) {
            r.setPosTambor(0);
        } else {
            r.setPosTambor(actual + 1);
        }
        System.out.println("Posicion del tambor... "+r.getPosTambor());
    }
}
