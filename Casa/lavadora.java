package Casa;
import java.util.*;
public class lavadora {
    
    Scanner sc = new Scanner (System.in);
    
    String marca;
    static String opcion;

    public lavadora(String marca, String opcion) {
        this.marca = marca;
        this.opcion = opcion;
    }
    
    public lavadora() {
        this.marca = "whirlpool";
        this.opcion = opcion;
    }
    
    
    public void Lavar(){
            System.out.println("LAVANDO");
    }
    public void Enjuagar(){
            System.out.println("ENJUAGANDO");
    }
    public void Secar(){
            System.out.println("SECANDO");
    }
    
    
    public void opcion(){
        System.out.println("'OPCIONES EN MAYÚSCULA O MINÚSCULA'");
        System.out.print("INGRESE OPCIÓN: ");
        opcion = sc.nextLine();
        switch (opcion) {
            case "lavar":
                Lavar();
                break;
            case "LAVAR":
                Lavar();
                break;
            case "enjuagar":
                Enjuagar();
                break;
            case "ENJUAGAR":
                Enjuagar();
                break;
            case "secar":
                Secar();
                break;
            case "SECAR":
                Secar();
                break;
            default:
                System.out.println("ESCRIBA UNA OPCIÓN VÁLIDA\n");
                System.out.println("CONTAMOS CON:\n - LAVADO\n- ENJUAGADO\n- SECADO");
        }
    }

}
