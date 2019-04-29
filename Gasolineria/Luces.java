package Gasolineria;
public class Luces {
    String estado;
    public Luces(String estado){
        this.estado = estado;
    }
    public Luces (){
        this.estado = "Encendidas";
    }
    public void Encender() throws InterruptedException{
        System.out.println("Encendiendo luces...");
        estado = "encendidas";
        Thread.sleep(3000);
        System.out.println("Luces "+estado);
    }
    public void Apagar() throws InterruptedException{
        System.out.println("Apagando luces...");
        estado = "apagadas";
        Thread.sleep(3000);
        System.out.println("Luces "+estado);
    }
}