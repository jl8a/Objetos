package Restaurante;


import java.util.Scanner;

public class Sarten {
    String tamaño;
    String estado;
    Scanner sc = new Scanner(System.in);

    public Sarten() { //Constructor default
        this.tamaño = "pequeño";
        this.estado = "limpio";
    }
    
    public Sarten(String tamaño, String estado) { //Constructor personalizado
        this.tamaño = tamaño;
        this.estado = estado;
    }
    
    public void Cocinar() throws InterruptedException{ //metodo para cocinar algun alimento en el sarten
        if (estado.equalsIgnoreCase("limpio")) {
            System.out.println("Agregue el alimento al sarten");
            String alimento = sc.nextLine();
            System.out.println("Espere unos minutos en los que el "+alimento+" se cocina");
            Thread.sleep(2000);
            System.out.println("¡ "+alimento+" se ha cocinado!");
            estado="sucio";
        }else System.out.println("No se puede cocinar ya que el sarten esta sucio");
    }
    
    public void LavarSarten() throws InterruptedException{ //Metodo para lavar los sartenes que esten sucios
        if (estado.equalsIgnoreCase("sucio")) {
            System.out.println("El sarten esta sucio y se tiene que lavar");
            Thread.sleep(2000);
            System.out.println("Ingrese el sarten al lavavajillas y espere unos momentos");
            Thread.sleep(2000);
            System.out.println("¡El sarten esta limpio!");
            estado="limpio";
        }else System.out.println("No se puede lavar el sarten debido a que ya esta limpio");
    }
    
}
