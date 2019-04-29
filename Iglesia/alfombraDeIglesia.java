/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iglesia;

import java.util.Scanner;

/**
 *
 * @author JAGZ
 * Objeto: alfombraDeIglesia.
 * Descripción: Una alfombra de la cual puedes escoger su color y decora la sala.
 */
public class alfombraDeIglesia { //atributos
    String color;

    public alfombraDeIglesia(String color) { //Constructor
        this.color = color;
    }
    
    //Método
    void decorar(){
        System.out.println("¿Cuál es el color de la alfombra?");
        Scanner resp0 = new Scanner(System.in);
        String a = resp0.nextLine();
        this.color = a;
        
        System.out.println("¿Quieres extender la alfombra alrededor del pasillo?");
        System.out.println("Pulsa 1 para si y 0 para no.");
        Scanner resp = new Scanner(System.in);
        int b = resp.nextInt();
        resp.nextLine();
        
        if (b == 1) {
            System.out.println("La alfombra " + a + " decora la sala.");
            System.out.println("Se ve bastante bien.");
        }else{
            System.out.println("Preferiste no hacerlo y guardaste el objeto.");
        }
    }
}
