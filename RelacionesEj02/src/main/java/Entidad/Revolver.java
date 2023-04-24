/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/*Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición 
del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del
tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente. 
 */
public class Revolver {
    private int posTambor;
    private int posAgua;

    public Revolver() {
    }

    public Revolver(int posTambor, int posAgua) {
        this.posTambor = posTambor;
        this.posAgua = posAgua;
    }

    public int getPosTambor() {
        return posTambor;
    }

    public void setPosTambor(int posTambor) {
        this.posTambor = posTambor;
    }

    public int getPosAgua() {
        return posAgua;
    }

    public void setPosAgua(int posAgua) {
        this.posAgua = posAgua;
    }

    @Override
    public String toString() {
        return "Revolver{" + "posicionTambor=" + posTambor + ", posicionAgua=" + posAgua + '}';
    }
    
}
