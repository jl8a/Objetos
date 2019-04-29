package Gasolineria;


import java.util.Scanner;

public class Empleado {
    String nombre;
    String horario;
    String genero;
    Scanner sc = new Scanner(System.in);

    public Empleado() { //Constructor default
        this.nombre = "jose";
        this.horario = "De 7 am a 3 pm";
        this.genero = "hombre";
    }
    
    public Empleado(String nombre, String horario, String genero) { //Constructor personalizado
        this.nombre = nombre;
        this.horario = horario;
        this.genero = genero;
    }
    
    public void IngresarGasolina() throws InterruptedException{ //Metodo para que el empleado ingrese la gasolina que el cliente pide
        System.out.println("Buen dia, lo atiende "+nombre+". Ingrese por favor la cantidad de litros que desea");
        String litros = sc.nextLine();
        System.out.println("Muy bien");
        Thread.sleep(1000);
        String tipo = null;
        do{
                System.out.println("¿Que tipo de gasolina desea?, indique magna o premium");
                tipo = sc.nextLine();
            }while((!tipo.equalsIgnoreCase("magna"))&&(!tipo.equalsIgnoreCase("premium")));
        System.out.println("Por favor abra la tapa para ingresar la manguera");
        Thread.sleep(2000);
        System.out.println("Se ha ingresado la manguera al carro");
        Thread.sleep(2000);
        System.out.println("Inicia el deposito de gasolina");
        Thread.sleep(2000);
        System.out.println("Se han cargado los "+litros+" que pidio");
        
    }
    
    public void Cobrar() throws InterruptedException{ //Metodo donde el empleado cobra la gasolina
        System.out.println("Por favor indique la cantidad de litros que solicito");
        int litros = sc.nextInt();
        String tipo = null;
        double costo;
        double costoTotal;
        do{
            System.out.println("¿Que tipo de gasolina?, indique magna o premium");
            tipo = sc.nextLine();
        }while((!tipo.equalsIgnoreCase("magna"))&&(!tipo.equalsIgnoreCase("premium")));
        
        if (tipo.equalsIgnoreCase("magna")) {
           costo = 19.42;
        }else costo = 20.71;
        System.out.println("Muy bien");
        costoTotal = (litros*costo);
        Thread.sleep(2000);
        System.out.println("El total a pagar es de "+costoTotal+" pesos");
    }
    
    
}
