/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gimnasio;

import java.util.Scanner;

/**
 *
 * @author Eliza
 */
public class CuerdaParaSaltar {
    double largo;//metros
    String material,color;
    boolean rota;

    public CuerdaParaSaltar(double largo, String material, String color) {
        this.largo = largo;
        this.material = material;
        this.color = color;
    }
      public CuerdaParaSaltar() {
        this.largo = 0;
        this.material = "x";
        this.color = "x";
    }
    public void Girar() throws InterruptedException{
        System.out.println("¿Cuantas veces desea saltar la cuerda?");
        Scanner sc=new Scanner(System.in);
        int girar=sc.nextInt();
        for (int i = 0; i < girar; i++) {
            System.out.println("Salto n°: "+(i+1));
            Thread.sleep(1000);
        }       
        System.out.println(":)");
    }
    public void Romper() throws InterruptedException{
        System.out.println("Rompiendo la cuerda...");
        Thread.sleep(2000);
        rota=true;
        System.out.println("Cuerda rota: "+rota);
    }
}
