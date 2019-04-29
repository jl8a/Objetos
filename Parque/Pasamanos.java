
package Parque;

//Clase pasamanos que contiene la ubicación del pasamanos y si se encuentra disponible
public class Pasamanos {
    String ubicacion;
    boolean disponible;

    //Crea un pasamanos que determina los atributos ubicación y si se encuentra disponible
    public Pasamanos(String ubicación, boolean disponible) {
        this.ubicacion = ubicación;
        this.disponible = disponible;
    }
    
    //Define los atributos por default
    public Pasamanos(){
        this.ubicacion = "Esquina derecha del parque";
        this.disponible = true;
    }
    
    //Metodo para cruzar el pasamanos si está disponible
    public void CruzarPasamanos (String ubicacion, boolean disponible){
        System.out.println("Este es el pasamanos mas chilodel parque, el pasamanos: " + ubicacion);
        if (disponible == true){
            System.out.println("Ha cruzado el pasamanos con exito");
        } else {
            System.out.println("No puede cruzar el pasamanos por que está ocupado");
        }
    }
    
}
