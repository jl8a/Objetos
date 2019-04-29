/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parque;

/**
 *
 * @author Juan Ramón Bojorquez
 */
public class Grifo {
    int altura;
    boolean estado;

    public Grifo(int altura, boolean estado) {
        this.altura = altura;
        this.estado = estado;
    }
    
    public Grifo() {
        this.altura = 50;
        this.estado = true;
    }
    
    public void Estado(){
        if (estado=true) {
            System.out.println("Esta grifo esta abierto.");
        }else{
            System.out.println("El grifo se encuentra cerrado.");
        }
    }
}
