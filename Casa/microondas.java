package Casa;

import java.util.Scanner;

public class microondas {
    // Horno microondas con menú predefinido para calentar o asignar tu propio tiempo
    String marca, color;
    double capacidad;
    int potencia;

    public microondas(String marca, String color, double capacidad, int potencia) {
        this.marca = marca;
        this.color = color;
        this.capacidad = capacidad;
        this.potencia = potencia;
    }
    
    public microondas() {
        this.marca = "nose";
        this.color = "nose";
        this.capacidad = 0;
        this.potencia = 0;
    }
    
    static void temporizador(int tiempoFaltante) throws InterruptedException{
        // Reloj para terminar de calentarse
        do {
            System.out.println(tiempoFaltante + " segundos");
            tiempoFaltante = tiempoFaltante-1;
            Thread.sleep(1000);
        } while (tiempoFaltante > 0);
        System.out.println("TIN TIN TIIIIIN");
    }
    
    static void calentar() throws InterruptedException {
        System.out.println("Elige una opción");
        System.out.println(".");
        System.out.println(".");
        System.out.println(".");
        Thread.sleep(1000);
        
        System.out.println("¿Qué quieres hacer?");
        System.out.println("PIZZA DESCONGELADA");
        System.out.println("-------------------");
        System.out.println("PALOMITAS");
        System.out.println("-------------------");
        System.out.println("BEBIDAS");
        System.out.println("-------------------");
        System.out.println("RECALENTAR");
        System.out.println("-------------------");
        System.out.println("ELEGIR TIEMPO");
        System.out.println("-------------------");
        System.out.println("elige una opción");
        
        Scanner resp = new Scanner(System.in);
        
        switch (resp.nextLine().toLowerCase()) {
            case "pizza descongelada":
                temporizador(180);
                break;
            case "palomitas":
                temporizador(120);
                break;
            case "bebidas":
                temporizador(60);
                break;
            case "recalentar":
                temporizador(120);
                break;
            case "elegir tiempo":
                System.out.println("¿Cuánto tiempo quieres poner? (en segundos)");
                temporizador(Integer.parseInt(resp.nextLine()));
                break;
            default:
                System.out.println("No es una opción válida");
        }
    }
}
