/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurante;

/**
 *
 * @author Acer Notebook
 */
public class Luces {
    boolean estado;
    String zona;
    boolean funcionabilidad;
    public Luces(boolean estado, String zona, boolean funcionabilidad) {
        this.estado = estado;
        this.zona = zona;
        this.funcionabilidad = funcionabilidad;
    }
     public Luces() {
        this.estado = true;
        this.zona = "cocina";
        this.funcionabilidad = false;
    }
    
     public void EstadoLuces(){
        if(funcionabilidad==true){
            System.out.println("Estan funcionando.");
        }else{
            System.out.println("Las luces no estan funcionando");
        }
     }
     
    public void encender(boolean estado, boolean funcionabilidad){
      if(funcionabilidad==true){
        if(estado==false){
            System.out.println("Luces encendidas en " + zona);
        }else{
            System.out.println("Las luces ya estan encendidas en " + zona);
        }
        
      }else{
          System.out.println("Las luces no estan funcionando, tienen que ser cambiadas.");
      }
    } 
    public void apagar(boolean estado, boolean funcionabilidad){
         if(funcionabilidad==true){
        if(estado==true){
            System.out.println("Luces apagadas en " + zona);
        }else{
            System.out.println("Las luces ya estan apagadas " + zona);
        }
    }else{
           System.out.println("Las luces no estan funcionando, tienen que ser cambiadas.");
         }
    }
    
}
