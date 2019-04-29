package Transporte;


import java.util.Scanner;

 public class Bicicleta {
     int llantas;
     boolean asiento;
     String color;
     boolean frenos;
     Scanner sc = new Scanner(System.in);

    public Bicicleta() { //Constructor default
        this.llantas = 2;
        this.asiento = true;
        this.color = "negra";
        this.frenos = true;
    }
    public Bicicleta(int llantas, boolean asiento, String color, boolean frenos) { //Constructor personalizado
        this.llantas = llantas;
        this.asiento = asiento;
        this.color = color;
        this.frenos = frenos;
    }
    
    public void Pedalear() throws InterruptedException{ //Metodo que permite pedalear 
        if ((llantas==2) && (asiento=true)) {
            String resp = null;
            do{
                System.out.println("El usuario pedalea");
                Thread.sleep(2000);
                System.out.println("¿El conductor aun puede seguir pedaleando?");
                resp = sc.nextLine();
            }while(!resp.equalsIgnoreCase("no"));  
            System.out.println("El conductor se canso y ya no puede pedalear");
        }else System.out.println("La bicicleta no cuenta con dos llantas o no tiene asiento, por lo tanto no es posible andar en ella");
    } 
    
    public void Frenar(){ //Metodo que permite frenar
        if (frenos==true) {
            System.out.println("Pulsaste los frenos y has parado");  
        }else System.out.println("La bicicleta no cuenta con frenos y no puedes parar");
    }
    
    public void Estado() throws InterruptedException{ //Metodo donde el usuario puede ver el estado de su bicicleta
        System.out.println("El estado de la bicicleta es el siguiente: ");
        Thread.sleep(2000);
        System.out.println("Cuenta con "+llantas+" llantas");
        Thread.sleep(2000);
        if (asiento==true) {
            System.out.println("Cuenta con asiento");
        }else System.out.println("No cuenta con asiento");
        Thread.sleep(2000);
        System.out.println("Es de color "+color);
        Thread.sleep(2000);
        if (frenos==true) {
            System.out.println("Cuenta con frenos");
        }else System.out.println("No cuenta con frenos");
        
    }
     
}
