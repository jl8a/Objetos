package Casa;

//Asador de carne asada doméstico, donde el tipo de combustible puede ser eléctrico o por carbón.
public class Asador {
    String tipoCombustible;
    boolean limpio;
    double areaParrilla;

    //Crea un objeto asador permitiendo específicar su tipo de combustible, limpieza y el area de su parrilla.
    public Asador(String tipoCombustible, boolean limpio, double areaParrilla) {
        this.tipoCombustible = tipoCombustible;
        this.limpio = limpio;
        this.areaParrilla = areaParrilla;
    }
    //Crea un objeto asador de Carbón permitiendo especificar su limpieza y area de la parrilla.
    public Asador(boolean limpio, double areaParrilla) {
        this.tipoCombustible = "Carbón";
        this.limpio = limpio;
        this.areaParrilla = areaParrilla;
    }
    
}
