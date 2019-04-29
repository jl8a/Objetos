package Gasolineria;
import java.util.*;

public class terminal {
    
    Scanner sc = new Scanner (System.in);
    
    int firma;
    boolean tarjeta;

    public terminal(int firma, boolean tarjeta) {
        this.firma = firma;
        this.tarjeta = tarjeta;
    }
    
    public terminal() {
        this.firma = 0;
        this.tarjeta = true;
    }
    
    public void TransaccionBancaria(){
            System.out.println("INSERTE TARJETA");
            if (tarjeta) {
                System.out.println("INSERTE FIRMA");
                int firma2 = sc.nextInt();
                if (firma2 == firma) {
                    System.out.println("TRANSFERENCIA HECHA CON ÉXITO");
                }else{
                    System.out.println("TRANSFERENCIA NO VÁLIDA");
                }
        }else{
                System.out.println("INSERTE TARJETA");
            }
    }
    
}
