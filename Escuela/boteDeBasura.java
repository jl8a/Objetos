/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Escuela;

import java.util.Scanner;

/**
 *
 * @author JAGZ 
 * Objeto: boteDeBasura. 
 * Descripción: Dices la cantidad de basura que tienes y tiras la cantidad que quieras
 *              al bote.
 */
public class boteDeBasura { //atributos

    int basura;
    int cantBasura;

    public boteDeBasura(int cantBasura) { //Constructor
        this.cantBasura = cantBasura;
    }

    //Método
    void tirarBasura() {
        System.out.println("¿Tienes basura?");
        System.out.println("Pulsa 1 para si y 0 para no.");
        Scanner resp = new Scanner(System.in);
        int a = resp.nextInt();
        System.out.println("");

        if (a != 0) {
            System.out.println("¿Cuánta basura tienes?");
            System.out.println("Escribe la cantidad.");
            int b = resp.nextInt();
            basura = b;

            System.out.println("");
            System.out.println("Muy bien, ¿Qué tanto quieres tirar al bote de basura?");
            int c = resp.nextInt();
            cantBasura = c;

            if (cantBasura <= basura) {
                int d = basura - cantBasura;

                System.out.println("");
                System.out.println("La cantidad de basura que echaste al bote es: " + cantBasura);
                System.out.println("La basura que te queda es: " + d);
            }
        }
    }
}
