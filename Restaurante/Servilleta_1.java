/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurante;

/**
 *
 * @author Juan Ramón Bojorquez
 */
public class Servilleta_1 {
    
    boolean utilizada;
    String color;
    double largo,ancho;//cm

    public Servilleta_1(boolean utilizada, String color, double largo, double ancho) {
        this.utilizada = utilizada;
        this.color = color;
        this.largo = largo;
        this.ancho = ancho;
    }
    
    public Servilleta_1() {
        this.utilizada = false;
        this.color = "blanca";
        this.largo = 20;
        this.ancho = 15;
    }
    
    public void Utilidad(){
        if (utilizada=false) {
            System.out.println("Aun puede ser usada.");
        }else{
            System.out.println("Esta servilleta ya fue usada.");
        }
    }
}
