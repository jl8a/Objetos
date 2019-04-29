
package Hotel;

import java.util.ArrayList;
import java.util.Scanner;


public class habitaciones {
    static Scanner entrada = new Scanner(System.in);
    
    static ArrayList habitaciones = new ArrayList ();
    
    int numeroHabitacion;
    int numeroPersonas;
    int precioPorNoche;
    String tipoHabitacion;
    int numeroCamas;
    
    

    public habitaciones(int numeroHabitacion, int numeroPersonas, int precioPorNoche, String tipoHabitacion,
                        int numeroCamas) {
        this.numeroHabitacion = numeroHabitacion;
        this.numeroPersonas = numeroPersonas;
        this.precioPorNoche = precioPorNoche;
        this.tipoHabitacion = tipoHabitacion;
        this.numeroCamas = numeroCamas;
        
        
    }
    
    public static void escribirTiposHabitaciones(){ 
        
        System.out.println("Escriba el tipo de habitacion");
        String tipoHabitacion = entrada.nextLine();
        System.out.println("Escriba el numero de la habitacion");
        int numeroHabitacion = entrada.nextInt();
        System.out.println("Numero de personas por dicha habitacion");
        int numeroPersonas = entrada.nextInt();
        System.out.println("Precio por noche");
        int precioPorNoche = entrada.nextInt();
        System.out.println("Escriba el numero de camas");
        int numeroCamas = entrada.nextInt();
        
        habitaciones Cuartos = new habitaciones(numeroHabitacion,numeroPersonas,precioPorNoche,tipoHabitacion,numeroCamas);
        
        habitaciones.add(Cuartos);
    }
}
