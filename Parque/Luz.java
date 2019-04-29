package Parque;

//Luz que suele encontrarse en lugares publicos.
public class Luz {
    String localizacion;
    boolean encendido;
    boolean reparacion;
    
    //Crea una luz sin especificar datos
    public Luz() {
        this.localizacion = "Indefinido";
        this.encendido = false;
        this.reparacion = false;
    }
    
    //Crea una luz especificando localizacion
    public Luz(String localizacion) {
        this.localizacion = localizacion;
    }
    
    //Crea una luz especificando datos
    public Luz(String localizacion, boolean encendido, boolean reparacion) {
        this.localizacion = localizacion;
        this.encendido = encendido;
        this.reparacion = reparacion;
    }
    
    //Muestra la localizacion de la luz
    public void mostrarLocalizacion() {
        System.out.println("Localizacion: "+localizacion);
    }
    
    //Cambia la localizacion de la luz
    public void modificarLocalizacion(String localizacion) {
        this.localizacion = localizacion;
        mostrarLocalizacion();
    }
    
    //Muestra si la luz se encuentra encendida
    public void mostrarEncendido() {
        System.out.println((encendido == true) ? "La luz se encuentra encendida." : "La luz se encuentra apagada.");
    }
    
    //Cambia el estado de la luz (encendido o apagado)
    public void modificarEstado(boolean encendido) {
        this.encendido = encendido;
        mostrarEncendido();
    }
    
    //Muestra si la luz requiere reparacion
    public void mostrarReparacion() {
        System.out.println((reparacion == true) ? "Requiere reparacion." : "No requiere reparacion.");
    }
    
    //Modifica la necesidad de reparaciones de la luz
    public void requerirReparacion(boolean reparacion) {
        this.reparacion = reparacion;
        mostrarReparacion();
    }
    
    //Ilumina
    public void iluminar() {
        System.out.println("kuchau");
    }
}
