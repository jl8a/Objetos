package Iglesia;

public class Rosario {
    String color;
    String materiales;
    String tamaño;//chico(bolsillo), mediano(collar)

    public Rosario(String color, String materiales, String tamaño) {
        this.color = color;
        this.materiales = materiales;
        this.tamaño = tamaño;
    }
    
    public Rosario() {
        this.color = "cafe";
        this.materiales = "Madera";
        this.tamaño = "Mediano";
    }
    
    public void rezar(){
        System.out.println("Agarras fuerte el rosario mientras rezas...");
    }
    
}
