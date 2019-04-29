package Gimnasio;

public class Barras {
    boolean status; //disponibilidad de las barras
    int cantidad; //cantidad de barras que hay
    int peso; //peso de las barras

    public Barras(boolean status, int cantidad, int peso) {
        this.status = status;
        this.cantidad = cantidad;
        this.peso = peso;
    }
    public static void disponible(){
    }
    public static void cantidad(){
    }
    public static void main(String[] args) {
        Barras gym = new Barras(true, 0, 0);
    }
}
