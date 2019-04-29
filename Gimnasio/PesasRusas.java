/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gimnasio;

/**
 *
 * @author Acer Notebook
 */
public class PesasRusas {
    String color;
    int peso;
    int cantidad;
    boolean disponible;

    public PesasRusas(String color, int peso, int cantidad, boolean disponible) {
        this.color = color;
        this.peso = peso;
        this.cantidad = cantidad;
        this.disponible = disponible;
    }

    public PesasRusas() {
          this.color = "amarillo";
        this.peso = 30;
        this.cantidad = 1;
        this.disponible = true;
    }
    
    
    
    public void cargar(){
        if(disponible==true){
             System.out.println("Las pesas estan listas para su uso");
             System.out.println("Cargando pesas");
             System.out.println("Usted estan cargando una pesa de : " + peso);
        }else{
            System.out.println("Las pesas estan ocupadas");
        }
       
    }
    
    public void balancear(){
         if(disponible==true){
             System.out.println("Las pesas estan listas para su uso");
             System.out.println("balanceando pesas");
        }else{
            System.out.println("Las pesas estan ocupadas");
        }
        
        
    }
    
    public void girar(){
          if(disponible==true){
             System.out.println("Las pesas estan listas para su uso");
             System.out.println("girando pesas");
        }else{
            System.out.println("Las pesas estan ocupadas");
        }
        
        
    }
    
}
