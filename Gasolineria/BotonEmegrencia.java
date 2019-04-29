/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gasolineria;

/**
 *
 * @author YesicaIrasema
 */
public class BotonEmegrencia {
    boolean precionar;

    public BotonEmegrencia(boolean precionar) {
        this.precionar = precionar;
    }
    public BotonEmegrencia() {
        this.precionar = true;
    }
    
    public void paroDeEmergencia(){
        if (precionar==true) {
            System.out.println("▲▼▲▼▲▼▲▼▲  ¡Se detuvieron todos los suministros!  ▲▼▲▼▲▼▲▼▲");
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
            System.out.println("Llame a quien corresponda parra arreglar la situación y resguardese...");
        }
    }
    
    
}
