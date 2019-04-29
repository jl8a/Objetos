/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Casa;

/**
 *
 * @author Juan Ramón Bojorquez
 */
public class Tostadora {
    int tiempo; //En segundos
    boolean estado; //encendida o apagada

    public Tostadora(int tiempo, boolean estado) {
        this.tiempo = tiempo;
        this.estado = estado;
    }
    
    public Tostadora() {
        this.tiempo = 25;
        this.estado = true;
    }
    public void encendida(int tiempo){
        this.estado=true;
        System.out.println("La tostadora esta lista para usarse.");
        
        System.out.println("Debe obtener el tiempo deseado.");
        this.tiempo=tiempo;
    }
    public void apagada() {
        this.estado = false;
        System.out.println("Tostadora apagada.");
    }
    
}
