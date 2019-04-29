/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Escuela;

/**
 *
 * @author Kevin Guerrero
 */
public class Mesabanco {
    
    String material;
    String tamanio;
    String color;

    public Mesabanco(String material, String tamanio, String color) {
        this.material = material;
        this.tamanio = tamanio;
        this.color = color;
    }
    
    public Mesabanco() {
        this.material = "Madera";
        this.tamanio = "1m de ancho";
        this.color = "Cafe";
    }
    
    public void armar(){
        System.out.println("Se armo el mesabanco");
    }
    
    public void romper(){
        System.out.println("Ya no hay mesabanco");
    }
}
