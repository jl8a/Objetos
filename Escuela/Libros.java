/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Escuela;

import java.util.Scanner;

/**
 *
 * @author Acer Notebook
 */
public class Libros {
    String titulo;
    String autor;
    String genero;
    boolean disponible;
     Scanner sc = new Scanner(System.in);

    public Libros(String titulo, String autor, String genero, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.disponible = disponible;
    }

  

    public Libros() {
        this.titulo = "El principito";
        this.autor = "No se";
        this.genero = "Infantil";
        this.disponible = true;
    }
    
    
public void Disponibilidad(){
    if(disponible==true){
        System.out.println("Disfrute su lectura");
        
    }else{
        System.out.println("Busque otro libro que leer.");
           
    }
}

  public void ElegirLibro(){
      System.out.println("¿Desea elegir un libro infantil?  \"Escribe \\\"si o no\\\"\" : ");
      String resp = sc.nextLine();
      if(resp.equalsIgnoreCase("si")){ 
         System.out.println("Elija un numero.");
         int lib=sc.nextInt();
         System.out.println();
          switch(lib){
            case 1:
                System.out.println("El Principito\n");
                System.out.println("Autor: Antoine de Saint-Exupéry");
                System.out.println();
                
                break;
                
                   case 2:
                System.out.println("Celia, lo que dice\n");
                System.out.println("Autor: Elena Fortún");
                System.out.println();
             
                break;
                   case 3: 
                System.out.println("Donde viven los monstruos\n");
                System.out.println();
                System.out.println("Autor: Maurice Sendak");
                break;
                   case 4: 
                System.out.println("El príncipe feliz\n");
                System.out.println();
                System.out.println("Autor: Oscar Wilde");
                break;
                   default:
                       System.out.println("No ha elegido nada");
                  } 
    
          }else{ 
         System.out.println("¿Desea elegir un libro juvenil?  \"Escribe \\\"si o no\\\"\" : ");
         String res = sc.nextLine();
          if(resp.equalsIgnoreCase("si")){
         System.out.println("Elija un numero.");
         int lib1 = sc.nextInt();
          switch(lib1){
            case 1:
                System.out.println("Cazadores de sombras: Ciudad de hueso\n");
                System.out.println("Autor: Cassandra Clare");
                System.out.println();
                
                break;
                
                   case 2:
                System.out.println("La seleccion\n");
                System.out.println("Autor: Kiera Cass");
                System.out.println();
             
                break;
                   case 3: 
                System.out.println("Divergente\n");
                System.out.println();
                System.out.println("Autor:  Veronica Roth");
                break;
                   case 4: 
                System.out.println("Cinder\n");
                System.out.println();
                System.out.println("Autor: Marissa Meyer");
                break;
                   default:
                       System.out.println("No ha elegido nada");
                }
             }
              
          }
      }
  }

  
