/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurante;

/**
 *
 * @author YesicaIrasema
 */
public class TerminalBancaria {
    boolean introducirTarjeta;
    String clave;
    String nombreCliente;

    public TerminalBancaria(boolean introducirTarjeta, String clave, String nombreCliente) {
        this.introducirTarjeta = introducirTarjeta;
        this.clave = clave;
        this.nombreCliente = nombreCliente;
    }
    
    public TerminalBancaria() {
        this.introducirTarjeta = true;
        this.clave = "";
        this.nombreCliente = "";
    }
    
    public void pagar(boolean introducirTarjeta, String clave, String nombreCliente){
        if (introducirTarjeta==true) {
            if (clave.length()==4) {//Una clave solo consta de 4 dígitos
                System.out.println("Calve correcta");
                System.out.println("Pago hecho");
                tiket(nombreCliente);
            }else{
                System.out.println("Clave incorrecte");
            }
            
        }
    }
    public void tiket(String nombreCliente){
        System.out.println("------------- Pago realizado -------------");
        System.out.println("Forma de pago:              tareta banaria");
        System.out.println("Propietario tarjeta:   "+nombreCliente);
        System.out.println("clave:                           * * * *  ");
        System.out.println("           ¡Regrese pronto! :3 ");
        System.out.println("------------------------------------------");
    }
    
}
