/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Juego;
import Entidad.Jugador;
import Entidad.Revolver;
import java.util.ArrayList;
import java.util.Scanner;

/*
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego
 */
public class ServicioJuego {

    public void llenarJuego(ArrayList<Jugador> jugadores, Revolver r) {
        Juego j = new Juego();
        j.setJugadores(jugadores);
        j.setRevolver(r);
    }

    /*
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar.  Al final del juego, se debe mostrar que jugador se mojó. 
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego. 
     */
    public void ronda(ArrayList<Jugador> jugadores, Revolver r) {
        Scanner lr = new Scanner(System.in);
        ServicioRevolver sR = new ServicioRevolver();
        ServicioJugador sJ = new ServicioJugador();
        int disparos = 0;
        boolean acierto = false;
        while (!acierto && disparos < 6) {
            for (int i = 0; i < jugadores.size(); i++) {
                System.out.println("Presione una tecla para siguiente turno...");
                lr.nextInt();
                System.out.println("Turno de Jugador " + (i + 1));
                if (sJ.disparo(r)) {
                    System.out.println("JUGADOR" + i + " HA PERDIDO !!! ");
                    acierto = true;
                    break;
                } else {
                    disparos++;
                }
            }
        }
    }
}
