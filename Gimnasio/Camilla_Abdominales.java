/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gimnasio;

/**
 *
 * @author Juan Ramón Bojorquez
 */
public class Camilla_Abdominales {
    double largo,ancho;

    public Camilla_Abdominales(double largo,double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }
    
    public Camilla_Abdominales() {
        this.largo = 1.6;//metros
        this.ancho = 1;
    }
    
    public void Abrirse(){
        System.out.println("Esta abierta y lista para usarse.");
    }
    
    public void Cerrarse(){
        System.out.println("Esta cerrada y lista para ser guardada.");
    }
    
}
