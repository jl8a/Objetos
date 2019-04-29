package Casa;

public class Cama {
    String tamaño;
    boolean cobija;
    int cantAlmohadas;
    String estado;

    public Cama(){ //constructor default
        this.tamaño = "Matrimonial";
        this.cobija = false;
        this.cantAlmohadas = 2;
        this.estado = "Limpia";
    }
    
    public Cama(String tamaño, boolean cobija, int cantAlmohadas, String estado) { //constructor personalizado
        this.tamaño = tamaño;
        this.cobija = cobija;
        this.cantAlmohadas = cantAlmohadas;
        this.estado = estado;
    }
    
    public void Acostarse(String persona){ //metodo para que la persona se acueste
        if (persona != null) {
            System.out.println("Estas acostado en la cama");
        }else System.out.println("No hay persona que se pueda acostar en la cama");
    }
    
    public void Limpiar() throws InterruptedException{//metodo para limpiar la cama 
        if (estado.equalsIgnoreCase("sucia")) {
            if (cantAlmohadas==0) {
                System.out.println("No hay almohadas que limpiar");
                Thread.sleep(1500);
            }else System.out.println("Se han sacudido las almohadas"); Thread.sleep(1500);
            if (cobija ==false) {
                System.out.println("No hay cobija que doblar");
                Thread.sleep(1500);
            }else System.out.println("Se ha doblado la cobija");Thread.sleep(1500);
            
            System.out.println("Se ha tendido la cama");
            Thread.sleep(1500);
            System.out.println("La cama se ha limpiado");
            Thread.sleep(1500);
        }else System.out.println("La cama ya esta limpia");
    }
    
}
