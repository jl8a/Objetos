/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gasolineria;

/**
 *
 * @author Eliza
 */
public class Baño {
    String tipo;
    boolean abierto,limpio;

    public Baño(String tipo, boolean abierto, boolean limpio) {
        this.tipo = tipo;
        this.abierto = abierto;
        this.limpio = limpio;
    }

    
    public boolean abierto(){
        System.out.println("El baño esta abierto.");
        abierto=true;
        return abierto;
    }
      public boolean cerrado(){
        System.out.println("El baño esta cerrado.");
        abierto=false;
        return abierto;
    }
      public boolean limpiar(){
        System.out.println("El baño esta limpio.");
        limpio=true;
        return limpio;
    }
      
}
