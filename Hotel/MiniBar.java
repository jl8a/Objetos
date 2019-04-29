/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hotel;

/**
 *
 * @author Juan Ramón Bojorquez
 */
public class MiniBar {
    String almacenar[];
    double alto,ancho,volumen;//Estas variables son para poner restricciones a los objetos que quiera almacenar
    double altoObjeto,anchoObjeto,volumenObjeto;
    String objeto;
    boolean insertar;
    String nombreObjeto;

    public MiniBar(String[] almacenar,String nombreObjeto, double alto, double ancho, double altoObjeto, double anchoObjeto, String objeto,double volumen,double volumenObjeto,boolean insertar) {
        this.almacenar = almacenar;
        this.nombreObjeto=nombreObjeto;
        this.alto = alto;
        this.ancho = ancho;
        this.altoObjeto = altoObjeto;
        this.anchoObjeto = anchoObjeto;
        this.objeto = objeto;
        this.volumen=volumen;
        this.volumenObjeto=volumenObjeto;
        this.insertar=insertar;
    }

    public MiniBar() {
        this.almacenar[0] = "x";
        this.nombreObjeto="x";
        this.alto = 0;
        this.ancho = 0;
        this.altoObjeto = 0;
        this.anchoObjeto = 0;
        this.objeto = "x";
        this.volumen=0;
        this.volumenObjeto=0;
        this.insertar=false;
    }
    
    public void Almacenar(){
        int i=0;
        if(volumen<volumenObjeto){
            insertar=true;
            volumen-=volumenObjeto;
            almacenar[i]=nombreObjeto;
            i++;
        }
    }

    public void Sacar(){
        for (int i = 0; i < almacenar.length; i++) {
            //Eliminar el objeto del arreglo almacenar
            if(nombreObjeto.equalsIgnoreCase(almacenar[i])){
            volumen+=volumenObjeto;
            }
        }
        
    }
    
}
