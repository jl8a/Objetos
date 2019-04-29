/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transporte;

/**
 *
 * @author YesicaIrasema
 */
public class Caballo {
    String nombre;
    String alimentacion; //combustible
    boolean corre;
    boolean trota;
    boolean caminar;

    public Caballo(String nombre, String alimentacion, boolean corre, boolean trota, boolean caminar) {
        this.nombre = nombre;
        this.alimentacion = alimentacion;
        this.corre = corre;
        this.trota = trota;
        this.caminar = caminar;
    }
    
    public Caballo() {
        this.nombre = "";
        this.alimentacion = "";
        this.corre = false;
        this.trota = false;
        this.caminar = false;
    }
    
    public void alimentarse (String alimentacion, String nombre){
        System.out.println("El caballo "+nombre+" se esta alimentando de: "+alimentacion+" ...");
    }
    
    public void transportarse ( boolean corre, boolean trota, boolean caminar, String nombre){
        
        if (corre == true) {
            System.out.println("El caballo "+nombre+" va corriendo");
        }
        if (trota == true) {
            System.out.println("El caballo "+nombre+" va trotano");
        }
        if (caminar == true){
            System.out.println("El caballo "+nombre+" va caminando");
        }

    }
    
    
    
}
