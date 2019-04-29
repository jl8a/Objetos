/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gimnasio;

/**
 *
 * @author YesicaIrasema
 */
public class Bocinas {
     int volumen;
    boolean encendido;

    public Bocinas(int volumen, boolean encendido) {
        this.volumen = volumen;
        this.encendido = encendido;
    }
    public Bocinas() {
        this.volumen = 68;
        this.encendido = true;
    }
    
    public void Encender(boolean encendido) throws InterruptedException{
        if (encendido==true) {
            System.out.print("♪♫☼• B");
            Thread.sleep(500);
            System.out.print("I");
            Thread.sleep(500);
            System.out.print("E");
            Thread.sleep(500);
            System.out.print("N");
            Thread.sleep(500);
            System.out.print("V");
            Thread.sleep(500);
            System.out.print("E");
            Thread.sleep(500);
            System.out.print("N");
            Thread.sleep(500);
            System.out.print("I");
            Thread.sleep(500);
            System.out.print("D");
            Thread.sleep(500);
            System.out.println("O ♪♫☼•");
            Thread.sleep(500);
            System.out.print("Hora de hacer ejercicio!!!"); 
        }else{
            System.out.print("♪♫☼• B");
            Thread.sleep(500);
            System.out.print("Y");
            Thread.sleep(500);
            System.out.println("E ♪♫☼•"); 
            Thread.sleep(500);
            System.out.print("Hasta pronto!!!"); 
        }
      
    }
    
    public void CambiarVolumen (int volumen){
        if (volumen == 100) {
            System.out.println("♪♫☼• Volumen cambiado a: "+volumen+" ♪♫☼•");
            System.out.println("Este es el volumen maximo");
        }else{
            System.out.println("♪♫☼• Volumen cambiado a: "+volumen+" ♪♫☼•");
        }
        if (volumen == 0) {
            System.out.println("     ... Mute ...");
        }
    }
}
