package Gimnasio;


public class EjercitadordeMano { //clase que inicializa la variable ocupado que indicará si está disponible o no el aparato de ejercitación
    boolean ocupado;

    public EjercitadordeMano() { //constructor que indica el estado predeterminado del aparato
    this.ocupado = false;
    }
    
    public void EjercitarMano (boolean ocupado) throws InterruptedException {// Metodo para ejercitar tus manos
        if (ocupado == false) {
            System.out.println("Empezando a ejercitarce...");
            System.out.println("Se harán 3 series de 20 en cada mano");
            System.out.println("Se empezará la primera serie");
            for (int i = 0; i < 20; i++) {
                System.out.println(i);
                Thread.sleep(100);
            }
            System.out.println("Llevas 1 serie");
            System.out.println("descanso de 10 segundos");
            Thread.sleep(5000);
            System.out.println("Se empezará la segunda serie...");
            for (int i = 0; i < 20; i++) {
                System.out.println(i);
                Thread.sleep(100);
            }
            System.out.println("Haz terminado la segunda serie");
            System.out.println("Descanso de 10 segundos");
            Thread.sleep(5000);
            System.out.println("Empezando la tercer serie...");
            for (int i = 0; i < 20; i++) {
                System.out.println(i);
                Thread.sleep(100);
            }
            System.out.println("Haz terminado la tercer serie, tus manos se han ejercitado.");
        } else {
            System.out.println("Para ejercitarse necesita que el aparato esté desocupado");
        }
    }
    
    
    
}
