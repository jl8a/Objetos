package Casa;
public class Television {
    String estado, tamaño, nivelDefinicion, marca;
    public Television(String estado, String tamaño, String nivelDefinicion, String marca) {
        this.estado = estado;
        this.tamaño = tamaño;
        this.nivelDefinicion = nivelDefinicion;
        this.marca = marca;
    }
    public Television(){
        this.estado = "Apagado";
        this.marca = "SAMSUNG";
        this.nivelDefinicion = "Alta Definición";
        this.tamaño = "Grande";
    }
    public void Encender(){
        System.out.println("Encendiendo televisión...");
        estado = "Encendido";
        System.out.println(estado);
    }
    public void Apagar(){
        System.out.println("Apagando televisión...");
        estado = "Apagado";
        System.out.println(estado);
    }
    public void autoDestruccion() throws InterruptedException{
        for (int i = 3; i > 0; i--) {
            Thread.sleep(1000);
            System.out.println("La televisión se auto-destruirá en "+i+" segundos");
        }
        System.out.println("¡La televisión se auto-destruyó exitosamente!");
    }
}
