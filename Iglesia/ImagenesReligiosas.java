/* * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iglesia;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Karen Ornelas
 */
public class ImagenesReligiosas {
    
    String nombre;
    Double alto;
    Double ancho;
    boolean limpio;

    public ImagenesReligiosas(String nombre, Double alto, Double ancho, boolean limpio) {
        this.nombre = nombre;
        this.alto = alto;
        this.ancho = ancho;
        this.limpio = limpio;
    }

    public ImagenesReligiosas() {
         this.nombre = "angeles";
        this.alto = 9.6;
        this.ancho = 3.6;
        this.limpio = true;
        
    }

    
public void limpiar(boolean limpio){
    System.out.println("¿Desea limpiar el cuadro? \"Escribe \\\"si o no\\\"\""+  nombre);
     Scanner sc = new Scanner(System.in);
     String resp = sc.nextLine();
      if (resp.equalsIgnoreCase("si")) {
          System.out.println("Limpiando Imagen...");
          System.out.println();
          System.out.println("------------------");
          System.out.println("Limpieza finalizada.");
         
      }
      else{
          System.out.println("*Ya esta limpio*");
      }
      
}    

public void acomodar(){
    System.out.println("¿Desea acomodar el cuadro? \"Escribe \\\"si o no\\\"\""+ nombre);
     Scanner sc = new Scanner(System.in);
     String resp = sc.nextLine();
      if (resp.equalsIgnoreCase("si")) {
          System.out.println("Limpiando cuadro...");
          System.out.println("¿Desea moverlo a la derecha?  \"Escribe \\\"si o no\\\"\"");
          String derecha = sc.nextLine();
          if(derecha.equalsIgnoreCase(derecha)){
              System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
              System.out.println("Moviendo a la derecha...");
          } else{
              System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
              System.out.println("Moviendo a la izquierda");
              
          }  
         
      }
      else{
          System.out.println("La imagen ha sido movida");
      }
      System.out.println("La imagen sigue en su posicion original");
      
    
    
}




    
    
    
    
    
   
    
}
