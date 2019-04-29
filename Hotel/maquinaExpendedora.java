package Hotel;

import java.util.Scanner;

public class maquinaExpendedora {
    // Máquina expendedora que se encuentra generalmente fuera de las habitaciones con distintas 
    String marca;
    String[] sabores;
    int cantSabores, cantTotal, temperatura;
    static int[] precioLata;
    // cantidad de sabores,     cantidad total de latas,    temperatura de la máquina expendedora

    public maquinaExpendedora(String marca, String[] sabores, int cantSabores, int cantTotal, int temperatura, int[] precioLata) {
        this.marca = marca;
        this.sabores = sabores;
        this.cantSabores = cantSabores;
        this.cantTotal = cantTotal;
        this.temperatura = temperatura;
        this.precioLata = precioLata;
    }

    public maquinaExpendedora() {
        this.marca = "sepa";
        this.sabores = null;
        this.cantSabores = 0;
        this.cantTotal = 0;
        this.temperatura = 0;
        this.precioLata = null;
    }

    static void descomponerse() { // Método que sirve para darle una patada a la máquina  y descomponerla :)
        Scanner resp = new Scanner(System.in);
        System.out.println("Escribe PATADA para patearme");
        if (resp.nextLine().equalsIgnoreCase("patada")) {
            System.out.println("F");
        } else {
            System.out.println("gracias");
        }
    }

    static void despachar() throws InterruptedException {
        Scanner lata = new Scanner(System.in);
        System.out.println("¿Qué lata desea?");
        System.out.println("----------------");
        System.out.println("Inserte " + precioLata[Integer.parseInt(lata.nextLine())] + "pesos");
        System.out.println("DESPACHANDO");
        Thread.sleep(1000);
        System.out.println("----");
    }

}
