package Escuela;
public class Salon {
    String estado;
    int mesabancos;
    boolean limpieza;
    public Salon(String estado, int mesabancos, boolean limpieza) {
        this.estado = estado;
        this.mesabancos = mesabancos;
        this.limpieza = limpieza;
    }
    public Salon(){
        this.estado = "Disponible";
        this.limpieza = true;
        this.mesabancos = 30;
    }
    public void solicitarSalon(){
        if (limpieza & estado.equalsIgnoreCase("Disponible")) {
            System.out.println("Preparando salón...");
            System.out.println("¡Salón preparado!");
        }
        else{
            System.out.println("Lo sentimos, no disponible.");
        }
        
    }
}
