package Iglesia;
public class Ventana {
    String estado;
    int cantidad;
    public Ventana(String estado, int cantidad) {
        this.estado = estado;
        this.cantidad = cantidad;
    }
    public Ventana(){
        this.estado = "Cerradas";
        this.cantidad = 10;
    }
    public void abrirVentanas() throws InterruptedException{
        System.out.println("Abriendo ventanas...");
        estado = "Abiertas";
        Thread.sleep(2000);
        System.out.println(estado);
    }
    public void cerrarVentanas() throws InterruptedException{
        System.out.println("Cerrando ventanas...");
        estado = "Cerradas";
        Thread.sleep(2000);
        System.out.println(estado);
    }
    public void autoDestruccion() throws InterruptedException{
        for (int i = 3; i > 0; i--) {
            Thread.sleep(1000);
            System.out.println("Las ventanas se auto-destruirán en "+i+" segundos");
        }
        System.out.println("¡Las ventanas se auto-destruyeron exitosamente!");
    }
}
