package Gimnasio;

import java.util.Scanner;

public class BandasElásticas {

    String colorBanda;
    double tamañoBanda;
    int nivelResitencia;

    public BandasElásticas() {
        this.colorBanda = colorBanda;
        this.tamañoBanda = tamañoBanda;
        this.nivelResitencia = nivelResitencia;
    }

    public void LACUERDA() {
        this.colorBanda = "NA";
        this.tamañoBanda = 0;
        this.nivelResitencia = 0;
    }

    public void ejerciciosConLaCuerda() throws InterruptedException {

        Scanner sc = new Scanner(System.in);

        int ejerciciosSerie = 4;
        
        System.out.println("**BIENVENIDO AL GIMNASIO ISI**" + "\n");
        
        System.out.println("Hola, ¿eres hombre o mujer?");
        String genero = sc.next();
        System.out.println("");

        if (genero.equalsIgnoreCase("Hombre")) {
            System.out.println("Hola amigosho, ¿cuántas series te gustaría hacer hoy?");
        } else {
            System.out.println("Hola amigosha, ¿cuántas series te gustaría hacer el día de hoy?");
        }
        
        System.out.println("");
        int numSerie = sc.nextInt();

        System.out.println("Tamaño de la banda. Tenemos de 2 y 3 metros." + "\n");
        tamañoBanda = sc.nextInt();
        
        System.out.println("");
        
        if (tamañoBanda == 2) {
            System.out.println("Muy corto, pero buena elección.");
        } else if (tamañoBanda == 3) {
            System.out.println("Buena elección, de todas maneras vas a sufrir." + "\n");
        }

        System.out.println("");

        System.out.println("¿Qué nivel de resistencia te gustaría tener en tu banda?" + "\n");
        nivelResitencia = sc.nextInt();
        
        System.out.println("");
        
        System.out.println("¿De qué color te gustaría la banda?" + "\n");
        colorBanda = sc.next();

        int totalSerie = ejerciciosSerie * numSerie;
        
        System.out.println("");
        
        System.out.println("¡A trabajar!");
        for (int i = 0; i < totalSerie; i++) {
            int holaMundo = sc.nextInt();
        }
        System.out.println("Excelente, camarada. Ahora otras 500.");
    }
}
