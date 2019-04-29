/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurante;

/**
 *
 * @author Kevin Guerrero
 */ 
// Objeto para depositar la basura, y saber si este es un Bote de Basura reciclable o no
public class BoteBasura {

    double capacidad;   // El total de kg que puede contener el Bote
    String material;    // Material del que esta hecho
    boolean reciclable; // true si lo que va dentro de el se recicla, false para no

    public BoteBasura(double capacidad, String material, boolean reciclable) {
        this.capacidad = capacidad;
        this.material = material;
        this.reciclable = reciclable;
    }

    // Bote de Basuta por Default
    public BoteBasura() {
        this.capacidad = 10;
        this.material = "Plastico";
        this.reciclable = true;
    }
    
    public void vaciar(){
        System.out.println("*Ya no tengo basura dentro*");
    }
}
