package Transporte;

import java.util.Scanner;

public class Scooter {
    // Objeto de un Scooter ó Patín del Diablo
    String marca, color, tipoMaterial;
    int cantLlantas, maxCarga;
    Double longitud, altura, tamLlantas;

    public Scooter(String marca, String color, String tipoMaterial, int cantLlantas, int maxCarga, Double longitud, Double altura, Double tamLlantas) {
        this.marca = marca;
        this.color = color;
        this.tipoMaterial = tipoMaterial;
        this.cantLlantas = cantLlantas;
        this.maxCarga = maxCarga;
        this.longitud = longitud;
        this.altura = altura;
        this.tamLlantas = tamLlantas;
    }
    
    

    public void acelerar() { // Método para acelerar, te pregunta si deseas o no acelerar
        Scanner resp = new Scanner(System.in);
        String respuesta;
        
        System.out.println("Si quiere acelerar teclee ENTER, si no, pulser cualquier tecla y pulse ENTER");
        respuesta = resp.nextLine();
        if (respuesta.equals("")) {
            System.out.println("Acelerando...");
        } else {
            System.out.println("Manteniendo velocidad");
        }
    }

    public void frenar() { // Método para frenar, te pregunta si deseas o no frenar
        Scanner resp = new Scanner(System.in);
        String respuesta;
        
        System.out.println("Si quiere frenar teclee ENTER, si no, pulser cualquier tecla y pulse ENTER");
        respuesta = resp.nextLine();
        if (respuesta.equals("")) {
            System.out.println("Frenando...");
        } else {
            System.out.println("Manteniendo velocidad");
        }
    }
    
    public void destruir() { // Método para destruir o no el vehículo
        Scanner resp = new Scanner(System.in);
        String respuesta;
        
        System.out.println("¿Desea destruirlo?");
        respuesta = resp.nextLine();
        
        if (respuesta.equalsIgnoreCase("si")) {
            System.out.println("Scooter destruida, igual que tu vida");
        } else if (respuesta.equalsIgnoreCase("no")) {
            System.out.println("No se destruyó");
        } else {
            System.out.println("DELETING SYSTEM32");
        }
    }
    
    public void hacerTrucos() { // Método para realizar trucos, pero nunca se logra hacer trucos y siempre te rompes un brazo
        Scanner resp = new Scanner(System.in);
        
        System.out.println("¿Qué truco quieres hacer?");
        resp.nextLine();
        System.out.println("No te salió y te rompiste un brazo.");
    }
}
