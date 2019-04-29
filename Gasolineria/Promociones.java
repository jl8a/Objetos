package Gasolineria;

public class Promociones {
    boolean status; //disponibilidad del letrero
    int cantProm; //cantidad de promociones por letreo

    public Promociones(boolean status, int cantProm) {
        this.status = status;
        this.cantProm = cantProm;
    }
    public static void disponible() {
    }
    public static void cantidad(){
    }
    public static void main(String[] args) {
        Promociones gaso = new Promociones(true, 1);
    }
    
}
