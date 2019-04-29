package Transporte;

import java.util.logging.Level;
import java.util.logging.Logger;

public class patineta {

    String color;
    String tamaño;
    String estado;
    String material;

    public patineta(String color, String tamaño, String estado, String material) {
        this.color = color;
        this.tamaño = tamaño;
        this.estado = estado;
        this.material = material;
    }

    public patineta() {
        this.color = "Verde";
        this.tamaño = "Normal";
        this.estado = "Aceptable";
        this.material = "Madera";
    }

    public void patinar() {
        System.out.println("Empiezas agarando vuelo y comienzas a tener una buena velocidad... ");
        System.out.println("Ya estás patinando...");

    }

    public void detenerse(boolean movimiento) {
        if (movimiento == true) {
            try {
                System.out.println("Comienzas a frenar con el pie para perder la velocidad");
                Thread.sleep(3000);
                System.out.println("Te has detenido.");
            } catch (InterruptedException ex) {
                Logger.getLogger(patineta.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.out.println("Como no te estás moviendo, no hya por que frenar.");
        }
    }

    public void ollie(boolean movimiento) throws InterruptedException {
        if (movimiento == true) {
            System.out.println("Al estar en movimiento intentas un ollie...");
            Thread.sleep(3000);
            System.out.println("Y logras el ollie de una buena manera, genial.");
        } else {
            System.out.println("Haces un ollie y terminas en el mismo sitio");
        }
    }

    public void flip(boolean movimiento) {
           if (movimiento == true) {
               System.out.println("Haces un flip con movimiento. Nada espectacular, pero aceptable.");
        } else {
            System.out.println("Haces un flip y quedas en el mismo lugar");
        }
    }
}
