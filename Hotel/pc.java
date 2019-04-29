package Hotel;
import java.util.*;
public class pc {
    
    String marca;
    static String opcion;

    public pc(String marca, String opcion) {
        this.marca = marca;
        this.opcion = opcion;
    }
    
    public pc() {
        this.marca = "";
        this.opcion=  "";
    }
    
    public void opcion(){
        System.out.println("¿QUIÉRES ENCENDER O APAGAR?");
        switch (opcion) {
            case "ENCENDER":
                Encender();
                break;
            case "encender":
                Encender();
                break;
            case "APAGAR":
                Apagar();
                break;
            case "apagar":
                Apagar();
                break;    
            default:
                System.out.println("INGRESE UNA OPCIÓN VÁLIDA");
        }
    }
    public void Encender(){
            System.out.println("Encendiendo... ");
    } 
    public void Apagar(){
            System.out.println("Apagando...");
    }
}
