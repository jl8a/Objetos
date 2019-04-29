
package Gimnasio;


public class BotellaDeAgua {
    String unidadDeMedida;
    int cantidad; //1 litro, 2 litros etc
    String color;
    String material;

    public BotellaDeAgua(String unidadDeMedida, int cantidad, String color, String material) {
        this.unidadDeMedida = unidadDeMedida;
        this.cantidad = cantidad;
        this.color = color;
        this.material = material;
    }
        public BotellaDeAgua() {
        this.unidadDeMedida = "Litros";
        this.cantidad = 1;
        this.color = "Roja";
        this.material = "Plástico";
    }
    
        public void guardar () {
            //guardar agua
        }
        public void abrirse (){
            
        }
}
