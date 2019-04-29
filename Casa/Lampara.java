/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Casa;

/**
 *
 * @author Eliza
 */
public class Lampara { //OBJETO PARA ILUMINAR
    String tamaño, color, marca,material,tipo, potenciamax;

    public Lampara(String tamaño, String color, String marca, String material, String tipo,String potenciamax) {
        this.tamaño = tamaño;
        this.color = color;
        this.marca = marca;
        this.material = material;
        this.tipo = tipo;
        this.potenciamax = potenciamax;
    }
    public static void Encender(){//ENCIENDE LA LAMPARA
        System.out.println("La lampara está encencida.");
    }
    public static void Apagar(){//APAGA LA LAMPARA
        System.out.println("La lampara está apagada.");
    }
}
