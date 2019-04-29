/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hotel;

import java.util.Scanner;

/**
 *
 * @author Julissa
 */
public class Cocinero {
    boolean platosSucios;
    int numeroPlatillos;
    
    Scanner sc = new Scanner(System.in);
   
    public void hacerMenu(int numeroPlatillos){//hacer un menu del dia
   String menu []= new String[numeroPlatillos];
        for (int i = 0; i <numeroPlatillos; i++) {
            
            System.out.println("Ingrese nombre del platillo "+(i+1)+":");
            String nombre = sc.nextLine();
            menu[i]=nombre;
            
            
        }
        System.out.println("Menu:");
        for (int i = 0; i <numeroPlatillos; i++) {//desplegar menu terminado
            
            System.out.println(menu[i]);
        }
        
    }
    public void cocinar() throws InterruptedException{//se le ingresara el nombre del plantillo de acuerdo al menu hecho
        
        System.out.println("ingrese nomrbre del platillo: ");
        String nombrePlatillo = sc.nextLine();
        
        System.out.println("Cocinando "+nombrePlatillo);
        Thread.sleep(1000);
        System.out.println("Comida terminada");
    }
    public void lavarPlatos() throws InterruptedException{
        if(platosSucios==true){
            System.out.println("Lavando...");
            Thread.sleep(1000);
            System.out.println("Platos lavados");
            
        }else{
            System.out.println("Platos limpios");
        }
    }
}
