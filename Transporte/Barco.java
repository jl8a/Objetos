/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transporte;

import java.util.Scanner;

/**
 *
 * @author Acer Notebook
 */
public class Barco {
    String nombre;
    String material;
    double km;
    String estado;
    Scanner sc = new Scanner(System.in);

    public Barco(String nombre, String material, double km, String estado) {
        this.nombre = nombre;
        this.material = material;
        this.km = km;
        this.estado = estado;
    }
        public Barco() {
        this.nombre = " ";
        this.material = "";
        this.km = 86.3;
        this.estado = "Perfecto";
    }
    
    public void Navegar(){
        System.out.println("Usted esta iniciando su viaje.");
        String resp = sc.nextLine();
        System.out.println();
        System.out.println("Navegando");    
}
    
    public void KmRecorridos(double km){
        System.out.println("Los kilometros recorridos son : "+ km);
          
    }
    public void Detenerse(){
        System.out.println("No esta en movimiento, avance.");
    }
    
}