/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gimnasio;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Empuñadura {
    int peso = 20;
    int sexo = 3;
    
    public Empuñadura() {
        
    }
    
    public void ajustarPesoMax(int peso) { //Ajusta el Peso Máximo
        if(peso > 80 || peso < 9) {
            System.out.println("No válido, intente de nuevo.");
        } else {
            this.peso = peso;
        }
    }
    
    public void ajustarSexo(int sexo) { //Ajusta el Sexo para el diagnóstico de fuerza.
        if(this.sexo == 1 || this.sexo == 2) {
            this.sexo = sexo;
            System.out.println("Se ha cambiado la configuración de sexo para la medición.");
        }
    }
    
    public void presionar(int fuerza) throws InterruptedException { //Presiona la empuñadura y muestra la estadística.
        if (this.sexo == 3) {
            System.out.println("Favor de seleccionar primero un sexo para realizar la medición apropiada.");
            System.out.println("Ingrese su sexo de nacimiento, por favor... \n 1 - Hombre \n 2 - Mujer ");
            this.sexo = transformaString();
        }
        System.out.println("<-----------------INICIANDO MEDICIÓN--------------->");
        if (fuerza > this.peso) {
            fuerza = this.peso;
            System.out.println("Usted ha presionado al máximo la empuñadura, por lo cual el marcador está al límite.");
        }
        Thread.sleep(1500);
        System.out.println("----------------------------------------------------");
        System.out.println("Para la fuerza de " + fuerza + " kg que ha aplicado...");
        if ((fuerza > 64 && sexo == 1) || (fuerza > 38 && sexo == 2)) {
            System.out.println("Tiene usted excelente fuerza, atleta. Temería hacerle enojar.");
        }
        else if ((fuerza >= 56 && sexo == 1) || (fuerza >= 34 && sexo == 2)) {
            System.out.println("Tiene usted muy buena fuerza, atleta. Aún es posible progresar ☺");
        }
        else if ((fuerza >= 52 && sexo == 1) || (fuerza >= 30 && sexo == 2)) {
            System.out.println("Su fuerza está sobre el promedio, atleta.");
        }
        else if ((fuerza >= 48 && sexo == 1) || (fuerza >= 26 && sexo == 2)) {
            System.out.println("Usted, atleta, posee una fuerza promedio.");
        }
        else if ((fuerza >= 44 && sexo == 1) || (fuerza >=23 && sexo == 2)) {
            System.out.println("Posee una fuerza debajo del promedio, atleta.");
        }
        else if ((fuerza >= 40 && sexo == 1) || (fuerza >= 20 && sexo == 2)) {
            System.out.println("Tiene una fuerza pobre, atleta. Ejercite más esa fuerza ☺");
        }
        else {
            System.out.println("Su fuerza es muy pobre atleta, pero no se rinda.");
        }
        System.out.println("----------------------------------------");
        Thread.sleep(1500);
    }
    
     private int transformaString() { //Transforma String a int.
        int respuesta;
        Scanner scanner = new Scanner(System.in);
        String respString = scanner.nextLine();
        while(!(respString.equals("1") || respString.equals("2"))) {
            System.out.println("Respuesta incorrecta, intente de nuevo.");
            respString = scanner.nextLine();
        }
        respuesta = Integer.parseInt(respString);
        return respuesta;
    }
    
}
