package Casa;

import java.util.Scanner;

public class Estufa {

    boolean onOff;//Encender y apagar
    int numPilotos;
    double temperatura;
    int cantWatts;//La cantidad de watts que utiliza la estufa para su funcionamiento
    boolean horno;

    public void Encender(boolean onOff) {
        if (onOff == true) {
            System.out.println("La estufa se encendio...");
        } else {
            System.out.println("No paso nada...");
        }
    }

    public void apagar(boolean onOff, String resp) {
        Scanner scan = new Scanner(System.in);
        System.out.println("¿Apagar la estufa? \"si\" o \"no\" ");
        resp = scan.nextLine();
        if (resp.equalsIgnoreCase("si")) {
            onOff = false;
            System.out.println("Se apago la estufa...");
        } else {
            System.out.println("No pasa nada...");
        }
    }

    public void calentar(boolean onOff, int numPilotos, double temperatura) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        if (onOff == true) {
            System.out.println("¿Qué quieres calentar?");
            String cosa = scan.nextLine();
            System.out.println("¿Ha que temperatura?");
            temperatura=scan.nextInt();
            System.out.println("Cocinando/calentando/friendo/guizando...");
            Thread.sleep(5000);
            System.out.println("Listo, disfrute...");
        }
    }

    public void horno(boolean onOff, boolean horno, double temperatura) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        if (horno == true) {
            System.out.println("¿Encender el horno? \"si\" o \"no\" ");
            String resp = scan.nextLine();
            if (resp.equalsIgnoreCase("si")) {
                System.out.println("¿Qué desea hornear/calentar en el horno?");
                String cosa=scan.nextLine();
                System.out.println("¿Ha que temperatura?");
                temperatura=scan.nextInt();
                Thread.sleep(9000);
                System.out.println("Se calento...");
            }else{
                System.out.println("No paso nada");
            }
        }
    }

    public Estufa(boolean onOff, int numPilotos, int cantWatts, boolean horno) {
        this.onOff = onOff;
        this.numPilotos = numPilotos;
        this.cantWatts = cantWatts;
        this.horno = horno;
    }

}
