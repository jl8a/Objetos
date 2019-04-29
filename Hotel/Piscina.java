/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hotel;

import java.util.Scanner;

/**
 *
 * @author JAGZ
 * Objeto: Piscina.
 * Descripción: La piscina será del tipo que seleccionen los usuarios, es decir, grande, mediana, etc.
 *              Además de que puedes nadar en la piscina si esta tiene un estado adecuado.
 */
public class Piscina { //atributos

    int cantidad;
    boolean estado;

    //constructor
    public Piscina(int cantidad, boolean estado) {
        this.cantidad = cantidad;
        this.estado = estado;
    }

    //Método 1
    void tipoDePiscina() {
        cantidad = 0;

        System.out.println("¿Cuántos litros tendrá la piscina?");
        Scanner resp = new Scanner(System.in);
        int a = resp.nextInt();

        if (a >= 100) {
            System.out.println("La piscina es muy grande.");
        } else {
            if (a >= 80) {
                System.out.println("La piscina es mediana.");
            } else {
                if (a >= 60) {
                    System.out.println("La piscina es para niÃ±os.");
                } else {
                    if (a < 60) {
                        System.out.println("Esto es un chapoteadero.");
                    }
                }
            }
        }
    }

    //Método 2
    void nadar() {
        estado = false;

        System.out.println("El estado de la piscina es...");
        System.out.println("Â¡Limpio!(Pulsa 1)");
        System.out.println("Sucio...(Pulsa 0)");
        Scanner resp = new Scanner(System.in);
        int a = resp.nextInt();

        if (a != 0) {
            estado = true;
        }

        if (estado == true) {
            System.out.println("Â¡La piscina esta bien, Â¿quieres nadar ahi?");
            System.out.println("Pulsa 1 para si y 0 para no.");
            int b = resp.nextInt();

            if (b != 0) {
                System.out.println("Â¡El agua es grandiosa!");
                System.out.println("Â¿Quieres seguir nadando?");
                System.out.println("Pulsa 1 para si y 0 para no.");
                int c = resp.nextInt();

                if (c != 0) {
                    System.out.println("Nadar demasiado resulta agotador...");
                }
            }
        } else {
            System.out.println("La piscina esta muy sucia...");
            System.out.println("El estado es tan deplorable que no se puede nadar en ella.");
        }
    }

}
