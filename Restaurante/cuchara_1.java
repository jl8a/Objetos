package Restaurante;

public class cuchara_1 {
    boolean status; // disponibilidad de la cuchara
    int numCucharas; //cantidad de cucharas que hay en el restaurante 

    public cuchara_1(boolean status, int numCucharas) {
        this.status = status;
        this.numCucharas = numCucharas;
    }
    
    public static void disponible(){
    }
    public static void cantidad(){
    }
    public static void main(String[] args) {
        cuchara_1 cm = new cuchara_1(true, 0);
    }
}
