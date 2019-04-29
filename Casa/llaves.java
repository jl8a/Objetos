 
package Casa;

    



public class llaves {
    int cantidad;
    String material;
    String color;
    String marca; 

    public llaves(int cantidad, String material, String color, String marca) {
        this.cantidad = cantidad;
        this.material = material;
        this.color = color;
        this.marca = marca;
    }
    public llaves(){
        this.cantidad=9;
        this.material="alumnio";
        this.color="palteado";
        this.marca="naruto";
        
        
    }
    public void abrir(){
        //abrir puerta
    }
    public void cerrar(){
        //cerrar puerta
    }
}


