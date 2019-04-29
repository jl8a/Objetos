/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurante;

import java.util.Scanner;

/**
 *
 * @author Eliza
 */
public class Cuchillo {
    String material, materialDelMango,tipo;
    boolean sucio;
    public Cuchillo(String material, String materialDelMango, String tipo) {
        this.material = material;
        this.materialDelMango = materialDelMango;
        this.tipo = tipo;
    }
   public void Cortar() throws InterruptedException{
       System.out.println("Alimento que se va cortar: ");
       Scanner sc=new Scanner(System.in);
       String comida=sc.nextLine();
       System.out.println("Cortando "+comida+"...");
       Thread.sleep(2000);
       System.out.println("Se ha cortado "+comida+".");
       sucio=true;
   } 
   public void Limpiar() throws InterruptedException{
       System.out.println("Limpiando chuchillo...");
       sucio=false;
       Thread.sleep(2000);
       System.out.println("Cuchillo sucio: "+sucio);
   } 
}
