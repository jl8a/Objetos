package Escuela;

public class Baño {

    boolean lavamanos;
    boolean urinario;//si es baño de hombre
    int cantUrinario;
    boolean retrete;
    int cantRetrete;
    boolean papel;
    boolean jabon;
    boolean secadorDeManos;
    boolean espejo;
    boolean extractorDeAire;

    public Baño(boolean lavamanos, boolean urinario, int cantUrinario, boolean retrete, int cantRetrete, boolean papel, boolean jabon, boolean secadorDeManos, boolean espejo, boolean extractorDeAire) {
        this.lavamanos = lavamanos;
        this.urinario = urinario;
        this.cantUrinario = cantUrinario;
        this.retrete = retrete;
        this.cantRetrete = cantRetrete;
        this.papel = papel;
        this.jabon = jabon;
        this.secadorDeManos = secadorDeManos;
        this.espejo = espejo;
        this.extractorDeAire = extractorDeAire;
    }

    public Baño() {//Hombres
        this.lavamanos = true;
        this.urinario = true;
        this.cantUrinario = 4;
        this.retrete = true;
        this.cantRetrete = 4;
        this.papel = false;
        this.jabon = true;
        this.secadorDeManos = true;
        this.espejo = true;
        this.extractorDeAire = false;
    }

    public void bajarBaño(boolean urinario, boolean retrete) throws InterruptedException {//funciona con retrete y urinario
        if ((retrete == true) || (urinario == true)) {
            System.out.println("Pulsar el botón");
            System.out.println("*Sonido de retrete*");
            Thread.sleep(5000);
            System.out.println("Listo...");
        }

    }

    public void lavarseLasManos(boolean lavamanos, boolean papel, boolean jabon, boolean secadorDeManos) throws InterruptedException {
        if (lavamanos == true) {
            System.out.println("Abrir la llave del agua");
            System.out.println("*Sonido de agua fluyendo*");
            if (jabon == true) {
                System.out.println("Se enjabona las manos");
            } else {
                System.out.println("No hay jabón");
            }
            if (secadorDeManos == true) {
                System.out.println("Va y pones las manos bajo el ventilador...");
                System.out.println("*Sonido de secadora*");
                Thread.sleep(3000);
                System.out.println("Listo...");
            } else {
                if (papel==true) {
                    System.out.println("No hay secadora de manos...");
                    System.out.println("Pero hay papel");
                    System.out.println("Agarra un trozo de papel y seca las manos...");
                    Thread.sleep(5000);
                    System.out.println("listo");
                }else{
                    System.out.println("No hay secadora ni papel...");
                    System.out.println("listo...");
                }
            }
        }
    }
    
    public void peinarse(boolean lavamanos, boolean espejo) throws InterruptedException{
        if (espejo==true) {
            System.out.println("Se mira en el espejo");
            System.out.println("Procede a peinarse...");
            if (lavamanos==true) {
                System.out.println("Usa agua para peinarse");
                System.out.println("Moja la mano y procede a peinarse");
                Thread.sleep(5000);
            }
            Thread.sleep(5000);
            System.out.println("Listo");
        }else{
            System.out.println("No se peina...");
        }
    }
}
