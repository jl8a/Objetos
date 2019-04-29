package Hotel;

import java.util.Scanner;

public class ServicioDeLimpieza {

    String horaProgramada;
    String personaLimpieza;
    String cuartoLimpieza;
    String servicioHecho;

    public ServicioDeLimpieza(String horaProgramada, String personaLimpieza, String cuartoLimpieza, String servicioHecho) {
        this.horaProgramada = horaProgramada;
        this.personaLimpieza = personaLimpieza;
        this.cuartoLimpieza = cuartoLimpieza;
        this.servicioHecho = servicioHecho;
    }

    public ServicioDeLimpieza() {
        this.horaProgramada = "de 10:00 a.m. a 11:00 a.m.";
        this.personaLimpieza = "Ángel Emilio Serna Navarro";
        this.cuartoLimpieza = "5-102";
        this.servicioHecho = "Si";
    }

    public void pedirServicio() throws InterruptedException {

        Scanner sc = new Scanner(System.in);

        System.out.println("**Bienvenido al servicio de limpieza del hotel ISI**" + "\n");

        System.out.print("Ubicación de su habitación: ");
        cuartoLimpieza = sc.nextLine();

        System.out.println("");

        for (int i = 0; i < 2; i++) {
            Thread.sleep(1000);
            System.out.println("Verificando disponibilidad...");
            System.out.println("");
        }

        System.out.println("");
        System.out.println("Su servicio será proporicionado por: " + this.personaLimpieza + ", en el horario " + this.horaProgramada);
    }

    public void confirmacionServicio() throws InterruptedException {

        Scanner sc = new Scanner(System.in);

        System.out.println("¿Fue el servicio realizado?");
        servicioHecho = sc.nextLine();

        if (servicioHecho.equalsIgnoreCase("Si")) {

            System.out.println("¿Qué calificación le daría al servicio?");
            System.out.println("1.- Malo." + "\n" + "2.- Regular." + "\n" + "3.- Bueno." + "\n" + "4.- Excelente.");
            String calif = sc.next();
            
            System.out.println("");
            System.out.println("Excelente. Buscamos mejorar como empresa y ofrecer el mejor servicio.");
            
        } else if (servicioHecho.equalsIgnoreCase("No")) {
            System.out.println("¿Te gustaría pedir nuevamente el servicio?");
            String newServicio = sc.next();

            if (newServicio.equalsIgnoreCase("Si")) {
                ServicioDeLimpieza nuevo = new ServicioDeLimpieza();
                nuevo.pedirServicio();
            } else {
                System.out.println("Lo entendemos.");
            }
        }
    }

}
