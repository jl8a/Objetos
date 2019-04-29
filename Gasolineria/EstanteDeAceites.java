/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gasolineria;

/**
 *
 * @author Juan Ramón Bojorquez
 */
public class EstanteDeAceites {
    String color;
    double altura;
    int cantNiveles, cantDeAceites;

    public EstanteDeAceites(String color, double altura, int cantNiveles,int cantDeAceites) {
        this.color = color;
        this.altura = altura;
        this.cantNiveles = cantNiveles;
        this.cantDeAceites = cantDeAceites;
    }
    
    public EstanteDeAceites() {
        this.color = "Blanco";
        this.altura = 1.40;
        this.cantNiveles = 5;
        this.cantDeAceites=60;
    }
    
    public void SostenerArticulos(){
        System.out.println("Se muestran los aceites.");
    }
    
    public void rellenar(){
        if (cantDeAceites==0){
            System.out.println("La estanteria necesita ser rellenada.");
        }
    }
}
