/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parque;



/**
 *
 * @author MI
 */
public class RociadoresDeRiego {
    
    boolean rocear;

    public RociadoresDeRiego(boolean rocear) {
        this.rocear = rocear;
    }
    public RociadoresDeRiego() {
       
    }
    
    public void regar(int tiempo) throws InterruptedException  {
//ingresar tiempo suponiendo que es en segundos
        if(rocear == true){
        System.out.println("Regando por "+tiempo+" segundos");
        tiempo = tiempo*1000; //convirtiendo a segundos
        Thread.sleep(tiempo);
        System.out.println("Tiempo terminado");  
        }else{
            System.out.println("Rociadores sin usar");
        }
        
    }
}
