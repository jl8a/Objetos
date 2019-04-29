/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gimnasio;

import java.util.Scanner;

/**
 *
 * @author MI
 */
public class prensaPiernas {
    double peso;
    boolean desarmar;
    boolean armar;
    
   // Scanner resp = new Scanner(System.in);
    
    public prensaPiernas() {
    }

    public prensaPiernas(double peso, boolean armar) {
        this.peso = peso;
        this.desarmar = armar;
    }
    public void armarEquipo() throws InterruptedException{
        if(armar==true){
            System.out.println("Armando equipo, aguarde un momento...");
            Thread.sleep(1500);
            System.out.println("Listo para usarse");
        }else{
            System.out.println("Equipo esta desarmado");
        }      
    }
    public void desarmarEquipo() throws InterruptedException{
        if(desarmar==true){
            System.out.println("Desarmando equipo, aguarde un momento...");
            Thread.sleep(1500);
            System.out.println("Listo!");
        }else{
            System.out.println("Equipo esta armado");
        }  
    }
    public void estadoPeso(){
        System.out.println("Peso asignado: "+peso);
    }
}
