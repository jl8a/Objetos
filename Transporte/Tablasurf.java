
package Transporte;


public class Tablasurf {
    String material;
    String marca;
    String color;
    int precio;

    public Tablasurf(String material, String marca, String color, int precio) {
        this.material = material;
        this.marca = marca;
        this.color = color;
        this.precio = precio;
    }
    public Tablasurf(){
        this.material="Madera";
        this.marca="Patito";
        this.color="Purpura";
        this.precio=100000;
    }
    public void surfear(){
        //Moverse en las olas del mar
    }
    public void nadar(){
        
    }
}