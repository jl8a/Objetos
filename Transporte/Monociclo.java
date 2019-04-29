/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transporte;

/**
 *
 * @author Kevin Guerrero
 */
// Objeto para transportarse el cual es de solo una persona
public class Monociclo {
    
    boolean electrico;      // true es electrico, false no lo es
    String tamanio;

    public Monociclo(boolean electrico, String tamanio) {
        this.electrico = electrico;
        this.tamanio = tamanio;
    }
    
    // Monociclo por default
    public Monociclo() {
        this.electrico = false;
        this.tamanio = ".75 metros";
    }
    
    public void avanzar(){
        System.out.println("Estoy en movimiento");
    }
    
    public void detener(){
        System.out.println("No estoy en movimiento");
    }
}
