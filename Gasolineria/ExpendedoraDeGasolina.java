package Gasolineria;

import java.util.Scanner;

public class ExpendedoraDeGasolina {

    double gasMagna = 20.50;
    double gasPremium = 23.50;
    String tipoGas;
    double cantidadLitros;
    int dineroPagar;

    public void expendedora() throws InterruptedException {

        Scanner sc = new Scanner(System.in);

        System.out.println("====================");
        System.out.println("**GASOLINERAS ISI**" + "\n" + "Bienvenido..." + "\n");

        System.out.println("¿Qué tipo de gasolina desea adquirir? "); //Elegimos el tipo de gasolina que vamos a cargar con un scanner; esto se guarda en un String llamado "tipoGas".
        tipoGas = sc.next();

        System.out.println("¿Cuántos litros de gasolina desea comprar?"); //Le decimos al programa la cantidad de litros que vamos a comprar para su posterior operación dentro del método.
        cantidadLitros = sc.nextDouble();

        double totalPagar; //Variable que supone la cantidad a pagar que depende de la cantidad de litros ingresados en el scanner "cantidadLitros = sc.nextDouble();".
        
        System.out.println("Dispensando gasolina..." + "\n");
        
        for (int i = 0; i < cantidadLitros; i++) { //Pequeño ciclo que simula el surtido de gasolina. Como los que solemos ver en gasolineras comúnmente.
            System.out.println("Cantidad de litros surtidos : " + (i + 1) + " litros." + "\n");
            Thread.sleep(1000);
        }
        
        System.out.println("");
        System.out.println("¡Listo!" + "\n");

        if (tipoGas.equalsIgnoreCase("magna")) { //Dependiendo de el tipo de gasolina que elijamos, el programa realizará las operaciones pertinentes.
            totalPagar = cantidadLitros * gasMagna;
            System.out.println("Su total a pagar es: " + totalPagar + "\n");
        } else {
            totalPagar = cantidadLitros * gasPremium;
            System.out.println("Su total a pagar es: " + totalPagar + "\n");
        }

        System.out.println("¿Con cuánto pagará? "); //Al ingresar la cantidad con la que vamos a pagar, el programa hará una operación con el fin de devolvernos el "cambio" o "feria".
        dineroPagar = sc.nextInt();

        double cambio = dineroPagar - totalPagar;
        System.out.println("Su cambio es: " + cambio + "\n");

        System.out.println("¡Gracias por su preferencia! ¡Vuelva pronto!");
        System.out.println("====================");

    }
}
