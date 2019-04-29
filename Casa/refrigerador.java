/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Casa;

import java.util.Scanner;

/**
 *
 * @author JAGZ
 * 
 * Objeto: Refrigerador.
 * Descripción: El refrigerador permite almacenar comida común ó fría y además puede personalizarse. 
 * 
 */
public class refrigerador {

    boolean energia;
    String tamaño;
    String color;

    //Constructor
    public refrigerador(boolean energia, String tamaño, String color) {
        this.energia = energia;
        this.tamaño = tamaño;
        this.color = color;
    }

    /*Éste es el primer método que tiene el objeto y recomiendo que sea el primero que el usuario llame. 
    El método pregunta por tamaño y color del objeto, además del estado el cual nos ayudará a ver si se hace el segundo método. 
    */
    public void personalizarRefrigerador() {
        System.out.println("¿Tu refrigerador está conectado?");
        System.out.println("Presiona \"SI\" ó \"NO\".");
        Scanner resp = new Scanner(System.in);
        String a = resp.nextLine();
        
        if (a.equalsIgnoreCase("si")) {
            this.energia = true;
            System.out.println("Perfecto, entonces tu refrigerador funciona.");
        } else {
            if (a.equalsIgnoreCase("no")) {
                this.energia = false;
                System.out.println("El refrigerador está apagado...");
            }
        }
        
        System.out.println("");
        System.out.println("...");
        System.out.println("Ahora que ya conocemos el estado del objeto, pasemos a lo siguiente.");
        System.out.println("¿El refrigerador es grande, mediano ó chico?");
        this.tamaño = resp.nextLine();
        
        System.out.println("...");
        System.out.println("¿Cuál es su color?");
        this.color = resp.nextLine();
        
        System.out.println("...");
        System.out.println("...");
        System.out.println("De acuerdo, tu refrigerador es " + tamaño + ", de color " + color + " y se encuentra " );
        
        if (energia == true) {
            System.out.print("encendido.");
            System.out.println("");
        }else{
            System.out.print("apagado."); 
            System.out.println("");
        }
        
        System.out.println("");
        System.out.println("");
    }

    //Éste es el segundo método.
    public void guardar() {
        if (energia == true) {
            System.out.println("¿Quieres guardar algún alimento en el refrigerador?");
            System.out.println("Presiona \"SI\" ó \"NO\".");
            Scanner resp = new Scanner(System.in);
            String a = resp.nextLine();
            System.out.println("");
            
            if (a.equalsIgnoreCase("si")) {

                System.out.println("Muy bien, ¿qué alimento te gustaría almacenar?");
                System.out.println("¿comida normal ó comida fría?");
                System.out.println("Escribe \"N\" para comida normal ó \"F\" para comida fria.");
                String b = resp.nextLine();

                if (b.equalsIgnoreCase("n")) {
                    System.out.println("Se ha guardado comida en el refrigerador.");
                } else {
                    if ((b.equalsIgnoreCase("f"))) {
                        System.out.println("Se ha guardado comida en el congelador.");
                    }
                }
            }
        }
    }

}
