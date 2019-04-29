/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hotel;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Elevador {
    int pisoActual = 0;
    int cantidadPisos;
    String id;
    boolean funcionando;
    int pisosDestino[];
    int pisoLlamada;
    String estado = "nulo";
    int pendientesArriba = 0;
    int pendientesAbajo = 0;
    int capacidadPersonas;
    private final Scanner scanner;
    
    public Elevador() {
        this.scanner = new Scanner(System.in);
        System.out.println("¿Cuántos pisos tiene su establecimiento? Ingrese la cantidad en dígitos por favor.");
        this.cantidadPisos = transformaString("");
        this.pisosDestino = new int[this.cantidadPisos];
        Arrays.fill(this.pisosDestino, 0);
        System.out.println("¿Cuántas personas caben al mismo tiempo en este ascensor? Introduzca el dígito por favor.");
        this.capacidadPersonas = transformaString("persona");
        System.out.println("Introduzca el nombre de este elevador por favor.");
        this.id = scanner.nextLine();
    }
    
    public void llamarElevador() { //Se llama al elevador al piso que especifique el usuario.
        if(this.funcionando == false) {
            System.out.println("Elevador fuera de servicio");
            return;
        }
        System.out.println("-----------------------------");
        System.out.println("INICIO DE UNA NUEVA LLAMADA");
        System.out.println("----------------------------");
        System.out.println("¿Desde qué piso llama?");
        this.pisoLlamada = (transformaString("piso") - 1);
        System.out.println("Tome en cuenta que sólo pueden subir " + this.capacidadPersonas + " personas.");
        if(this.pisoActual < this.pisoLlamada) {
            System.out.println("El elevador subirá al piso " + (this.pisoLlamada + 1));
            this.pendientesArriba++;
            subir();
        } else if (this.pisoActual > this.pisoLlamada) {
            System.out.println("El elevador descenderá al piso " + (this.pisoLlamada + 1));
            this.pendientesAbajo++;
            bajar();
        } else {
            System.out.println("El elevador se encuentra en este piso. Pase.");
            elegirDestino();
        }
        mover();
    }
    
    private void subir() { //Operación automática de subir.
        if (this.pisoActual != this.cantidadPisos) {
            this.pisoActual++;
            System.out.println("Hemos subido al piso " + (this.pisoActual + 1));
        }   
        this.estado = "subir";
        if (this.pisoActual == this.pisoLlamada) {
            System.out.println("HEMOS LLEGADO A UNA LLAMADA EN EL PISO " + (this.pisoActual + 1));
            this.pendientesArriba--;
            this.pisoLlamada = 9999;
            elegirDestino();
        }
        if(this.pisosDestino[this.pisoActual] == 1) {
            System.out.println("HEMOS LLEGADO A UN DESTINO EN EL PISO " + (this.pisoActual + 1));
            System.out.println("Pueden bajar ☺");
            this.pisosDestino[this.pisoActual] = 0;
            this.pendientesArriba--;
        }
        if(this.pendientesArriba != 0) {
            subir();
        } else if (this.pendientesAbajo > 0) {
            System.out.println("Terminamos de subir y vamos a bajar");
            bajar();
        } else {
            System.out.println("Terminamos de subir y ya no quedan más movimientos.");
            this.estado = "nulo";
        }
    }
    
    private void mover() { //Operación automática de moverse en base a los pendientes.
        if("subir".equals(this.estado) && this.pendientesArriba != 0) {
            subir();
        } else if ("bajar".equals(this.estado) && this.pendientesAbajo != 0) {
            bajar();
        } else if ("nulo".equals(this.estado) && this.pendientesArriba != 0) {
            subir();
        } else if ("nulo".equals(this.estado) && this.pendientesAbajo != 0) {
            bajar();
        } else {
            System.out.println("El elevador se ha dejado de mover.");
        }
    }
    
    private void bajar() { //Operación automática de bajar.
        if (this.pisoActual != 0) {
            this.pisoActual--;
            System.out.println("Hemos bajado al piso " + (this.pisoActual + 1));
        }
        this.estado = "bajar";
        if (this.pisoActual == this.pisoLlamada) {
            System.out.println("HEMOS LLEGADO A UNA LLAMADA EN EL PISO " + (this.pisoActual + 1));
            this.pendientesAbajo--;
            this.pisoLlamada = 9999;
            elegirDestino();
        }
        if(this.pisosDestino[this.pisoActual] == 1) {
            System.out.println("HEMOS LLEGADO A UN DESTINO EN EL PISO " + (this.pisoActual + 1));
            System.out.println("Pueden bajar ☺");
            this.pendientesAbajo--;
            this.pisosDestino[this.pisoActual] = 0;
        }
        if(this.pendientesAbajo != 0) {
            bajar();
        } else if (this.pendientesArriba > 0) {
            System.out.println("Terminamos de bajar y vamos a subir");
            subir();
        } else {
            System.out.println("Terminamos de bajar y ya no quedan más movimientos.");
            this.estado = "nulo";
        }
    }
    
    private void elegirDestino() { //El usuario elige uno o varios destinos una vez que entra al elevador.
        System.out.println("Ha subido al ascensor.");
        int respuesta = 1;
        while(respuesta == 1) {
            System.out.println("¿A qué piso se dirige?");
            int pisoDestino = (transformaString("piso") - 1);
            if(this.pisosDestino[pisoDestino] == 0 && this.pisoActual != pisoDestino) {
                this.pisosDestino[pisoDestino] = 1;
                if(this.pisoActual < pisoDestino) {
                    this.pendientesArriba++;
                } else if (this.pisoActual > pisoDestino) {
                    this.pendientesAbajo++;
                }
            } else {
                System.out.println("Este piso de destino ya ha sido seleccionado.");
            }
            System.out.println("¿Alguien más quiere introducir un piso? 1 - Sí 2 - No");
            respuesta = transformaSiNo();
        }
    }
    
    public void modoEmergencia() { //Establece el modo de emergencia.
        System.out.println("MODO EMERGENCIA. EL ELEVADOR DESCENDERÁ AL PISO 1.");
        this.pisoActual = 0;
        this.funcionando = false;
    }
    
    public void arreglar() { //"Arregla" el ascensor.
        this.funcionando = true;
        System.out.println("Se ha arreglado el elevador " + this.id);
    }
    
    private int transformaString(String tipoDato) { //Transforma String a int.
        int respuesta;
        String respString = scanner.nextLine();
        while(!respString.matches("[0-9]+")) {
            System.out.println("Respuesta incorrecta, intente de nuevo.");
            respString = scanner.nextLine();
        }
        respuesta = Integer.parseInt(respString);
        if("piso".equals(tipoDato) && ((respuesta - 1) >= this.cantidadPisos || respuesta <= 0)) {
            System.out.println("Ha elegido un piso que no existe. Intente de nuevo.");
            respuesta = transformaString("piso");
        }
        return respuesta;
    }
    
    private int transformaSiNo() { //Transforma String a int para "Si" o "No"
        int respuesta;
        String respString = scanner.nextLine();
        while(!("1".equals(respString) || "2".equals(respString))) {
            System.out.println("Respuesta incorrecta, intente de nuevo.");
            respString = scanner.nextLine();
        }
        respuesta = Integer.parseInt(respString);
        return respuesta;
    }
}
