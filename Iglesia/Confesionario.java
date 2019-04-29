package Iglesia;

//Objeto al que acuden sacerdotes y creyentes.
public class Confesionario {
    boolean reparacion;
    boolean enUso;
    String localizacion;
    
    //Crea un confesionario sin especificar datos
    public Confesionario() {
        this.reparacion = false;
        this.enUso = false;
        this.localizacion = "Indefinido";
    }
    
    //Crea un confesionario especificando localizacion
    public Confesionario(String localizacion) {
        this.reparacion = false;
        this.enUso = false;
        this.localizacion = localizacion;
    }
    
    //Crea un confesionario especificando datos
    public Confesionario(boolean reparacion, boolean enUso, String localizacion) {
        this.reparacion = reparacion;
        this.enUso = enUso;
        this.localizacion = localizacion;
    }
    
    //Muestra si se requiere reparacion
    public void mostrarReparacion() {
        System.out.println((reparacion == true) ? "Requiere reparacion." : "No requiere reparacion.");
    }
    
    //Modifica la necesidad de reparaciones
    public void requerirReparacion(boolean reparacion) {
        this.reparacion = reparacion;
        mostrarReparacion();
    }
    
    //Muestra si el confesionario esta en uso
    public void mostrarUso() {
        System.out.println((enUso == true) ? "El confesionario esta en uso." : "El confesionario no esta en uso.");
    }
    
    //Modifica el estado de uso del confesionario
    public void modificarUso(boolean enUso) {
        this.enUso = enUso;
        mostrarUso();
    }
    
    //Muestra la localizacion del confesionario
    public void mostrarLocalizacion() {
        System.out.println("Localizacion: "+localizacion);
    }
    
    //Cambia la localizacion del confesionario
    public void modificarLocalizacion(String localizacion) {
        this.localizacion = localizacion;
        mostrarLocalizacion();
    }
}
