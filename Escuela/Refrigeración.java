
package Escuela;

import java.util.Scanner;

public class Refrigeración {
    boolean estado;
    boolean encendida;
    double toneladas;
    int temperatura;

    Scanner resp = new Scanner(System.in);
    
    public Refrigeración(boolean estado, boolean encendida, double toneladas, int temperatura) {
        this.estado = estado;
        this.encendida = encendida;
        this.toneladas = toneladas;
        this.temperatura = temperatura;
    }
    
    public Refrigeración() {
        this.estado = false;
        this.encendida = false;
        this.toneladas = 2.5;
        this.temperatura = 24;
    }
    
    public void encender (boolean estado, boolean encendida) throws InterruptedException {
        this.encendida = true;
        if (estado == true) {
            System.out.println("Encendiendo Refrigeración...");
            Thread.sleep(2000);
            System.out.println("¿A que temperatura desea que se enfríe la habitación?: ");
            temperatura = resp.nextInt();
            Thread.sleep(500);
            System.out.println("la temperatura se ha configurado a : " + temperatura + "°C.");
            System.out.println("La habítación se empieza a enfriar...");
            Thread.sleep(5000);
            System.out.println("La temperatura descendió a " + temperatura + "°C.");
        } else {
            System.out.println("La refrigeración necesita mantenimiento para poder funcionar");
        }
    }
    
    public void apagar() {
        System.out.println("La refrigeración se apagará y la temperatura ascenderá");
        this.encendida = false;
    }
    
    public void Mantenimiento (boolean estado, boolean encendida) throws InterruptedException {
        if (encendida == false) {
            if (estado == false) {
                System.out.println("Se comenzará a hacer mantenimiento a la Refrigeración");
                for (int i = 0; i < 4; i++) {
                    System.out.println("pfffft...");
                    Thread.sleep(1000);
                }
                System.out.println("¡Se le ha dado mantenimiento con éxito!");    
                this.estado = true;
            } else {
                System.out.println("A esta refrigeración ya le dieron servicio");
            }
        } else {
            System.out.println("La Refrigeración debe estár apagada para darle mantenimiento");
        }
    }
}
