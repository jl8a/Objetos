/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gimnasio;

import java.util.Scanner;

/**
 *
 * @author JAGZ 
 * Objeto: bañoDeGimnasio. 
 * Descripción: Los usuarios pueden usar un
 * tipo de baño dependiendo del sexo de la persona.
 */
public class bañoDeGimnasio { //atributos

    boolean estado;
    boolean sexo;

    public bañoDeGimnasio(boolean estado, boolean sexo) { //Constructor
        this.estado = estado;
        this.sexo = sexo;
    }

    //Método
    void usarBaño() {

        System.out.println("¿Eres hombre ó mujer?");
        System.out.println("Pulsa 1 para hombre ó 0 para mujer.");
        Scanner resp = new Scanner(System.in);
        int a = resp.nextInt();
        resp.nextLine();

        if (a == 1) {
            System.out.println("Eres hombre.");
            this.sexo = true;
        } else {
            if (a == 0) {
                System.out.println("Eres mujer.");
                this.sexo = false;
            }
        }

        System.out.println("El baño está...");
        System.out.println("Pulsa 1 para abierto y 0 para cerrado.");
        int b = resp.nextInt();
        resp.nextLine();

        if (b == 1) {
            System.out.println("Abierto.");
            this.estado = true;
        } else {
            if (b == 0) {
                System.out.println("Cerrado.");
                this.estado = false;
            }
        }

        if (estado != false) {
            if (a == 1) {
                System.out.println("Acabas de entrar al baño de hombres");
                System.out.println("...");
                System.out.println("...");
                System.out.println("...");
                System.out.println("Terminaste de usar el baño.");
            } else {
                if (a == 0) {
                    System.out.println("Acabas de entrar al baño de mujeres");
                    System.out.println("...");
                    System.out.println("...");
                    System.out.println("...");
                    System.out.println("Terminaste de usar el baño.");
                }
            }
        }
    }
}
