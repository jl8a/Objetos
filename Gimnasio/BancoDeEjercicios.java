package Gimnasio;


import java.util.Scanner;

public class BancoDeEjercicios {
    String marca;
    boolean ajustable;
    Scanner sc = new Scanner(System.in);

    public BancoDeEjercicios() { //Constructor default
        this.marca = "athletic";
        this.ajustable = true;
    }
    
    public BancoDeEjercicios(String marca, boolean ajustable) { //Constructor personalizado
        this.marca = marca;
        this.ajustable = ajustable;
    }
    
    public void HacerEjercicio() throws InterruptedException{ //Metodo que permite hacer ejercicio sobre el banco, ademas que se puede ajustar dependiendo de la necesidad del cliente.
        System.out.println("Vamos a hacer ejercicio");
        Thread.sleep(2000);
        System.out.println("¿Ocupas que la banca este inclinada o recta?");
        String resp = sc.nextLine();
        if (resp.equalsIgnoreCase("inclinada")) {
            Thread.sleep(2000);
            System.out.println("Muy bien...");
            Thread.sleep(2000);
            if (!ajustable==false) {
                System.out.println("Ahora puedes ajustarla dependiendo de tu necesidad");
                Thread.sleep(2000);
                System.out.println("¡Listo! puedes realizar tu ejercicio");
            }else System.out.println("El banco no es ajustable, busca un banco que si se pueda para realizar tu ejercicio..."); 
        }else System.out.println("La banca ya se encuentra recta...¡Ya puedes realizar tu ejercicio!");
    }
            
    
}
