
package Iglesia;

import java.util.Scanner;

public class Ventilador {
    Scanner scan = new Scanner (System.in);
    String identificador;                                                       //Nombre para referirse al ventildor
    String localizacion;                                                        //Ubicación del ventilador
    boolean estado;                                                             // false =Apagado  true=Encendido
    int numVelocidades;                                                         // Numero de velocidades del ventilador
    int velocidadActual;                                                        // Indica en que velocidad se encuentra el ventilador, si es 0 significa que se encuentra apagado
    boolean rotar;                                                              // false =No está rotando  true=Está rotando

    //Sin datos
    public Ventilador() {
        this.identificador = "";
        this.localizacion = "";
        this.numVelocidades = 0;
    }
    
    
    //Con datos
    public Ventilador(String identificador, String localizacion, int numVelocidades) {
        this.identificador = identificador;
        this.localizacion = localizacion;
        this.numVelocidades = numVelocidades;
    }
    
    public void Encender (){
         if (estado==true){
            System.out.println(identificador+" YA SE ENCUENTRA ENCENDIDO");
        }
        else{
            estado=true;
            System.out.println(identificador+" ENCENDIDO");
            velocidadActual=1;
        }
    }
    
     public void Apagar (){
        if (estado==false){
            System.out.println(identificador+" YA SE ENCUENTRA APAGADO");
        }
        else{
            estado=false;
            System.out.println(identificador+" APAGADO");
            velocidadActual=0;
            rotar=false;
        }
    }
     
     public void CambiarVelocidad (int nuevaVelocidad){
        while ((nuevaVelocidad<0)||(nuevaVelocidad>numVelocidades))
        {
            System.out.println("DATO ERRONEO, INTRODUZCA OTRA VELOCIDAD");
            nuevaVelocidad=scan.nextInt();
        }
        velocidadActual=nuevaVelocidad;
        if (velocidadActual==0){
            System.out.println(identificador+" APAGADO");
        }
        else{
            System.out.println("EL VENTILADOR "+identificador+" SE ENCEUNTRA EN LA VELOCIDAD "+velocidadActual);
        }
     }
     
     public void ActivarRotacion (){
        if (rotar==true){
            System.out.println(identificador+" YA SE ENCUENTRA ROTANDO");
        }
        else{
            rotar=true;
            System.out.println(identificador+" AHORA SE ENCUENTRA ROTANDO");
        }
     }
     
     public void DesactivarRotacion (){
         if (rotar==false){
            System.out.println("EL MODO ROTACION DE "+identificador+" YA SE ENCUENTRA DESACTIVADO");
        }
        else{
            rotar=false;
            System.out.println(identificador+" YA NO SE ENCUENTRA ROTANDO");
        }
     }
     
     public void CambiarLocalizacion (String nuevaLocalizacion){
         localizacion=nuevaLocalizacion;
         System.out.println("LA NUEVA LOCALIZACIÓN DEL VENTILADOR "+identificador+" ES: "+localizacion);
     }
     
     public void CambiarIdentificador (String nuevoIdentificador){
         System.out.println("EL IDENTIFICADOR DEL VENTILADOR "+identificador+" AHORA ES: "+nuevoIdentificador);
         identificador=nuevoIdentificador;
     }
     
     public void VerInformacion (){
         System.out.println("");
         System.out.println("INFORMACION DE: "+identificador);
         if(estado==true){
            System.out.println("ESTADO: ENCENDIDO");
         }
         else{
            System.out.println("ESTADO: APAGADO");
         }
         System.out.println("UBICACIÓN: "+localizacion);
         if(rotar==true){
            System.out.println("MODO ROTACIÓN: ACTIVADO");
         }
         else{
            System.out.println("MODO ROTACIÓN: DESACTIVADO");
         }
         System.out.println("VELOCIDAD ACTUAL: "+velocidadActual);
         
     }
}
