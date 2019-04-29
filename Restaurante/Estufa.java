
package Restaurante;

//Objeto Restaurante

import java.util.Scanner;


public class Estufa {
    static Scanner scan=new Scanner(System.in);
    int cantidadParrillas;                              // numero de parrillas de la estufa
    boolean [][] parrillas;                            //false=desocupada   true=ocupada
    
    public Estufa(int cantidadParrillas) {
        this.cantidadParrillas = cantidadParrillas;
        this.parrillas = new boolean [cantidadParrillas][1];
    }
    
    public void UsarParrilla(int numParrilla,double temperatura){                  //Pide el numero de parrilla que se va ha utilizar y la temperatura en grados centigrados
        if(numParrilla>cantidadParrillas){
            System.out.println("ERROR, INGRESE UN NUEVO NUMERO DE PARRILLA");
            numParrilla=scan.nextInt();
        }
        if(parrillas [numParrilla-1][0]==true){
            System.out.println("LA PARRILLA YA ESTÁ EN USO");
        }
        else{
        parrillas [numParrilla-1][0]=true;
        System.out.println("LA PARRILLA NUMERO "+numParrilla+" AHORA ESTÁ EN USO, TEMPERATURA: "+temperatura+"°C");
        }
    }
    
    public void ApagarParrilla(int numParrilla){                                   //Pide el numero de parrilla que se va ha apagar
        if(numParrilla>cantidadParrillas){
            System.out.println("ERROR, INGRESE UN NUEVO NUMERO DE PARRILLA");
            numParrilla=scan.nextInt();
        }
        if(parrillas [numParrilla-1][0]==false){
            System.out.println("LA PARRILLA YA ESTÁ APAGADA");
        }
        else{
        parrillas [numParrilla-1][0]=false;
        System.out.println("LA PARRILLA NUMERO "+numParrilla+" YA NO ESTÁ EN USO");
        }
    }
    
    public void VerEstados(){                                                      //Muestra el estado de todas las parrillas
        for (int i = 0; i < cantidadParrillas; i++) {
            if(parrillas [i][0]==false){
                System.out.println("LA PARRILLA "+(i+1)+" ESTÁ DESOCUPADA");
            }
            else{
                System.out.println("LA PARRILLA "+(i+1)+" ESTÁ EN USO");
            }
        }
    }
}
