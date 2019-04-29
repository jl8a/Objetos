package Escuela;

import java.util.Scanner;

public class Marcador {
    // Clase de un marcador para pintarrón o permanente
    
    String marca, color, tipoPunta;
    boolean caducidad, permanente;

    public Marcador(String marca, String color, String tipoPunta, boolean caducidad, boolean permanente) {
        this.marca = marca;
        this.color = color;
        this.tipoPunta = tipoPunta;
        this.caducidad = caducidad;
        this.permanente = permanente;
    }

    public void escribir() throws InterruptedException { // Método usado para escribir algo con el marcador, si está caducado
                                                         // no escribe, y te advierte si es permanente
        Scanner resp = new Scanner(System.in);

        if (caducidad = false) {
            if (permanente = true) {
                System.out.println("CUIDADO, es marcador permanente");
                Thread.sleep(1500);
                System.out.println("¿Qué desea escribir?");
                resp.nextLine();
                System.out.println("Escribiendo...");
                Thread.sleep(1000);
                System.out.println(resp);

            }
        } else {
            System.out.println("El marcador está caducado, no puede escribir");
        }
    }
    
    public void borrar() throws InterruptedException{ // Método que sirve para borrar lo escrito
        if (permanente = true){
            System.out.println("No se puede borrar, lo siento.");
        } else {
            System.out.println("Borrando...");
            Thread.sleep(1000);
            System.out.println("Listo");
        }
    }
    
    public void checarCaducidad(){ // Método que usas para comprobar si funciona el marcador, intentado escribir algo para corroborar
        Scanner resp = new Scanner(System.in);
        
        System.out.println("¿Qué quiere escribir para comprobar si sirve?");
        resp.nextLine();
        
        if (caducidad = true) {
            System.out.println("No se pudo escribir, ya no sirve");
        } else {
            System.out.println(resp);
            System.out.println("Si sirve");
        }
    }

}
