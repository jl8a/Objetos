/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iglesia;

/**
 *
 * @author Eliza
 */
public class Vela {
    double ancho, largo, alto;
    String color,material;
    boolean encendida=false;

    public Vela(double ancho, double largo, double alto, String color, String material) {
        this.ancho = ancho;
        this.largo = largo;
        this.alto = alto;
        this.color = color;
        this.material = material;
    }
    public void Encender(){
        System.out.println("La vela está encendida.");
        encendida=true;
    }
     public void Apagar(){
        System.out.println("La vela está apagada.");
        encendida=false;
    }
}
