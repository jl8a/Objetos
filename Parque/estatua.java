/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parque;

import java.util.Scanner;

/**
 *
 * @author JAGZ
 * Objeto: estatua.
 * Descripción: Creas una estatua en conmemoración a alguien o a algo.
 */
public class estatua { //atributos
    String material;
    String nombreEstatua;

    public estatua(String material, String nombreEstatua) { //Constructor
        this.material = material;
        this.nombreEstatua = nombreEstatua;
    }
    
    //Método
    void crearEstatua(){
        System.out.println("Escribe a quien quieras conmemorar con esta estatua");
        Scanner resp = new Scanner(System.in);
        String a = resp.nextLine();
        this.nombreEstatua = a;
        
        System.out.println("De acuerdo, iniciemos con la creación.");
        System.out.println("¿Qué material usarás?");
        String b = resp.nextLine();
        System.out.println("");
        
        System.out.println("...");
        System.out.println("La estatua de " + a + " está hecha.");
        System.out.println("El material de " + b + " le queda muy bien, le da una vista interesante.");
    }
}
