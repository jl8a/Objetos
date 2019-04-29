/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gasolineria;

/**
 *
 * @author Kevin Guerrero
 */
// Objeto esencial en una gasolinera, que es suritda por una bomba de gas
public class Gasolina {
    double precio;      // Precio por litro
    int cantOctanos;    // Calidad de la gasolina

    public Gasolina(double precio, int cantOctanos) {
        this.precio = precio;
        this.cantOctanos = cantOctanos;
    }
    
    // Gasolina por Default
    public Gasolina() {
        this.precio = 20.07;
        this.cantOctanos = 89;
    }
}
