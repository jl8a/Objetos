package Gimnasio;

import java.util.Scanner;

public class Discos {

    int peso;//libras
    String Color;
    int cantidad;
    int existencia;//en el gimnasio

    public Discos(int peso, String Color, int cantidad, int existencia) {
        this.peso = peso;
        this.Color = Color;
        this.cantidad = cantidad;
        this.existencia = existencia;
    }

    public Discos() {
        this.peso = 15;
        this.Color = "negro";
        this.cantidad = 2;
        this.existencia = 4;
    }
    
    public void repeticiones(int peso, int cantidad) throws InterruptedException{
        Scanner scan=new Scanner(System.in);
        System.out.println("¿Cuántas repeticones vas ha hacer?");
        int rep=scan.nextInt();
        System.out.println("¿Por cuanto tiempo?");
        int tiempo=scan.nextInt();
        int tiempoPorRep=tiempo/rep;
        for (int i = 1; i <= rep; i++) {
            System.out.println("Repetición número: "+i);
            Thread.sleep(tiempoPorRep);
        }
        System.out.println("Listo, lo lograste. Hiciste "+rep+" numero de repeticones, con "+cantidad+" de discos con un peso por disco de "+peso+" libras.");
    }
    
    public void cargar(int peso, int cantidad){
        Scanner scan=new Scanner(System.in);
        System.out.println("¿Cuántas veces lo(s) vas a cargar?");
        int veces=scan.nextInt();
        for (int i = 1; i <= veces; i++) {
            System.out.println("Repetición número: "+1);
        }
        System.out.println("Listo, terminaste");
        System.out.println("Cargaste una cantidad de "+cantidad+" discos, con un peso por disco de "+peso+" libras." );
        
    }
}
