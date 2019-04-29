/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Casa;

/**
 *
 * @author Karen Ornelas
 */
public class Ventanas {
    Double alto;
    Double ancho;
    int cantidad;
    String colorMarco;
    boolean rejas;

    public Ventanas(Double alto, Double ancho, int cantidad, String colorMarco, boolean rejas) {
        this.alto = alto;
        this.ancho = ancho;
        this.cantidad = cantidad;
        this.colorMarco = colorMarco;
        this.rejas = rejas;
    }
    
    public Ventanas() {
        this.alto = 5.23;
        this.ancho = 6.3;
        this.cantidad = 3;
        this.colorMarco = "negro";
        this.rejas = true;
    }

    public Double getAlto() {
        return alto;
    }

    public void setAlto(Double alto) {
        this.alto = alto;
    }

    public Double getAncho() {
        return ancho;
    }

    public void setAncho(Double ancho) {
        this.ancho = ancho;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getColorMarco() {
        return colorMarco;
    }

    public void setColorMarco(String colorMarco) {
        this.colorMarco = colorMarco;
    }

    public boolean isRejas() {
        return rejas;
    }

    public void setRejas(boolean rejas) {
        this.rejas = rejas;
    }
    
    
      
    
public static void AbrirVentana(){
    
    
    System.out.println("Abriendo ventana...");

    System.out.println();
    System.out.println("Abriendo ventana...");
    System.out.println();
    System.out.println("*VENTANA ABIERTA.*");
    
}

public static void CerrarVentana(){
      System.out.println("Cerrando ventana...");
    System.out.println();
    System.out.println("Cerrando ventana...");
    System.out.println();
    System.out.println("*VENTANA CERRADA.*");
    
}

    
    Ventanas ventana1 = new Ventanas (5.3,2.6,3,"azul", true);
    
    
    
   public static void ConsultarVentanas(int cantidad, String color, boolean rejas){
       System.out.println("La casa tiene " + cantidad + "Ventanas de : " + color + "tiene rejas :"+ rejas );
   }
    
    
    
    
}
