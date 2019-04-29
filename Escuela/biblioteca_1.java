package Escuela;

public class biblioteca_1 {
    
    String ubicacion;
    boolean IDE;

    public biblioteca_1(String ubicacion, boolean IDE) {
        this.ubicacion = ubicacion;
        this.IDE = IDE;
    }
    
    public biblioteca_1() {
        this.ubicacion = "centro de la escuela";
        this.IDE = true;
    }
    
    public void PrestamoDeLibros(){
            if (IDE) {
                System.out.println("SE PERMITE EL PRESTAMO");
        }else{
                System.out.println("NECESITA IDENTIFICACIÓN DE ESTUDIANTE");
            }
    }
    
    public void BúsquedaDeLibros(){
            System.out.println("BUSCAR LA SECCIÓN DONDE SE PIENSA QUE ESTÁ");
            System.out.println("BUSCAR POR ÁLFABETO Ó PREGUNTAR");
    }
}
