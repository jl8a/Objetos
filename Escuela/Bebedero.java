/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Escuela;

/**
 *
 * @author Juan Ramón Bojorquez
 */
public class Bebedero {
    double altura;//metros
    boolean enfriador;
    String material;
    int numBebederos;

    public Bebedero(double altura, boolean enfriador, String material, int numBebederos) {
        this.altura = altura;
        this.enfriador = enfriador;
        this.material = material;
        this.numBebederos = numBebederos;
    }
    
    public Bebedero() {
        this.altura = 1.20;
        this.enfriador = true;
        this.material = "Metal";
        this.numBebederos = 1;
    }
    
    public void Abrir(){
        System.out.println("El agua esta fluyendo.");
    }
    
    public void Cerrar (){
        System.out.println("Dejo de salir el agua");
    }
    
}
