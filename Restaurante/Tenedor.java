
package Restaurante;


public class Tenedor {
    String material;
    String tamaño;
    int numPicos;

    public Tenedor(String material, String tamaño, int numPicos) {
        this.material = material;
        this.tamaño = tamaño;
        this.numPicos = numPicos;
    }
    
      public Tenedor() {
        this.material = "Metal";
        this.tamaño = "Promedio";
        this.numPicos = 4;
    }
      
      public void encajarse (){     
      }
      
      public void sostener(){
          //Sostener la comida 
      }
}
