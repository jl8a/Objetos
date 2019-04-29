
package Parque;


public class Arboles {
    int numArboles;
    String tamaño;
    String tipo;
    boolean seco;

    public Arboles(int numArboles, String tamaño, String tipo, boolean seco) {
        this.numArboles = numArboles;
        this.tamaño = tamaño;
        this.tipo = tipo;
        this.seco = seco;
    }
    
     public Arboles() {
        this.numArboles = 50;
        this.tamaño = "Grande";
        this.tipo = "De sombra";
        this.seco = false;
     }
       public void darSombra(){
            
        }
        public void generarOxigeno(){
    }
    
}
