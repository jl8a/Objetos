/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gasolineria;

import java.util.Scanner;

/**
 *
 * @author MI
 */
public class camarasDeVigilancia {
    boolean activar;
    int numeroCamaras;
   

    public camarasDeVigilancia(boolean activar, int numeroCamaras) {
        this.activar = activar;
        this.numeroCamaras = numeroCamaras;
       
    }

    public camarasDeVigilancia() {
        
    }
   
    public void iniciarVigilancia(){
        if(activar==false){
            System.out.println("Se han activado "+numeroCamaras+" camaras");
        }else{
            System.out.println("Ya estan activadas las "+numeroCamaras+" camaras");
 
        
    }
    }
    public void desactivarVigilancia(){
        if(activar==true){
            System.out.println("Se han desactivado "+numeroCamaras+" camaras");
        }else{
            System.out.println("Ya estan desactivadas las "+numeroCamaras+" camaras");
        }  
    } 
}
