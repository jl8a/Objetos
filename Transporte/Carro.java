package Transporte;
public class Carro {
    boolean estado;
    int lugaresDisponibles;
    public Carro(boolean estado, int lugaresOcupados) {
        this.estado = estado;
        this.lugaresDisponibles = lugaresOcupados;
    }
    public Carro(){
        this.estado = true;
        this.lugaresDisponibles = 8;
    }
    public void usarCarro() throws InterruptedException{
        if (estado) {
            System.out.println("Preparando carro...");
            Thread.sleep(2000);
            System.out.println("Auto preparado.");
        }
        else{
            System.out.println("Lo sentimos, no esta disponible");
        }
    }
    public void autoDestruccion() throws InterruptedException{
        for (int i = 3; i > 0; i--) {
            Thread.sleep(1000);
            System.out.println("Los autos disponibles se auto-destruirán en "+i+" segundos");
        }
        System.out.println("¡Los autos se auto-destruyeron exitosamente!");
    }
}
