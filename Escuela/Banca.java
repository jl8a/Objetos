/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Escuela;

/**
 *
 * @author Eliza
 */
public class Banca {//OBJETO PARA SENTARSE
    String color,material,marca,forma;
    double ancho,alto,largo;

    public Banca(String color, String material, String marca, String forma, double ancho, double alto, double largo) {
        this.color = color;
        this.material = material;
        this.marca = marca;
        this.forma = forma;
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
    }
    public void Armar(){//ARMA LA BANCA PARA SER UTILIZADA
        System.out.println("Armando banca...");
        System.out.println("...");
        System.out.println("La banca está armada.");
    }
    
    public void Romper(){// ROMPE LA BANCA 
        System.out.println("...");
        System.out.println("La banca está rota.");
        //banca.dispose();
    }
}
