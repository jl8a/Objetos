package Restaurante;

import java.util.Scanner;

public class CronómetroDeCocina {
    
    double segundosCronómetro;
    
    public void cuentaRegresiva() throws InterruptedException{
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("¿Cuántos segundos para la cuenta regresiva? ");
        segundosCronómetro = sc.nextDouble(); 
        
        System.out.println("Empezando la cuenta regresiva...");
        for (int i = (int) segundosCronómetro; i > 0; i--) {
            System.out.println((i)+ " segundos.");
            Thread.sleep(1000);
        }
        System.out.println("");
        System.out.println("¡RING RING RING RING RING RING RING RING RING RING RING RING!");
    }
}
