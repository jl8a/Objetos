package Restaurante;

public class DetectorIncendios {
    // Clase de detectores de Incendios
    // Su función es detectar incendios, advertir a los usuarios y llamar a los bomberos
    
    String color, tipoEnergia, tipoSonido; //tipoEnergia se refiere a si usa baterías o conexión eléctrica directa
    int cantDetectores;                    //cantDetectores se refiere a la cantidad de detectores disponibles
    boolean humo;                          //humo es un boolean donde indica si hay humo o no

    public DetectorIncendios(String color, String tipoEnergia, String tipoSonido, int cantDetectores, boolean humo) {
        this.color = color;
        this.tipoEnergia = tipoEnergia;
        this.tipoSonido = tipoSonido;
        this.cantDetectores = cantDetectores;
        this.humo = humo;
    }

    public void detectar() {
        if (humo == true) {
            System.out.println("Abandone el edificio, hay un incendio");
            System.out.println("Llamando a los bomberos...");
            System.out.println("RIP");
        }
    }
}
