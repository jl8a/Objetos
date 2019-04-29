/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Escuela;

import java.util.Scanner;

/**
 *
 * @author Julissa
 */
public class Escritorio {
    int numeroCajones;
    int numeroCajon;

    public Escritorio(int numeroCajones, int numeroCajon) {
        this.numeroCajones = numeroCajones;
        this.numeroCajon = numeroCajon;
    }

    public Escritorio() {
    }
    Scanner sc = new Scanner(System.in);
    
    public void abrirCajon(int numeroCajones) throws InterruptedException{
        System.out.println("Se cuenta con "+numeroCajones+" cajones");
        System.out.println("¿Qué cajon quiere abrir?");
        int numeroCajon = sc.nextInt();
        System.out.println("abriendo cajon: "+numeroCajon);
        Thread.sleep(1500);
        System.out.println("Listo!");
    }
    public void armar() throws InterruptedException{
        System.out.println("Armando escritorio...");
        Thread.sleep(1500);
        System.out.println("Listo! ya puede usarse");
    }
    public void desarmar() throws InterruptedException{
        System.out.println("Desarmando escritorio...");
        Thread.sleep(1500);
        System.out.println("Listo!");
    }
    
}
