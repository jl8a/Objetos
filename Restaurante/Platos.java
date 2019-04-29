package Restaurante;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Platos {

    String tamaño;
    String color;
    String tipo;
    String forma;
    String material;

    public void servirComida(String tipo) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("¿Cuál comida se va ha servir?");
            String comida=scan.nextLine();
            System.out.println("¿Qué tipo de plato se usará?");
            tipo = scan.nextLine();
            System.out.println("Sirviendo...");
            Thread.sleep(5000);
            System.out.println("Servido");
        } catch (InterruptedException ex) {
            Logger.getLogger(Platos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Platos(String tamaño, String color, String tipo, String forma, String material) {
        this.tamaño = tamaño;
        this.color = color;
        this.tipo = tipo;
        this.forma = forma;
        this.material = material;
    }
}
