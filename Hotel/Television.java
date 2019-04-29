/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hotel;

/**
 *
 * @author Acer Notebook
 */
public class Television {
    boolean estado;
    int cantidad;
    String marca;
    String color;

    public Television(boolean estado, int cantidad, String marca, String color) {
        this.estado = estado;
        this.cantidad = cantidad;
        this.marca = marca;
        this.color = color;
        }
   
        public Television() {
        this.estado = true;
        this.cantidad = 1;
        this.marca = "Samsung";
        this.color = "Negro";
          }
        
        public void Prender(boolean estado){
            if(estado==true){
                System.out.println("La television esta encendida y funcionando");
                System.out.println("Hay " + cantidad + "de televisiones " + marca+ "Encendidas");
            }else{
                System.out.println("La television esta apagada");
                System.out.println("Prendiendo...\n");
                System.out.println("TELEVISION: " + marca + color + "ENCENDIDA");
             }
            
        }
        
        public void Apagar(boolean estado){
                 if(estado==true){
                      System.out.println("La television esta encendida y funcionando, APAGALA PARA AHORRAR ENERGIA");
                      System.out.println("Apagando...\n");
                      System.out.println("La television esta apagada");  
            }else{
               
                System.out.println("TELEVISION: " + marca + color + "APAGADA");
                System.out.println("Hay " + cantidad + "de televisiones " + marca+ "Apagadas");              
              
             }
        }
    
}
