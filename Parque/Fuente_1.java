
package Parque;

import java.util.Scanner;

public class Fuente_1 {       
Scanner scan=new Scanner(System.in);
boolean estado;                                                                 // false=apagada  true= encendida
int cantSalidas;                                                                 //cantidad de salidas o chorros de agua
boolean [][] salidas;                                                            //Contiene el estado de los chorros de agua       false=apagada  true= encendida

    public Fuente_1(int cantSalidas) {
        this.cantSalidas = cantSalidas;
        this.salidas=new boolean [cantSalidas][1];
    }

public void EncenderFuente(){                                                   //Enciende la fuente (al encenderse no enciende las salidas, solo la fuente)
    if(estado==true){
        System.out.println("LA FUENTE YA ESTÁ ENCENDIDA");
    }
    else{
        estado=true;
        System.out.println("FUENTE ENCENDIDA");
    }
}

public void ApagarFuente (){                                                    //Apaga la fuente y todas las salidas
    if(estado==false){
        System.out.println("LA FUENTE YA ESTÁ APAGADA");
    }
    else{
        estado=false;
        System.out.println("FUENTE APAGADA");
        for (int i = 0; i < cantSalidas; i++) {
            salidas[i][0]=false;
        }
    }
}

public void EncenderSalida (int numsalida){                                         //Indica la salida que se va ha encender
    if(numsalida>cantSalidas){
        System.out.println("ERROR FUERA DEL LIMITE, ESCOGA UNA NUEVA SALIDA");
        numsalida=scan.nextInt();
    }
    if(estado==false){
        System.out.println("ERROR, LA FUENTE DEBE ESTAR ENCENDIDA PARA ENCENDER LAS SALIDAS");
    }
    else{
        if(salidas[numsalida-1][0]==true){
            System.out.println("LA SALIDA NUMERO "+numsalida+" YA ESTÁ ENCENDIDA");
        }
        else{
            salidas[numsalida-1][0]=true;
            System.out.println("LA SALIDA NUMERO "+numsalida+" ENCENDIDA");
        }
    }
}

public void ApagarSalida (int numsalida){                                            //Indica la salida que se va ha apagar
    if(numsalida>cantSalidas){
        System.out.println("ERROR FUERA DEL LIMITE, ESCOGA UNA NUEVA SALIDA");
        numsalida=scan.nextInt();
    }
    if(estado==false){
        System.out.println("LA FUENTE YA SE ENCUENTRA APAGADA, POR LO QUE TODAS LAS SALIDAS SE ENCUENTRAN APAGADAS");
    }
    else{
        if(salidas[numsalida-1][0]==false){
            System.out.println("LA SALIDA NUMERO "+numsalida+" YA ESTÁ APAGADA");
        }
        else{
            salidas[numsalida-1][0]=false;
            System.out.println("LA SALIDA NUMERO "+numsalida+" APAGADA");
        }
    }
}

public void EncenderTodasLasSalidas (){                                                  //Enciende todas las salidas
    if(estado==false){
        System.out.println("ERROR, LA FUENTE DEBE ESTAR ENCENDIDA");
    }
    else{
    for (int i = 0; i < cantSalidas; i++) {
        if(salidas[i][0]==true){
            System.out.println("LA SALIDA NUMERO "+(i+1)+" YA ESTÁ ENCENDIDA");
        }
        else{
            salidas[i][0]=true;
            System.out.println("SALIDA NUMERO "+(i+1)+" ENCENDIDA");
        }
    }
    }
}
 
public void ApagarTodasLasSalidas (){                                                   //Apaga todas las salidas
    if(estado==false){
        System.out.println("LA FUENTE YA SE ENCUENTRA APAGADA, POR LO QUE TODAS LAS SALIDAS ESTÁN APAGADAS");
    }
    else{
    for (int i = 0; i < cantSalidas; i++) {
        if(salidas[i][0]==false){
            System.out.println("LA SALIDA NUMERO "+(i+1)+" YA ESTÁ APAGADA");
        }
        else{
            salidas[i][0]=false;
            System.out.println("SALIDA NUMERO "+(i+1)+" APAGADA");
        }
    }
    }
}

public void VerEstados (){
    for (int i = 0; i < cantSalidas; i++) {
        if(salidas[i][0]==false){
            System.out.println("FUENTE NUMERO "+(i+1)+" APAGADA");
        }
        else{
            System.out.println("FUENTE NUMERO "+(i+1)+" ENCENDIDA");
        }
    }
}
}
