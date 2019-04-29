package Restaurante;


//Clase Extrator de Humo que contiene los atributos estado del extractor y
//si está encendido
public class ExtractorDeHumo {
    boolean estado;
    boolean encendido;

    //Crea el Extractor especificando su estado y si está encendido
    public ExtractorDeHumo(boolean estado, boolean encendido) {
        this.estado = estado;
        this.encendido = encendido;
    }

    //Crea una mesa especificando que el extractor se encuentra en buen estado
    //y está apagado por default
    public ExtractorDeHumo() {
    this.estado = true;
    this.encendido = false;
    }
    
    //Imprime el estado del extractor si necesita un servicio o no
    public void EstadoExtractor() throws InterruptedException{
        if (estado==false){
            System.out.println("El Extractor no está funcionando...");
            Thread.sleep(2000);
            System.out.println("Necesita servicio");
            for (int i = 0; i < 3; i++) {
                System.out.println("dst...");
                Thread.sleep(1000);
            }
        } else {
            System.out.println("¡El extractor funciona!.");
        }
    }
    
    //Imprime si el extractor se encendió o necesita mantenimiento
    public void EncenderExtractor(boolean estado, boolean encendido){
        if (estado == false){
            if (encendido == true){
                System.out.println("El extractor está encendido.");
                System.out.println("Extrayendo humo...");
                System.out.println("duuuu...");
            } else {
                System.out.println("El extractor ya está encendido.");
            }
        } else {
            System.out.println("El extractor no está funcionando. Ocupan mantenimiento.");
        }
    }
    
    //Imprime el si el extractor está apagado
    public void ApagarExtractor(boolean estado, boolean encendido){
        if (estado == true){
            if (encendido == false){
                System.out.println("El extractor ya está apagado.");
            } else {
                System.out.println("El extractor está encendido.");
            }
        } else {
            System.out.println("El extractor no está funcionando. Ocupan mantenimiento.");
        }
    }
    
}
