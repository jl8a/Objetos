package Parque;
public class Columpios {
    String estado;
    boolean enUso;
    public Columpios(boolean enUso, String estado) {
        this.enUso = enUso;
        this.estado = estado;
    }
    public Columpios(){
        this.enUso = false;
        this.estado = "Buen estado";
    }
    public void usarColumpios(){
        if (enUso) {
            System.out.println("Lo sentimos, los columpios ya están en uso.");
        }else{
            System.out.println("Preparando columpios...");
            enUso = true;
            System.out.println("Columpios preparados con éxito.");
        }
    }
    public void autoDestruccion() throws InterruptedException{
        for (int i = 3; i > 0; i--) {
            Thread.sleep(1000);
            System.out.println("Los columpios se auto-destruirán en "+i+" segundos");
        }
        System.out.println("¡Los columpios se auto-destruyeron exitosamente!");
    }
}
