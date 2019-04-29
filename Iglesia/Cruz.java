/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iglesia;


public class Cruz {
    
    int tamaño; //en metros de alto
    String material;
    double valor;//en pesos mexicanos
    
    public Cruz(int tamaño, String material, double valor) {
        this.tamaño = tamaño;
        this.material = material;
        this.valor = valor;
    }
   public Cruz(){
       this.tamaño=2;
       this.material="Madera y aluminio";
       this.valor=5000;
   }
}
