package Gimnasio;

import java.util.Scanner;

public class tapeteYoga {
    // Es un tapete de Yoga/Pilates, cuyas propiedades son el tamaño (largo, ancho y grosor)
    // Asi mismo como su color
    
    static double largo, ancho; // Metros
    static int grosor;          // milimetros
    static String color;
    static Scanner resp = new Scanner(System.in);

    public tapeteYoga(double largo, double ancho, int grosor, String color) {
        this.largo = largo;
        this.ancho = ancho;
        this.grosor = grosor;
        this.color = color;
    }

    public tapeteYoga() {
        this.largo = 1.8; // Metros
        this.ancho = 0.3; // Metros
        this.grosor = 6;  // mm
        this.color = "Azul";
    }

    public static void ajustarAnchoLargo() throws InterruptedException {
        // Método para escoger el tamaño del tapete ya sea por los predefinidos o hacer uno personalizado
        System.out.println("Elige el largo y ancho de tu tapete favorito :");
        System.out.println("...");
        System.out.println("1.- Largo: 1.8 m");
        System.out.println("    Ancho: 0.5 m");
        System.out.println("    Grosor: 4 mm");
        System.out.println("2.- Largo: 2.0 m");
        System.out.println("    Ancho: 1.0 m");
        System.out.println("    Grosor: 6 mm");
        System.out.println("3.- Personalizado");

        switch (resp.nextLine()) {
            case "1":
                largo = 1.8;
                ancho = 0.5;
                grosor = 4;
                System.out.println("Elegiste el tapete 1");
                break;
            case "2":
                largo = 2.0;
                ancho = 1.0;
                grosor = 6;
                System.out.println("Elegiste el tapete 2");
                break;
            case "3":
                do {
                    System.out.println("¿De qué largo? (MÁXIMO 3 METROS");
                    System.out.println("                MÍNIMO 0.5 METROS)");
                    largo = Double.parseDouble(resp.nextLine());
                } while (largo > 3 || largo < 0.5);

                System.out.println("El largo es: " + largo + "metros");

                do {
                    System.out.println("¿De qué ancho? (MÁXIMO 1.5 METROS");
                    System.out.println("                MÍNIMO 0.3 METROS)");
                    ancho = Double.parseDouble(resp.nextLine());
                } while (ancho > 3 || ancho < 0.3);

                System.out.println("El ancho es: " + ancho + "metros");

                do {
                    System.out.println("¿De qué grosor? (MÁXIMO 10 MILÍMETROS");
                    System.out.println("                 MÍNIMO 0.4 MILÍMETROS)");
                    grosor = Integer.parseInt(resp.nextLine());
                } while (grosor > 10 || grosor < 0.4);

                System.out.println("El grosor es: " + grosor + "mm");
                break;
            default:
                System.out.println("ERROR, no es ninguna opción");
                break;
        }
    }

    public static void escogerColor() throws InterruptedException {
        // Método donde te pide que escojas un color del tapete en base a los colores disponibles
        System.out.println("¿Qué color quieres?");
        System.out.println("Azul");
        System.out.println("Rojo");
        System.out.println("Rosa");
        System.out.println("Lila");
        System.out.println("Verde");

        switch (resp.nextLine().toLowerCase()) {
            case "azul":
                color = "Azul";
                System.out.println("El color es: " + color);
                break;
            case "rojo":
                color = "Rojo";
                System.out.println("El color es: " + color);
                break;
            case "rosa":
                color = "Rosa";
                System.out.println("El color es: " + color);
                break;
            case "lila":
                color = "Lila";
                System.out.println("El color es: " + color);
                break;
            case "verde":
                color = "Verde";
                System.out.println("El color es: " + color);
                break;
            default:
                System.out.println("No es un color");
                break;
        }
        System.out.println("Su tapete es de largo: " + largo + "metros");
        System.out.println("                ancho: " + ancho + "metros");
        System.out.println("                grosor: " + grosor + "mm");
        System.out.println("Color: " + color);
    }
}
