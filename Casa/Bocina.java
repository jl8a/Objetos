/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Casa;

import java.util.Scanner;

/**
 *
 * @author Julissa
 */
    
public class Bocina {

    int volumen;
    boolean estado=true;
    int señal;
    
    Scanner resp = new Scanner(System.in);
    
    public Bocina() {
    }
    

    public Bocina(int volumen, boolean estado,int señal) {
        this.volumen = volumen;
        this.estado = estado;
        this.señal = señal;
       
    }
    public void encender() throws InterruptedException{
        if(estado==true){
          System.out.println("encendiendo bocinas...");
             Thread.sleep(1000);
             System.out.println("Listo!");  
        }else{
            System.out.println("Apagando bocinas...");
        }
            
             
        
       
    }
    public void conexion(){
        System.out.println("Se cuenta con conexión wifi y bluetooth:");
        System.out.println("ingrese 1 si es wif o 2 si es bluetooth");
        System.out.println("¿Como se conectara?");
        int señal= resp.nextInt();
        if(señal==1){
            System.out.println("Conectado por wifi");
        }else if(señal==2){
            System.out.println("Conectado por Bluetooth");
        }
        
    }
    public void volumenBocina(){
    
    System.out.println("Ingrese de una escala del 0 al 10");
    System.out.println("Nievel de volumen: ");
    int volumen = resp.nextInt();  
}

}



