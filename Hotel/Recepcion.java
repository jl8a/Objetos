package Hotel;


import java.util.Scanner;

public class Recepcion {
    String recepcionista;
    String cliente;
    int cuartosDisponibles;
    Scanner sc = new Scanner(System.in);

    public Recepcion() { //Constructor default
        this.recepcionista = "Ana";
        this.cliente = "Carlos";
        this.cuartosDisponibles = 10;
    }
    
    public Recepcion(String recepcionista, String cliente, int cuartosDisponibles) { //Constructor personalizado
        this.recepcionista = recepcionista;
        this.cliente = cliente;
        this.cuartosDisponibles = cuartosDisponibles;
    }
    
    public void SolicitarHabitacion() throws InterruptedException{ //Metodo para dar una llave y habitacion a cliente
        System.out.println(cliente+" solicita una habitacion");
        Thread.sleep(1500);
        if (cuartosDisponibles!=0) {
            System.out.println("Aqui tiene su llave");
        }else System.out.println("No hay habitaciones disponibles");
    }
    
    public void Ayuda(){ //Metodo donde el cliente necesita algun apoyo y el recepcionista lo ayuda
        System.out.println("¿Necesita ayuda?");
        String resp = sc.nextLine();
        if (resp.equalsIgnoreCase("si")) {
            System.out.println("Por favor indique que es lo que solicita");
            String ayuda = sc.nextLine();
        }else System.out.println("Muy bien, que tenga un buen dia");
    }
    
    public void Queja(){ //Metodo para que el cliente ingrese las quejas o sugerencias que tenga
        System.out.println("¿Tiene una queja o sugerencia?");
        String resp = sc.nextLine();
        if (resp.equalsIgnoreCase("si")) {
            System.out.println("Ingrese su queja o sugerencia: ");
            String queja = sc.nextLine();
            System.out.println("Gracias! Se tomaran cartas en el asunto lo mas rapido posible");
        }else System.out.println("Muy bien, gracias por tu tiempo y tenga un buen dia");
    }
}
