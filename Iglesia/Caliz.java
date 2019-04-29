
package Iglesia;

//Clase que determina los atributos que tendrá el caliz
public class Caliz {
    boolean estado; //para saber si está limpio o no
    boolean contenido; //para saber si contiene vino

    
    public Caliz(boolean estado, boolean contenido) {
        this.estado = estado;
        this.contenido = contenido;
    }
    
    public Caliz() {
        this.estado = true;
        this.contenido = false;
    }
    //Metodo para Rellenar con vino el Caliz
    public void Rellenar (boolean estado, boolean contenido) throws InterruptedException{
        if (contenido == false){
            if (estado == true){
                System.out.println("Ha rellenado el Caliz con vino");
                Thread.sleep(1000);
                System.out.println("¡Esta es la sangre de cristo!");
                Thread.sleep(4000);
                System.out.println("*El vino se ha convertido en la sangre de Cristo*");
            } else {
                System.out.println("El caliz está todo cochino, ¡lavenlo!");
            }
        } else {
            System.out.println("El caliz ya contiene vino o la sangre de Cristo");
        }
    }
    
    //Metodo para limpiar el Caliz
    public void LimpiarCaliz(boolean estado, boolean contenido){
        if (contenido == false){
            if(estado == false){
                System.out.println("Se limpiará el caliz");
            } else {
                System.out.println("El caliz ya se encuentra limpio");
            }
        } else {
            System.out.println("El caliz aun contiene vino");
        }
    }
    
}
