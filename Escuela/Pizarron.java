package Escuela;


import java.util.Scanner;

public class Pizarron {
    String tamaño;
    String tipo;
    String estado;
    Scanner sc = new Scanner(System.in);

    public Pizarron() { //Constructor default
        this.tamaño = "grande";
        this.tipo = "blanco";
        this.estado = "limpio";
    }
    
    public Pizarron(String tamaño, String tipo, String estado) { //Constructor personalizado
        this.tamaño = tamaño;
        this.tipo = tipo;
        this.estado = estado;
    }
    
    public void Escribir() throws InterruptedException{ //Metodo que permite escribir en el pizarron
        String materialParaEscribir;
        System.out.println("El pizarron es "+tipo);
        Thread.sleep(1500);
        if (tipo.equalsIgnoreCase("blanco")) {
            materialParaEscribir = "marcadores";
        }else materialParaEscribir = "gises";
        System.out.println("Por lo tanto debes de escribir con "+materialParaEscribir);
        Thread.sleep(1500);
        if (estado.equalsIgnoreCase("limpio")) {
            System.out.println("El pizarron esta limpio y puedes comenzar a escribir");
            String escrito = sc.nextLine();
        }else System.out.println("El pizarron esta sucio, primero limpielo");
    }
    
    public void Limpiar() throws InterruptedException{ //Metodo para limpiar el pizarron
        if (estado.equalsIgnoreCase("sucio")) {
            System.out.println("Vamos a limpiar el pizarron");
            Thread.sleep(1500);
            System.out.println("¿Tienes un borrador?");
            String resp = sc.nextLine();
            boolean borrador;
            if (resp.equalsIgnoreCase("si")) {
                borrador = true;
            }else borrador = false;
            if (borrador == true) {
                System.out.println("Muy bien, puedes comenzar a borrar");
                Thread.sleep(2000);
                System.out.println("Has limpiado el pizarron");
            }else System.out.println("No tienes borrador, consigue uno");
        }else System.out.println("El pizarron ya esta limpio, no es necesario limpiarlo");
    }
}
