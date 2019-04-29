/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parque;

import java.util.Scanner;

/**
 *
 * @author Acer Notebook
 */
public class CarritoHelados {
    String nombre;
    double precio;
    String sabor;
    boolean estadoCarrito; //Si el carrito de helados esta abierto o no.
     Scanner sc = new Scanner(System.in);

    public CarritoHelados() {
        this.nombre = "Helado 1";
        this.precio = 12.5;
        this.sabor = "Galleta";
        this.estadoCarrito = true;
    }
    

    public CarritoHelados(String nombre, double precio, String sabor, boolean estado, boolean estadoCarrito) {
        this.nombre = nombre;
        this.precio = precio;
        this.sabor = sabor;
        this.estadoCarrito = estado;
    }
    
    public void EstadoCarrito(boolean estadoCarrito){
        if(estadoCarrito==true){
            System.out.println("El carrito de helados esta abierto.");
        }else{
         System.out.println("El carrito de helados esta cerrado.");
        }
        
    }
     
     
    
    public void vender(){
        if(estadoCarrito==true){
        System.out.println("¿Desea comprar un helado? \"Escribe \\\"si o no\\\"\"");
        String resp = sc.nextLine();
        if(resp.equalsIgnoreCase("si")){
             System.out.println("¿De que sabor quieres el helado?,\"Escribe  \\\"x\\\"\" si no sabes");
             String x = sc.nextLine();
             System.out.println("Elija un numero");
             int h = sc.nextInt();
             switch(h){
                 case 1:
                System.out.println("Chocolate");
                System.out.println();
                System.out.println("Su precio es de $10 ");
                System.out.println();
                System.out.println("¡gracias por su compra!");
                break;
                
                   case 2:
                System.out.println("Fresa");
                System.out.println();
                System.out.println("Su precio es de $12 ");
                System.out.println();
              System.out.println("¡gracias por su compra!");
                break;
                   case 3: 
                System.out.println("Nuez");
                System.out.println();
                System.out.println("Su precio es de $14 pesos");
                 System.out.println("¡gracias por su compra!");
                break;
                   default:
                       System.out.println("Vuelva a intentarlo");
                
                
        }
              System.out.println("Que tenga un buen dia.");
         }
        
        
       
     }else{
            System.out.println("Lo sentimos el carrito de helados esta cerrado, vuelva despues.");
            
        }
        
        System.out.println("Su compra fue : " + nombre + "Sabor de helado: " + sabor + "con un costo de: " + precio);
        System.out.println("Gracias por su compra");

    
    } 
    
}   
        
       
    
   
    

