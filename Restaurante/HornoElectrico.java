/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurante;

import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author jorge
 */
public class HornoElectrico {
    int temperaturaC = 0;
    int temperaturaF = 0;
    int segundos = 0;
    int tiempoEstablecido = 0;
    boolean ocupado = false;
    
    public HornoElectrico() {
    }
    
    public void setTimer(int minutos) { //Establece un timer y transforma minutos a segundos.
        if (minutos > 30) {
            System.out.println("No válido, intente de nuevo");
            return;
        }
        if (this.temperaturaC == 0 || this.temperaturaF == 0) {
            System.out.println("Por favor primero ajuste la temperatura");
            return;
        }
        if (this.ocupado == true) {
            System.out.println("Hay un trabajo en progreso, vuelva a intentar más tarde.");
            return;
        }
        this.tiempoEstablecido = (minutos*60);
        this.ocupado = true;
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                segundos++;
                if((segundos+1) > tiempoEstablecido) {
                    System.out.println("¡Se ha terminado!");
                    timer.cancel();
                }
            }
        };
        timer.scheduleAtFixedRate(task, 0, 1000);
        this.segundos = 0;
        this.temperaturaF = 0;
        this.temperaturaC = 0;
    }
    
    public void setTemperaturaC(int temperatura) { //Establece una temperatura en grados celsius
        if(temperatura > 235 || temperatura < 65) {
            System.out.println("No válido, intente de nuevo");
        } else {
            this.temperaturaC = temperatura;
            this.temperaturaF = (int)((this.temperaturaC*(9/5))+32);
        }
        System.out.println("Temperatura ajustada a " + temperatura + "°C");
    }
    
    public void setTemperaturaF(int temperatura) { //Establece una temperatura en grados fahrenheit.
        if(temperatura > 450 || temperatura < 150) {
            System.out.println("No válido, intente de nuevo.");
        } else {
            this.temperaturaF = temperatura;
            this.temperaturaC = (int)((this.temperaturaF-32)*(5/9));
        }
        System.out.println("Temperatura ajustada a " + temperatura + "°F");
    }
}
