/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gasolineria;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Lavacoches {
    String nombre;
    int cobroVidrios;
    int cobroExterior;
    int cobroCompleto;
    int dineroAcumulado;
    private final Scanner scanner = new Scanner(System.in);
    
    public Lavacoches() {
        System.out.println("¿Cómo se llama joven lavacoches?");
        this.nombre = scanner.nextLine();
        System.out.println("¿Cuánto cobra por limpiar sólo los vidrios?");
        this.cobroVidrios = transformaString();
        System.out.println("¿Cuánto cobra por limpiar el Exterior del auto?");
        this.cobroExterior = transformaString();
        System.out.println("¿Cuánto cobra por limpiar el auto por completo: exterior e interior?");
        this.cobroCompleto = transformaString();
    }

    public Lavacoches(String nombre, int cobroVidrios, int cobroExterior, int cobroCompleto, int dineroAcumulado) {
        this.nombre = nombre;
        this.cobroVidrios = cobroVidrios;
        this.cobroExterior = cobroExterior;
        this.cobroCompleto = cobroCompleto;
        this.dineroAcumulado = dineroAcumulado;
    }
    
    public void lavar() throws InterruptedException { //Pide al lavacoches un paquete especifico de limpieza.
        System.out.println("Claro joven, lavo su coche, nomas especifique qué tratamiento quiere para su auto... \n 1 - Sólo Vidrios \n 2 - Sólo Exteriores (Incluye Vidrios) \n 3 - Exterior e Interior \n Otro número - Nada, gracias.");
        int respuesta = transformaString();
        switch (respuesta) {
            case 1:
                System.out.println("Excelente joven, dejaré los vidrios impecables. \n Van a ser " + this.cobroVidrios + " pesos.");
                this.dineroAcumulado = this.dineroAcumulado + this.cobroVidrios;
                limpiando(1);
                break;
            case 2:
                System.out.println("Excelente joven, limpiaré todo el exterior. \n Van a ser " + this.cobroExterior + " pesos.");
                this.dineroAcumulado = this.dineroAcumulado + this.cobroExterior;
                limpiando(2);
                break;
            case 3:
                System.out.println("Excelente joven, quedará oliendo a flores. \n Van a ser " + this.cobroCompleto + " pesos.");
                this.dineroAcumulado = this.dineroAcumulado + this.cobroCompleto;
                limpiando(3);
                break;
            default:
                System.out.println("Está bien joven, no se preocupe.");
                break;
        }
    }
    
    private void limpiando(int paquete) throws InterruptedException { //Imprime el proceso de limpieza.
        switch(paquete) {
            case 3:
                System.out.println("----------Limpiando Interiores----------------");
                Thread.sleep(3000);
            case 2:
                System.out.println("----------Limpiando Exteriores----------------");
                Thread.sleep(2000);
            case 1:
                System.out.println("------------Limpiando vidrios-----------------");
                Thread.sleep(1000);
                System.out.println("¡LISTO!");
                break;
            default:
                break;
        }
    }
    
    private int transformaString() { //Transforma String a int.
    int respuesta;
    String respString = scanner.nextLine();
    while(!respString.matches("[0-9]+")) {
        System.out.println("Respuesta incorrecta, intente de nuevo.");
        respString = scanner.nextLine();
    }
    respuesta = Integer.parseInt(respString);
    return respuesta;
    }
}
