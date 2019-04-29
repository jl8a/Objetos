package Iglesia;


import java.util.Scanner;

public class Banca {
    String material;
    int capacidad;
    Scanner sc = new Scanner(System.in);

    public Banca() { //Constructor default
        this.material = "Madera";
        this.capacidad = 5;
    }
    
    public Banca(String material, int capacidad) { //Constructor personalizado
        this.material = material;
        this.capacidad = capacidad;
    }
    
    public void Sentarse() throws InterruptedException{ //Metodo para sentarse, permite ver la cantidad de personas sentadas y ver si hay un lugar disponible
        System.out.println("Vamos a sentarnos");
        Thread.sleep(2000);
        System.out.println("¿La banca esta ocupada?");
        Thread.sleep(2000);
        String resp = sc.nextLine();
        if (resp.equalsIgnoreCase("si")) {
            System.out.println("¿Cuantas personas estan sentadas?");
            int personas = sc.nextInt();
            if (!(personas==capacidad)) {
                capacidad = capacidad-personas;
                Thread.sleep(2000);
                System.out.println("En total hay "+capacidad+" lugares disponibles... Elige el lugar que prefieras");  
            }else System.out.println("No hay lugares disponibles... Busca otra banca");
        }else System.out.println("Entonces te puedes sentar donde mas te guste");
    }
    
    public void Romperse() throws InterruptedException{ //Metodo para romper la banca
        System.out.println("¡La silla se va a romper!");
        Thread.sleep(2000);
        System.out.println("¿Te vas a levantar?");
        String resp = sc.nextLine();
        Thread.sleep(2000);
        if (resp.equalsIgnoreCase("no")) {
            System.out.println("No te levantas...");
            Thread.sleep(2000);
            System.out.println("La banca se ha roto");
            
        }else System.out.println("Te levantaste y has evitado que la banca se rompa");
    }
}
