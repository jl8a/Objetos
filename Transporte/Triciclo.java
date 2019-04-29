/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transporte;

import java.util.Scanner;

/**
 *
 * @author Juan Ramón Bojorquez
 */
public class Triciclo {
    boolean frenos;
    boolean movimiento, electrico;
    Scanner sc=new Scanner(System.in);

    public Triciclo( boolean frenos, boolean movimiento, boolean electrico) {
        this.frenos = frenos;
        this.movimiento = movimiento;
        this.electrico = electrico;
    }
    
    public Triciclo() {
        this.frenos = false;
        this.movimiento = true;
        this.electrico = false;
    }
    
    public void Movimiento (){
        System.out.println("¿El triciclo es electrico?");
        String resp=sc.nextLine();
        if (resp.equalsIgnoreCase("Si")) {
            System.out.println("Utiliza el acelerador");
        }else{
            System.out.println("Tienes que pedalear");
        }
    }
    
    @SuppressWarnings("DeadBranch")
    public void Detener(){
        if (movimiento=true) {
            if (frenos=true) {
                System.out.println("Utiliza tus frenos para detenerte.");
            }else{
                System.out.println("Utiliza otro metodo con el que puedas detenerte.");
            }
        }
    }
}
