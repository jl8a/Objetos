package Restaurante;
public class Silla {
    int cantidad;
    String material, estado;
    public Silla(int cantidad, String material, String estado) {
        this.cantidad = cantidad;
        this.material = material;
        this.estado = estado;
    }
    public Silla(){
        this.estado = "Disponible";
        this.material = "Madera";
        this.cantidad = 50;
    }
}
