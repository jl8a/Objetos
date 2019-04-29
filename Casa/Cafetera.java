/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Casa;

import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Cafetera {
    int capacidadAguamL = 2360;     
    int capacidadCafeg = 150;       
    int capacidadAzucarg = 150;    
    int capacidadLechemL = 1180;     
    int aguamL = 0;                 
    int cafeg = 0;                  
    int azucarg = 0;                 
    int lechemL = 0;
    int usos = 0;
    
    public Cafetera() {
    }
    
    public Cafetera(int capacidadAguamL, int capacidadCafeg, int capacidadAzucarg, int capacidadLechemL) {
        this.capacidadAguamL = capacidadAguamL;
        this.capacidadCafeg = capacidadCafeg;
        this.capacidadAzucarg = capacidadAzucarg;
        this.capacidadLechemL = capacidadLechemL;
    }
    
    
    public void pedirCafe() {       //Método para pedir un café.
        System.out.println("¿Cómo se siente hoy respecto a su café? \n 1 - Leve \n 2 - Normalito  \n 3 - Poderoso \n 4 - Paro Cardiaco \n 5 - Cancelar \n ----------------------------------------------------");
        int respCafe = transformaString();
        if(respCafe == 5) {
            System.out.println("Cancelando...");
            return;
        }
        System.out.println("¿Qué tan dulce lo quiere? \n 1 - Amargo Limón \n 2 - Dulce Levesón \n 3 - Dulce Tropical \n 4 - Ventizca de Aguazúcar \n 5 - Cancelar \n ------------------------------------------");
        int respAzucar = transformaString();
        if (respAzucar == 5) {
            System.out.println("Cancelando...");
            return;
        }
        System.out.println("¿Cuánta leche quiere en su café? \n 1 - Una cucharadita \n 2 - Un cuartito \n 3 - Medio \n 4 - Tres Cuartos \n 5 - Cancelar \n --------------------------------------------------");
        int respLeche = transformaString();
        if (respLeche == 5) {
            System.out.println("Cancelando...");
            return;
        }
        int cantidadCafe = transformaReal(respCafe, this.capacidadCafeg);
        int cantidadAzucar = transformaReal(respAzucar, this.capacidadAzucarg);
        int cantidadLeche = transformaReal(respLeche, this.capacidadLechemL);
        checaRecursos(cantidadCafe, cantidadAzucar, cantidadLeche);
    }
    
    public int transformaString() { //Método que transforma String a int.
        int respuesta;
        Scanner scanner = new Scanner(System.in);
        String respString = scanner.nextLine();
        while(!("1".equals(respString) || "2".equals(respString) || "3".equals(respString) || "4".equals(respString) || "5".equals(respString))) {
            System.out.println("Respuesta incorrecta, intente de nuevo.");
            respString = scanner.nextLine();
        }
        respuesta = Integer.parseInt(respString);
        return respuesta;
    }
    
    public int transformaReal(int cantidad, int cantidadMaxima) { //Método que transforma seleccion  de "pedirCafe" a porcentajes.
        int cantidadReal = 0;
        switch (cantidad) {
            case 1:
                cantidadReal = (int)(cantidadMaxima*0.10);
                break;
            case 2:
                cantidadReal = (int)(cantidadMaxima*0.25);
                break;
            case 3:
                cantidadReal = (int)(cantidadMaxima*0.50);
                break;
            case 4:
                cantidadReal = (int)(cantidadMaxima*0.75);
                break;
            default:
                System.out.println("Se produjo algún error, intente de nuevo...");          
        }
        return cantidadReal;
    }
        
    public void checaRecursos(int cafe, int azucar, int leche) { //Método que checa los recursos que quedan en la cafetera.
        if(this.cafeg < cafe) {
            rellenarCafe();
        }
        if(this.azucarg < azucar) {
            rellenarAzucar();
        }
        if(this.lechemL < leche) {
            rellenarLeche();
        }
        hacerCafe(cafe, azucar, leche);
    }
 
    public void hacerCafe(int cafe, int azucar, int leche) { //Método que imprime los resultados de la selección.
        this.cafeg = this.cafeg - cafe;
        this.azucarg = this.azucarg - azucar;
        this.lechemL = this.lechemL - leche;
        this.aguamL = this.aguamL - (this.capacidadLechemL - leche);
        System.out.println("☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺");
        System.out.println("La jarra de café está lista para 5 tazas iguales ☻");
        System.out.println("☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺");
        System.out.println("         {\n" +
"      {   }\n" +
"       }_{ __{\n" +
"    .-{   }   }-.\n" +
"   (   }     {   )\n" +
"   |`-.._____..-'|\n" +
"   |             ;--.\n" +
"   |            (__  \\\n" +
"   |             | )  )\n" +
"   |             |/  /\n" +
"   |             /  / \n" +
"   |            (  /\n" +
"   \\             y'\n" +
"    `-.._____..-'");
        this.usos = this.usos + 1;
        if (this.usos >= 183) {
            System.out.println("Considere limpiar su filtro de la cafetera para extender su periodo de vida ☺");
        }
    }
    
    public void limpiar() { //Método que reinicia los usos
        this.usos = 0;
    }
    
    public void rellenarCafe() { //"Rellena" el café
        this.cafeg = this.capacidadCafeg;
    }
    
    public void rellenarAgua() { //"Rellena" el agua
        this.aguamL = this.capacidadAguamL;
    }
    
    public void rellenarAzucar() { //"Rellena" el azúcar
        this.azucarg = this.capacidadAzucarg;
    }
    
    public void rellenarLeche() { //"Rellena" la leche
        this.lechemL = this.capacidadLechemL;
    }
    
    public void rellenar() { //"Rellena" todos los anteriores
        this.cafeg = this.capacidadCafeg;
        this.aguamL = this.capacidadAguamL;
        this.azucarg = this.capacidadAzucarg;
        this.lechemL = this.capacidadLechemL;
    }
    
    public void muestraDatos() { //Muestra los datos de la cafetera: Capacidades y cantidades restantes.
        System.out.println("---------------------------");
        System.out.println("Capacidad de agua");
        System.out.println(this.capacidadAguamL);
        System.out.println("---------------------------");
        System.out.println("Capacidad de Cafe");
        System.out.println(this.capacidadCafeg);
        System.out.println("---------------------------");
        System.out.println("Capacidad de Azucar");
        System.out.println(this.capacidadAzucarg);
        System.out.println("---------------------------");
        System.out.println("Capacidad de Leche");
        System.out.println(this.capacidadLechemL);
        System.out.println("---------------------------");
        System.out.println("Cantidad actual de agua");
        System.out.println(this.aguamL);
        System.out.println("---------------------------");
        System.out.println("Cantidad actual de café");
        System.out.println(this.cafeg);
        System.out.println("---------------------------");
        System.out.println("Cantidad actual de azúcar");
        System.out.println(this.azucarg);
        System.out.println("---------------------------");
        System.out.println("Cantidad actual de leche");
        System.out.println(this.lechemL);
        System.out.println("---------------------------");
    }
}
