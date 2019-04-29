/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hotel;

/**
 *
 * @author Eliza
 */
public class Espejo {
    double largo,ancho;
    String marca;

    public Espejo(double largo, double ancho, String marca) {
        this.largo = largo;
        this.ancho = ancho;
        this.marca = marca;
    }
     public Espejo() {
        this.largo = 2;
        this.ancho = 3;
        this.marca = "x";
    }
    public void Romper(){
        System.out.println("El espejo ahora está roto.");
        espejo=null;
    }
    Espejo espejo= new Espejo();
}
