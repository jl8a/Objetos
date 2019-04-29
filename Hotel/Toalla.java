package Hotel;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Toalla {
    String color;
    String tamaño;//s, m 
    String material;
    
    public void limpiar(String tamaño){
        Scanner scan= new Scanner (System.in);
        if (tamaño=="s") {
            System.out.println("Toalla para la cara");
            System.out.println("¿Limpiar cara? \"si\" o \"no\"");
            String resp=scan.nextLine();
            if (resp.equalsIgnoreCase("si")) {
                try {
                    System.out.println("Lavandose la cara...");
                    Thread.sleep(5000);
                    System.out.println("Cara lavada, secando...");
                    Thread.sleep(2500);
                    System.out.println("Listo...");
                } catch (InterruptedException ex) {
                    Logger.getLogger(Toalla.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }else{
            System.out.println("Toalla para el cuerpo");
            System.out.println("¿Bañarse?(para luego secarse con está toalla) \"si\" o  \"no\" ");
            String resp=scan.nextLine();
            if (resp.equalsIgnoreCase("si")) {
                try {
                    System.out.println("Bañandose...");
                    Thread.sleep(6000);
                    System.out.println("Bañado, secando...");
                    Thread.sleep(3000);
                    System.out.println("listo...");
                } catch (InterruptedException ex) {
                    Logger.getLogger(Toalla.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public Toalla(String color, String tamaño, String material) {
        this.color = color;
        this.tamaño = tamaño;
        this.material = material;
    }
    
}
