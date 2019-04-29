/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parque;

/**
 *
 * @author Kevin Guerrero
 */
// Objeto que las personas utilizan para sentarse
public class Banca {

    String material;
    String tamanio;

    public Banca(String material, String tamanio) {
        this.material = material;
        this.tamanio = tamanio;
    }

    //Banca por Default
    public Banca() {
        this.material = "Madera";
        this.tamanio = "3m de largo";
    }
    
    public void armar(){
        System.out.println("Banca armada, ya se puede sentar alguien");
    }
    
    public void destruir(){
        System.out.println("Banca destruida, ya nadie se puede sentar en ella");
    }
}
