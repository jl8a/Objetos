package Transporte;

import java.util.Scanner;

public class CamionDeCarga {
    
    String marca;
    String color;
    double velocidadMaxima;
    double capacidadMaximaTN;
    double precioKm;
    double distanciaRecorrida;
    double toneladas;

    public CamionDeCarga(String marca, String color, double velocidadMaxima, double capacidadMaximaTN, double precioKm, double distanciaRecorrida, double toneladas) {
        this.marca = marca;
        this.color = color;
        this.velocidadMaxima = velocidadMaxima;
        this.capacidadMaximaTN = capacidadMaximaTN;
        this.precioKm = precioKm;
        this.distanciaRecorrida = distanciaRecorrida;
        this.toneladas =  toneladas;
    }
    
    public CamionDeCarga() {
        this.marca = "Patito";
        this.color = "Verde Shrek";
        this.velocidadMaxima = 120;
        this.capacidadMaximaTN = 8;
        this.precioKm = 50;
        this.distanciaRecorrida = 100;
        this.toneladas = 1;
    }
    
    public void selecciónCamión(){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Marca del camión: ");
        marca = sc.nextLine();
        System.out.println("");
        
        System.out.println("Color del camión: ");
        color = sc.next();
        System.out.println("");
        
        System.out.println("====================================================");
        System.out.println("Ficha de información del camión: ");
        System.out.println("Marca: " + marca);
        System.out.println("");
        
        System.out.println("Color: " + color);
        System.out.println("");
        
        System.out.println("Velocidad máxima: " + velocidadMaxima + " km/h.");
        System.out.println("");
        
        System.out.println("Capacidad máxima de transporte en toneladas: " + capacidadMaximaTN + ".");
        System.out.println("");
        
        System.out.println("Precio por kilómetro: " + precioKm + " MN.");
        
        System.out.println("====================================================");
    }
    
    public void transporteCamión() throws InterruptedException{
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("****************************************************");
        System.out.println("TRANSPORTE:" + "\n");
        System.out.println("¿Cuántos kilómetros se van a recorrer?");
        distanciaRecorrida = sc.nextDouble();
        
        System.out.println("Carga a transportar en toneladas: ");
        toneladas = sc.nextDouble();
        
        double capacidadFinal = capacidadMaximaTN - toneladas;
        
        if (toneladas <= 8) {
            
            Thread.sleep(2000);
            System.out.println("Bien, estás dentro del rango permitido." + " " + "Tu rango de capacidad de sobra es: " + capacidadFinal);
            System.out.println("");
            System.out.println("=====Ficha de información del viaje=====");
            System.out.println("Marca del camión: " + marca);
            System.out.println("");
            System.out.println("Color del camión: " + color);
            System.out.println("");
            System.out.println("Kilómetros a recorrer: " + "\n" + distanciaRecorrida);
            System.out.println("");
            System.out.println("El precio del viaje es: " + (distanciaRecorrida*precioKm));
            
        } else {
            System.out.println("El transporte no se puede realizar.");
        }
        
        
    }
    
}
