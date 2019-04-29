/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iglesia;

/**
 *
 * @author MI
 */
public class sagrario {

    boolean abrir;
    boolean guardar;
    

    public sagrario(boolean abrir, boolean guardar) {
        this.abrir = abrir;
        this.guardar = guardar;
    }

    public sagrario() {
    }
    
    public void abrirSagrario(){
        if(abrir==true){
            System.out.println("Sagrario abierto");
        }else{
            System.out.println("El Sagrario esta cerrado");
        }
    }
   
    public void cerrarSagrario(){
         if(abrir==false){
            System.out.println("Sagrario cerrado");
        }else{
            System.out.println("Sagrario abierto, asegurece de cerrarlo");
        }
    }
    public void guardarEucaristia(){
        if(guardar==true){
            System.out.println("Eucaristia guardada");
        }else{
            System.out.println("No se ha guardado la eucaristia");
        }
  }
   
}
