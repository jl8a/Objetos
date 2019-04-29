package Gimnasio;

//Objeto que suele estar presente para permitir que los usuarios compartan
//fotos de su experiencia en el gimnasio.
public class Espejo {
    boolean limpio;
    boolean roto;
    double largo, ancho;
    String localizacion;
    
    //Crea un espejo sin especificar datos
    public Espejo() {
        this.limpio = true;
        this.roto = false;
        this.largo = -1;
        this.ancho = -1;
        this.localizacion = "Indefinido";
    }
    
    //Crea un espejo especificando su estado (si se encuentra limpio y/o roto)
    public Espejo(boolean limpio, boolean roto) {
        this.limpio = limpio;
        this.roto = roto;
        this.largo = -1;
        this.ancho = -1;
        this.localizacion = "Indefinido";
    }
    
    //Crea un espejo especificando su estado, su localizacion y sus medidas
    public Espejo(boolean limpio, boolean roto, double largo, double ancho, String localizacion) {
        this.limpio = limpio;
        this.roto = roto;
        this.largo = largo;
        this.ancho = ancho;
        this.localizacion = localizacion;
    }
    
    //Muestra el estado de limpieza del espejo
    public void mostrarLimpio() {
        System.out.println((limpio == true) ? "El espejo se encuentra limpio." : "El espejo se encuentra sucio.");
    }
    
    //Muestra si el espejo se encuentra roto
    public void mostrarRoto() {
        System.out.println((roto == true) ? "El espejo se encuentra roto." : "El espejo no se encuentra roto.");
    }
    
    //Cambia el estado de limpieza y especifica si el espejo se encuentra roto
    public void modificarEstado(boolean limpio, boolean roto) {
        this.limpio = limpio;
        this.roto = roto;
        mostrarLimpio();
        mostrarRoto();
    }
    
    //Muestra las dimensiones del espejo
    public void mostrarDimensiones() {
        if ((largo == -1) || (ancho == -1)) {
            System.out.println("No se especificaron las dimensiones del espejo.");
        }
        else {
            System.out.println("Largo: "+largo);
            System.out.println("Ancho: "+ancho);
        }
    }
    
    //Cambia las dimensiones del espejo
    public void modificarDimensiones(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
        mostrarDimensiones();
    }
    
    //Muestra la localizacion del espejo
    public void mostrarLocalizacion() {
        System.out.println("Localizacion: "+localizacion);
    }
    
    //Cambia la localizacion del espejo
    public void modificarLocalizacion(String localizacion) {
        this.localizacion = localizacion;
        mostrarLocalizacion();
    }
    
    //Refleja
    public void reflejar() {
        System.out.println("kuchau");
    }
}
