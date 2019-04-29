/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iglesia;

/**
 *
 * @author YesicaIrasema
 */
public class Campanas {
    boolean tocarCampanas;
    int numeroCampanadas;

    public Campanas(boolean tocarCampanas, int numeroCampanadas) {
        this.tocarCampanas = tocarCampanas;
        this.numeroCampanadas = numeroCampanadas;
    }
    
    public Campanas() {
        this.tocarCampanas = false;
        this.numeroCampanadas = 0;
    }
    
    public void sonarCampans(int numeroCampanadas)throws InterruptedException {
        if (tocarCampanas == true) {
            for (int i = 1; i <= numeroCampanadas; i++) {
                System.out.println(" . . . Dong . . . ");
                Thread.sleep(1000);
            }
        }else{
            System.out.println(". . . . . . . . . . . . .");
        }
    }
}
