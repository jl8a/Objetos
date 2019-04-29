/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Escuela;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Recicladora {
    int capacidadBotellas;
    int cantidadBotellas = 0;
    int capacidadLatas;
    int cantidadLatas = 0;
    int capacidadTickets;
    int cantidadTickets;
    
    public Recicladora(int capacidadTickets, int capacidadBotellas, int capacidadLatas) {
        this.capacidadTickets = capacidadTickets;
        this.cantidadTickets = capacidadTickets;
        this.capacidadBotellas = capacidadBotellas;
        this.capacidadLatas = capacidadLatas;
    }
    
    public void reciclar() { //Se vierten botellas o latas a la máquina y se entrega un recibo a cambio.
        int pesosPorEntregar = 0;
        if(this.cantidadTickets == 0) {
            System.out.println("No tenemos tickets. Por tanto, el servicio está descontinuado hasta próximo aviso.");
            return;
        }
        boolean ciclo = true;
        Scanner scanner = new Scanner(System.in);
        while(ciclo == true) {
            System.out.println("¿Qué desea ingresar? \n 1 - Latas de Aluminio \n 2 - Botellas de Plástico \n Ingrese el número del tipo deseado.");
            int respuesta = transformaString();
            System.out.println("Excelente, comience a ingresar por favor");
            System.out.println("Explicite cuántas va a ingresar.");
            String respString = scanner.nextLine();
            while(!respString.matches("[0-9]+")) {
                System.out.println("Respuesta incorrecta, intente de nuevo.");
                respString = scanner.nextLine();
            }
            int cantidadIngresada = Integer.parseInt(respString);
            int desbordePosible;
            if(respuesta == 1) {
                if((this.cantidadLatas+cantidadIngresada) > this.capacidadLatas) {
                    desbordePosible = (this.cantidadLatas + cantidadIngresada) - this.capacidadLatas;
                    System.out.println("No se le aceptarán " + desbordePosible + " latas. \n Por favor vuelva cuando esté disponible de nuevo la máquina.");
                    cantidadIngresada = cantidadIngresada - desbordePosible;
                }
                    pesosPorEntregar = pesosPorEntregar + (cantidadIngresada * 5);
                    this.cantidadLatas = this.cantidadLatas + cantidadIngresada;
            } else {
                if((this.cantidadBotellas+cantidadIngresada) > this.capacidadBotellas) {
                    desbordePosible = (this.cantidadBotellas + cantidadIngresada) - this.capacidadBotellas;
                    System.out.println("No se le aceptarán " + desbordePosible + " botellas. \n Por favor vuelva cuando esté disponible de nuevo la máquina.");
                    cantidadIngresada = cantidadIngresada - desbordePosible;
                }
                pesosPorEntregar = pesosPorEntregar + (cantidadIngresada * 3);
                this.cantidadBotellas = this.cantidadBotellas + cantidadIngresada;
            }
            System.out.println("¿Desea seguir ingresando? \n 1 - Sí \n 2 - No");
            int respuestaTipo = transformaString();
            if(respuestaTipo == 2) {
                ciclo = false;
                System.out.println("--------------RECIBO----------------");
                System.out.println("Monto recibido - - - - - - $" + pesosPorEntregar + ".00 \n");
                System.out.println("     No olvide tomar su recibo \n");
                System.out.println("   Por favor participe de nuevo ☺");
                System.out.println("------------------------------------");
            }
        }      
    }
    
    private int transformaString() { //Transforma String a int.
        int respuesta;
        Scanner scanner = new Scanner(System.in);
        String respString = scanner.nextLine();
        while(!(respString.equals("1") || respString.equals("2"))) {
            System.out.println("Respuesta incorrecta, intente de nuevo.");
            respString = scanner.nextLine();
        }
        respuesta = Integer.parseInt(respString);
        return respuesta;
    }
    
    public void vaciar() { //"Vacía" la máquina.
        this.cantidadLatas = 0;
        this.cantidadBotellas = 0;
    }
    
    public void rellenarTickets() { //"Rellena" la cantidad de tickets (recibos).
        this.cantidadTickets = this.capacidadTickets;
    }
}
