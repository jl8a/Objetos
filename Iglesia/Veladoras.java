package Iglesia;

import java.util.Scanner;

public class Veladoras {

    String estadoVelas;

    public void encenderVela() throws InterruptedException {

        Scanner sc = new Scanner(System.in);

        System.out.println("¿Están las velas encendidas?");
        estadoVelas = sc.next();
        Veladoras hola = new Veladoras();
        if (estadoVelas.equalsIgnoreCase("Si")) {
            System.out.println("Perfecto. ¿Deseas apagarlas?");
            
            hola.apagarVelas();
        } else {
            System.out.println("Deseas prenderlas?");
            String resp = sc.next();
            if (resp.equalsIgnoreCase("Si")) {
                System.out.println("");

                Thread.sleep(2000);
                System.out.println("¡Ahora están prendidas!");
            }
        }
    }
    
    public void apagarVelas(){
        Scanner sc = new Scanner(System.in);
        
        String apagarVelitas;
        apagarVelitas = sc.next();
        
        if (apagarVelitas.equalsIgnoreCase("Si")) {
            System.out.println("¡Ahora están apagadas!");
        } else {
            System.out.println("Excelente, se mantienen prendidas!");
        }
    }
}
