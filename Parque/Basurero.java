/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parque;

/**
 *
 * @author Eliza
 */
public class Basurero {
    String color,material,tipo;
    double largo,ancho,alto;
    boolean lleno=false;

    public Basurero(String color, String material, String tipo, double largo, double ancho, double alto) {
        this.color = color;
        this.material = material;
        this.tipo = tipo;
        this.largo = largo;
        this.ancho = ancho;
        this.alto = alto;
    }
 
    public void Vaciar(){
        System.out.println("El basurero ahora está vacío.");
        lleno=false;
    }
    public void Llenar(){
        System.out.println("El basurero ahora tiene basura.");
        lleno=true;
    }
    
}
