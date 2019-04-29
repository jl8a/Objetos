
package Iglesia;

public class puerta {
    boolean status; //para saber si la puerta esta abierta o cerrada
    int cantidad; // cantidad de puertas que hay en la iglesia

    public puerta(boolean status, int cantidad) {
        this.status = status;
        this.cantidad = cantidad;
    }
    public static void abrir(){
    }
    public static void cerrar(){
    }
    public static void main(String[] args) {
        puerta grand= new puerta(true, 0);
    }
}
