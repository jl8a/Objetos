
package Parque;


public class Fuente_2 {
    String material; //
    String liquido;
    String tamaño;

    public Fuente_2(String material, String liquido, String tamaño) {
        this.material = material;
        this.liquido = liquido;
        this.tamaño = tamaño;
    }
    public Fuente_2(){
        this.material="Piedra";
        this.liquido="agua";
        this.tamaño="mediana";      
    }
    public void mojar(){
        //rociar agua
    }
    
}
