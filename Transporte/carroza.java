/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transporte;

import java.util.Scanner;

/**
 *
 * @author JAGZ
 * Objeto: carroza.
 * Descripción: Puedes usar la carroza si esta tiene un buen estado.
 */
public class carroza { //atributos
    int caballos;
    String tipoDeCarroza;
    boolean estado;
    

    public carroza(int caballos, String tipoDeCarroza, boolean estado) { //Constructor
        this.caballos = caballos;
        this.tipoDeCarroza = tipoDeCarroza;
        this.estado = estado;
    }
    
    //Método 
    void revisarYConducir(){
        System.out.println("¿Qué tipo de carroza es la que tienes?");
        Scanner resp0 = new Scanner(System.in);
        String a = resp0.nextLine();
        this.tipoDeCarroza = a;
        
        System.out.println("¿La carroza tiene 2 caballos?");
        System.out.println("Pulsa 1 para si y 0 para no");
        Scanner resp = new Scanner(System.in);
        int b = resp.nextInt();
        resp.nextLine();
        
        if (b == 1) {
            System.out.println("La carroza " + a + " cuenta con los 2 caballos, por lo tanto, puedes transportarte en ella.");
            this.estado = true;
        }else{
            System.out.println("A la carroza " + a + " le faltan 2 caballos...");
            this.estado = false;
        }  
        
        
        if (estado == true) {
            System.out.println("El vehículo está listo para ser usado, ¿quieres conducirlo?");
            System.out.println("Pulsa 1 para si y 0 para no");
            int c = resp.nextInt();
            resp.nextLine();
            
            if (c == 1) {
                System.out.println("La carroza " + a + " avanza muy lento.");
            }
        }
    }
    
  }
