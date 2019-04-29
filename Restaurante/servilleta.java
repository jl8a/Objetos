/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurante;

import java.util.Scanner;

/**
 *
 * @author JAGZ
 * Objeto: Servilleta.
 * Descripción: Simplemente puedes usar el objeto servilleta para limpiarte.
 */
public class servilleta {

    boolean uso;

    public servilleta(boolean uso) {
        this.uso = uso;
    }

    void limpiarse() {
        System.out.println("¿Quieres usar una servilleta?");
        System.out.println("Presiona 1 para si y 0 para no.");
        Scanner resp = new Scanner(System.in);
        int a = resp.nextInt();

        if (a != 0) {
            uso = true;
            if (uso == true) {
                System.out.println("Usaste la servilleta, tus manos y rostro estan limpios.");
            }
        }
    }
}
