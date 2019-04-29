
package Gimnasio;

 
public class Foco {

 String tipo;
 int precio;
 String color;//color de la luz que emite
 String marca;        

    public Foco(String tipo, int precio, String color, String marca) {
        this.tipo = tipo;
        this.precio = precio;
        this.color = color;
        this.marca = marca;
    }
    public Foco(){
        this.tipo="Ahorrador";
        this.precio=400;
        this.color="Luz blanca";
        this.marca="Itachi";
                
    }
    public void iluminar() {
        
    }
    public void calentar(){
        //calentar el entorno 
    }
}
