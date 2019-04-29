/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transporte;

/**
 *
 * @author MI
 */
public class helicoptero {
    double velocidad = 0; //km
    double altura = 0; //mts
    double combustible =1251; //Litros
    String marca ="Bell 412EP Helicopter";
    boolean encender;
    boolean apagar;

    public helicoptero() {
    }

    public helicoptero(double velocidad, double altura, double combustible,String marca, boolean encender, boolean apagar) {
        this.velocidad = velocidad;
        this.altura = altura;
        this.combustible = combustible;
        this.marca = marca;
        this.encender = encender;
        this.apagar = apagar;
    }
    public void encendido(){
        if (encender==true){
            System.out.println("Helicoptero listo para viajar");
        }else{
            System.out.println("Se encuentra apagado");
        }
    }
    public void apagado(){
        if (apagar==true){
            System.out.println("Helicoptero apagado");
        }else{
            System.out.println("Se encuentra apagado");
        }
    }
    public void cambioVelocidad(double velocidad){
        System.out.println("Velocidad actual: "+velocidad);
    }
    public void elevacion(double altura){
        
        System.out.println("Altura: "+altura+" m");
    }
    public void estatus(int numeroPersonas, double combustible, double altura){
        System.out.println("Numero de personas: "+numeroPersonas);
        System.out.println("Marca del helicoptero: "+marca);
        System.out.println("Altura: "+altura);
        System.out.println("Combustible actual: "+combustible);
        
    }
}
