
package Hotel;

public class Alberca {
    boolean llena;
    boolean limpia;
    boolean bombas;

    public Alberca(boolean llena, boolean limpia, boolean bombas) {
        this.llena = llena;
        this.limpia = limpia;
        this.bombas = bombas;
    }
    
    public Alberca() {
        this.llena = true;
        this.limpia = true;
        this.bombas = true;
    }
    
    public void entrar() throws InterruptedException {
        if (llena == true) {
            if(limpia == true) {
                this.bombas = true;
                    System.out.println("La picina está disponible puede entrar.");
                    Thread.sleep(3000);
                    System.out.println("Estás dentro de la picina, cuidado no te vayas a ahogar");
                    System.out.println("¡FUA CHAVAL! Tremendo chapuzón te estás dando");
                } else {
                System.out.println("La alberca está sucia, necesita limpieza");
            }
        } else {
            System.out.println("No es temporada de alberca");
        }
    }
    
    public void limpieza (boolean llena, boolean limpia, boolean bombas) throws InterruptedException {
        if (llena == true){
            if (limpia == false){
                this.bombas = true;
                System.out.println("La alberca se limpiará en un momento");
                Thread.sleep(4500);
                System.out.println("La alberca se encuentra limpia");
            } else {
                System.out.println("La alberca ya se encuentra limpia");
            }
        } else {
            System.out.println("La alberca no contiene agua que limpiar");
        }
    }
    
}
