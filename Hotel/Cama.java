
package Hotel;


public class Cama {
    String tamaño;
    String marca;
    double largo;
    double ancho;
    String tipo;
    String comodidad;

    public Cama(String tamaño, String marca, double largo, double ancho, String tipo, String comodidad) {
        this.tamaño = tamaño;
        this.marca = marca;
        this.largo = largo;
        this.ancho = ancho;
        this.tipo = tipo;
        this.comodidad = comodidad;
    }
    public Cama(){
        this.tamaño= "grande";
        this.marca= "patito";
        this.largo=203;
        this.ancho=101;
        this.tipo="matrimonial";
        this.comodidad="mala";
    }
    public void retener (){
        
    }
   
}
