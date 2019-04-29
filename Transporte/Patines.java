
package Transporte;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Patines {
    boolean ponerselos;
    String color;
    double medida;
    boolean tipo;//Tipo de patín (true==hilera) o (false==4 ruedas tradicional)

    Scanner resp = new Scanner(System.in);
    
    public Patines(boolean ponerselos, String color, double medida, boolean tipo) {
        this.ponerselos = ponerselos;
        this.color = color;
        this.medida = medida;
        this.tipo = tipo;
    }
    public Patines() {
        this.ponerselos = false;
        this.color = "negros";
        this.medida = 7;
        this.tipo = true;
    }
    
    public void ponersePatines (String color, double medida, boolean ponerselos) throws InterruptedException {
        System.out.println("De que color quiere los patines?: ");
        color = resp.nextLine();
        System.out.println("De que medida ocupa los patines?: ");
        medida = resp.nextDouble();
        System.out.println("Poniendose los patines...");
        Thread.sleep(3000);
        System.out.println("Se ha puesto unos patines " + color + " del numero " + medida);
        this.ponerselos = true;
    }
    
    public void patinar (boolean patinando) throws InterruptedException {
        if (patinando == true);
            if (ponerselos == true) {
                System.out.println("Está empezando a patinar por la banqueta...");
                Thread.sleep(1500);
                System.out.println("¡Está agarrando velocidad!");
                Thread.sleep(1800);
                System.out.println("¡Cuidado con los hoyos!");
            } else {
                System.out.println("Necesita ponerse unos patines para frenar");
        }
    }
    
    public void frenar (boolean patinando) {
        if (patinando == true) {
            try {
                System.out.println("Dejas de patinar y empiezas a perder velocidad");
                Thread.sleep(3000);
                System.out.println("Te has detenido.");
            } catch (InterruptedException ex) {
                Logger.getLogger(Patines.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.out.println("Necesitas patinar para frenar.");
        }
    }
}
