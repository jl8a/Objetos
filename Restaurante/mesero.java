package Restaurante;
import java.util.*;

public class mesero {

    Scanner sc = new Scanner (System.in);
    
    static String nombre;
    static int edad;
    static String sexo;
    static String vestimenta;
    static double sueldo;
    String plato;
    int opcion;
    

    public mesero(String nombre, String sexo, int edad, String vestimenta, double sueldo, String plato, int opcion) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.vestimenta = vestimenta;
        this.sueldo = sueldo;
        this.plato = plato;
        this.opcion = opcion;
    }
    
    public mesero() {
        this.nombre = "";
        this.edad = 0;
        this.sexo = "";
        this.vestimenta = "";
        this.sueldo = 0;
        this.plato = "";
        this.opcion = 0;
    }
    
    //MÉTODO DONDE EL USUARIO DEFINE AL MESERO
    public void DefinirMesero(){
        System.out.print("→ NOMBRE DEL MESERO: ");
        nombre = sc.nextLine();
        System.out.print("→ EDAD DEL MESERO: ");
        edad = sc.nextInt();
        System.out.print("→ SEXO DEL MESERO: ");
        sexo = sc.nextLine();
        System.out.print("→ VESTIMENTA DEL MESERO: ");
        vestimenta = sc.nextLine();
        System.out.print("→ SUELDO DEL MESERO: ");
        sueldo = sc.nextDouble();
    }
    
    public void opcion(){
        System.out.println("COMIDA = 1\nBASURA = 0\n");
        System.out.println("");
        System.out.print("¿QUÉ HAY EN EL PLATO?");
        opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                LlevarComida();
                break;
            case 0:
                LimpiarMesa();
                break;    
            default:
                System.out.println("ELIGA UNA OPCIÓN VÁLIDA (NÚMEROS)");
        }
    }
    
    public void LlevarComida(){
        System.out.println("LLEVAR A LA MESA");
    }
    
    public void LimpiarMesa(){
        System.out.println("LIMPIAR MESA");
    }
    
}
