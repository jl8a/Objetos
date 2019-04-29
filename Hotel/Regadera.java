package Hotel;

//Regadera para los baños del hotel.
public class Regadera {
    String jabon;
    double presion;
    double llaveFria;
    double llaveCaliente;

    /*Crear una regadera especifícando todos sus atributos, inclyendo la cantidad de agua caliente y fría 
    que se recive.*/
    public Regadera(String jabon, double presion, double llaveFria, double llaveCaliente) {
        this.jabon = jabon;
        this.presion = presion;
        this.llaveFria = llaveFria;
        this.llaveCaliente = llaveCaliente;
    }

    //Crea una regadera con el agua caliente y fría totalmente cerradas.
    public Regadera(String jabon, double presion) {
        this.jabon = jabon;
        this.presion = presion;
        this.llaveFria = 0;
        this.llaveCaliente = 0;
    }
    
    
}
