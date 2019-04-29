/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurante;

import java.util.Scanner;

/**
 *
 * @author Julissa
 */
public class licuadora {
    int potencia;
    boolean encender;
    

    public licuadora(int potencia, boolean encender) {
        this.potencia = potencia;
        this.encender = encender;
        
    }

    public licuadora() {
    }
    Scanner resp = new Scanner(System.in);
    public void nivel(){
        System.out.println("niveles: 1...2...3...4...5...6");
        System.out.println("Ingrese nivel de potencia: ");
        this.potencia = resp.nextInt();
    }
    public void iniciar(){
        if(encender==false){
            System.out.println("Licuando...");
            System.out.println("A una potencia de "+this.potencia);
        }else{
            System.out.println("Ya esta licuando");
        }
        
    }
    public void apagar(){
        if(encender==true){
            System.out.println("Licuadora apagada");
        }else{
            System.out.println("Ya esta apagada");
        }
        
    }
}
