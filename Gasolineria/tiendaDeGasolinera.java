/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gasolineria;

import java.util.Scanner;

/**
 *
 * @author JAGZ
 * Objeto: tiendaDeGasolinera.
 * Descripción: Puedes conocer la empresa de la tienda, determinar si hay una tienda
 *              y puedes comprar cosas.
 */
public class tiendaDeGasolinera { //atributos

    String empresa;
    int cantProducto;

    //Constructor
    public tiendaDeGasolinera(String empresa, int cantProducto) {
        this.empresa = empresa;
        this.cantProducto = cantProducto;
    }

    //Metodos    
    void IrATienda() {
        System.out.println("¿Hay una tienda o minisuper en la gasolinera?");
        System.out.println("Pulsa 1 para si y 0 para no.");
        Scanner resp = new Scanner(System.in);
        int a = resp.nextInt();

        if (a != 0) {
            System.out.println("¿Reconoces la empresa del minisuper?");
            System.out.println("Escribe el nombre de la empresa.");
            Scanner resp2 = new Scanner(System.in);
            String b = resp2.nextLine();
            empresa = b;

            System.out.println("La empresa se llama " + empresa + ".");
            System.out.println("");

            System.out.println("La tienda tiene muchos productos.");
            System.out.println("¿Cuántos quieres comprar?");
            System.out.println("Escribe la cantidad que desees y en caso de no querer nada, solo coloca un 0.");
            int c = resp.nextInt();
            cantProducto = c;

            if (cantProducto != 0) {
                System.out.println("Compraste " + c + " cosas.");
            } else {
                System.out.println("No compraste nada...");
            }
        }

    }

}
