package Casa;

public class Retrete {
    String estado;
    String contenido;
    public Retrete() {//Constructor Default
        this.estado = "limpio";
        this.contenido = "vacio";
    }
    public Retrete(String estado, String contenido) {//Constructor Custom
        this.estado = estado;
        this.contenido = contenido;
    }
    public void Usar(String persona) {//hecho para que lo use una persona, cambia su estado a usado y sucio
        //Puede cambiarse lo que recibe a un objeto persona, de momento es una simple proteccion
        if (persona != null) {
            estado = "sucio";
            contenido = "usado";
        }else System.out.println("No hay quien lo use");
    }
    public void Bajarle() {//Le baja al baño y lo que sea que tenga, limpia su contenido
        System.out.println("Bajando el retrete...");
        contenido = "vacio";

    }
    public void Limpiarse() {//limpia el baño, cambia su estado a limpio
        System.out.println("Limpíando retrete...");
        estado = "limpio";
    }

    public void Limpiarme() {//un gag referenciando los baños inteligentes que te hechan un chorrito de agua en el trasero
        System.out.println("desplegando agua limpiadora, por favor no se mueva");

    }
    public void autodestruccion() {//MUEEEREEEEEEE
        System.out.println("$rm -rf /");
    }
}
