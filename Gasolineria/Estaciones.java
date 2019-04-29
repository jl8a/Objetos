
package Gasolineria;



public class Estaciones {
   int numero; //Numero de estacines en la gasolinera
    String tamaño; //Tamaño de las estaciones 
    String tipo; // Para conocer el tipo de amplitud
    String estadoestacion; //Concocer el estado en el que se encuentra la estacion
    
    public Estaciones(int numero, String tamaño, String tipo, String estadoestacion) {
        this.numero = numero;
        this.tamaño = tamaño;
        this.tipo = tipo;
        this.estadoestacion = estadoestacion;
    }
    public Estaciones(){
        this.numero= 4;
        this.tamaño="chico";
        this.estadoestacion="malo";
        this.tipo="grande";
    }
    public void soportar() {
        
    }     
    
}
