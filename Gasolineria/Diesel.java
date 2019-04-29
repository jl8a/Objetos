package Gasolineria;

public class Diesel {
    double precio;
    double cantAzufre;// mg/kg
    
    public Diesel(double precio, double cantAzufre) {
        this.precio = precio;
        this.cantAzufre = cantAzufre;
    }
    public Diesel() {
        precio = 22.57;
        cantAzufre = 500;
    }
}
