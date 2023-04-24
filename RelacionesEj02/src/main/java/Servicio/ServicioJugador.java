/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Jugador;
import Entidad.Revolver;

/**
 *
 * @author roser
 */
public class ServicioJugador {

    /*
• disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de 
mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
devuelve true, sino false.  
     */
    public boolean disparo(Revolver r) {
        ServicioRevolver sr = new ServicioRevolver();
        boolean acierto = false;
        if (sr.mojar(r)) {
            acierto = true;
        } 
        else{
            sr.siguienteChorro(r);
        }
        return acierto;
    }
}
