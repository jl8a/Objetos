/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transporte;

/**
 *
 * @author Eliza
 */
public class MotoDeAgua {
    String color,tipo,capacidad,combustible;
    double potencia;
    boolean encendida;

    public MotoDeAgua(String color, String tipo, String capacidad, String combustible, double potencia) {
        this.color = color;
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.combustible = combustible;
        this.potencia = potencia;
    }
    public void Encender(){
        System.out.println("La moto de agua está encendida.");
        encendida=true;
    }
     public void Apagar(){
        System.out.println("La moto de agua está apagada.");
        encendida=false;
    }
    public void Acelerar(){
        System.out.println("Acelerando...");
    }
    public void Frenar(){
        System.out.println("Frenando...");
    }
}
