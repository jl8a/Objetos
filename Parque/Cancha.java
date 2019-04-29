package Parque;

public class Cancha {

    String tipo;//fútbol, básquetbol
    String material;//cemento, sintetico, pasto natural
    String estado;//Estado actual en el que se encuentra la cancha
    boolean disponible;//si se está usando o no

    public Cancha(String tipo, String material, String estado) {
        this.tipo = tipo;
        this.material = material;
        this.estado = estado;
    }

    public Cancha() {
        this.tipo = "Fútbol";
        this.material = "Sintético";
        this.estado = "Bueno";
    }

    public void jugarFutbol(boolean disponible) {
        if (disponible == true) {
            System.out.println("Las cancha esta sola, puedes jugar fútbol.");
        } else {
            System.out.println("La cancha esta ocupada, no la podras usar");
        }
    }

    public void jugarBasquet(boolean disponible) {
        if (disponible == true) {
            System.out.println("La cancha esta disponible para que la uses para jugar básquetbol");
        }else{
            System.out.println("La cancha esta ocupada, no la podras usar"); 
        }
    }
}
