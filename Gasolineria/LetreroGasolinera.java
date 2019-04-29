
package Gasolineria;

public class LetreroGasolinera {
    int prendido;
    boolean estado;

    public LetreroGasolinera(int prendido, boolean estado) {
        this.prendido = prendido;
        this.estado = estado;
    }
    
    //Da valores por default a los atributos
    public LetreroGasolinera() {
        this.prendido = 7;
        this.estado = true;
    }
    
    //Este metodo te dice si el letrero está encendido o apagado y si no funciona
    public void LetreroEncendido (int prendido, boolean estado){
        if (estado == true ) {
            if (prendido >= 7 && prendido < 23) {
            System.out.println("El letrero está encendido");
            } else {
            System.out.println("El letrero está apagado");
            }
        } else {
            System.out.println("El letrero está fallando, necesita mantenimiento");
        }
    }
    
}
