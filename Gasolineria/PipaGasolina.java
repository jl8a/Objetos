package Gasolineria;

import java.util.Scanner;

public class PipaGasolina {
    // Clase que son las Pipas que transportan gasolina
    
    String marcaVehiculo, destino, id, empleado, tipoGasolina;
    double cantGasolina, gasolinaVehiculo;

    public PipaGasolina(String marcaVehiculo, String destino, String id, String empleado, String tipoGasolina, double cantGasolina, double gasolinaVehiculo) {
        this.marcaVehiculo = marcaVehiculo;
        this.destino = destino;
        this.id = id;
        this.empleado = empleado;
        this.tipoGasolina = tipoGasolina;
        this.cantGasolina = cantGasolina;
        this.gasolinaVehiculo = gasolinaVehiculo;
    }
    
    public void irDestino() throws InterruptedException { // Sirve para dirigirse o cambiar su destino
        Scanner resp = new Scanner(System.in);
        String respuesta;

        System.out.println("¿Su destino es: " + destino + "? Responda SI o NO");
        respuesta = resp.nextLine();

        if (respuesta.equalsIgnoreCase("si")) {
            System.out.println("Viajando a su destino...");
            Thread.sleep(1000);
            System.out.println("...");
            Thread.sleep(1000);
            System.out.println("...");
            Thread.sleep(500);
            System.out.println("Llegó a su destino");
        } else if (respuesta.equalsIgnoreCase("no")) {
            System.out.println("¿Cuál es su destino?");
            destino = resp.nextLine();
        }
    }

    public void surtir() throws InterruptedException {  // Método usado para surtir el tipo de gasolina disponible
                                                        // Pregunta la cantidad en litros deseada a surtir
        Scanner resp = new Scanner(System.in);
        double litrosSurt;

        System.out.println("Usted tiene combustible tipo" + tipoGasolina);
        Thread.sleep(1000);
        System.out.println("¿Cuánto desea surtir (LITROS)?");

        litrosSurt = Double.parseDouble(resp.nextLine());

        switch (tipoGasolina.toLowerCase()) {
            case "magna":
                cantGasolina = cantGasolina - litrosSurt;
                System.out.println("Se surtieron " + litrosSurt + "litros de " + tipoGasolina);
                System.out.println("Su cantidad es de: " + cantGasolina + "litros");
                break;
            case "premium":
                cantGasolina = cantGasolina - litrosSurt;
                System.out.println("Se surtieron " + litrosSurt + "litros de " + tipoGasolina);
                System.out.println("Su cantidad es de: " + cantGasolina + "litros");
                break;
            case "diesel":
                cantGasolina = cantGasolina - litrosSurt;
                System.out.println("Se surtieron " + litrosSurt + "litros de " + tipoGasolina);
                System.out.println("Su cantidad es de: " + cantGasolina + "litros");
                break;
            default:
                System.out.println("ERROR, tipo de gasolina inválido");
        }
    }
}
