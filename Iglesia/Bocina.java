/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iglesia;

import java.util.Scanner;

/**
 *
 * @author Juan Ramón Bojorquez
 */
public class Bocina {
    String color;
    int volumen;//nivel del 0 al 10
    boolean estado;

    public Bocina(String color, int volumen, boolean estado) {
        this.color = color;
        this.volumen = volumen;
        this.estado = estado;
    }
    
    public Bocina() {
        this.color = "Negra";
        this.volumen = 0;
        this.estado = false;
    }
    
    public void Estado(){
        if (estado==false) {
            System.out.println("La bocina esta apagada.");
        }else{
            System.out.println("La bocina se encuentra encendida.");
        }
    }
    public void CambiarVolumen(){
        System.out.println("El volumen se encuentra en "+volumen);
        System.out.println("¿Que voluen desea seleccionar?");
        Scanner sc=new Scanner(System.in);
        volumen=sc.nextInt();
    }
}
