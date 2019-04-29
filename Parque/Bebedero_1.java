/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parque;

/**
 *
 * @author YesicaIrasema
 */
public class Bebedero_1 {
    boolean llave; //para abrir o cerrar el flujo del agua

    public Bebedero_1(boolean llave) {
        this.llave = llave;
    }
    public Bebedero_1() {
        this.llave = true;
    }
    
    public void abrirAgua(){
        if (llave == true) {
            System.out.println("Llave abierta");
        }
    }
    
    public void cerrarAgua(){
        if (llave == false) {
            System.out.println("Llave cerrada");
        }
    }
    
    
    
    
}
