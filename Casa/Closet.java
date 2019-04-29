/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Casa;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Closet {

    int cantidadropa;
    String puertas;
    int cantidadcajones;
    Scanner sc = new Scanner(System.in);

    public Closet(int cantidadropa, String puertas, int cantidadcajones) {
        this.cantidadropa = cantidadropa;
        this.puertas = puertas;
        this.cantidadcajones = cantidadcajones;
    }

    public Closet() {
        this.cantidadropa = 10;
        this.puertas = "Cerradas";
        this.cantidadcajones = 3;
    }

    public void  abriryconsultar() {
        System.out.println("¿Desea abrir las puertas? si o no");
        puertas = sc.nextLine();
        if (puertas.equalsIgnoreCase("si")) {
            System.out.println("Estan abiertas");
        } else if (puertas.equalsIgnoreCase("no")) {
            System.out.println("Se quedan " + puertas);
            System.exit(0);
        }
        System.out.println("");
        System.out.println("¿Deseas consultar cuantas prendas hay? si o no");
        String resp = sc.nextLine();
        if (resp.equalsIgnoreCase("si")) {
            System.out.println(cantidadropa);
        }
        if (resp.equalsIgnoreCase("no")) {
            System.out.println("Bye");
            System.exit(0);
        }
        System.out.println("");
        System.out.println("¿Desea agregar prendas? si o no");
        String agregar=sc.nextLine();
        if (resp.equalsIgnoreCase("si")) {
            System.out.println("¿Cuantas prendas?");
            int agregarprendas=sc.nextInt();
            cantidadropa=cantidadropa+agregarprendas;
            System.out.println(cantidadropa);
        }
        if (agregar.equalsIgnoreCase("no")) {
            System.out.println("Bye");
            System.exit(0);
        }

    }
}
