package Gimnasio;
public class Mancuerna {
    int pesoenLibras, cantidad;
    boolean enUso;
    public Mancuerna(int pesoenLibras, int cantidad, boolean enUso) {
        this.pesoenLibras = pesoenLibras;
        this.cantidad = cantidad;
        this.enUso = enUso;
    }
    public Mancuerna(){
        this.pesoenLibras = 15;
        this.cantidad = 20;
        this.enUso = false;
    }
    public void UsarMancuerna(){
        if (enUso) {
            System.out.println("Preparando mancuernas...");
            System.out.println("¡Mancuernas listas para usarse!");
        }else{
            System.out.println("Lo sentimos, no hay mancuernas disponibles.");
        }
    }
    public void autoDestruccion() throws InterruptedException{
        for (int i = 3; i > 0; i--) {
            Thread.sleep(1000);
            System.out.println("Las mancuernas se auto-destruirán en "+i+" segundos");
        }
        System.out.println("¡Las mancuernas se auto-destruyeron exitosamente!");
    }
}
