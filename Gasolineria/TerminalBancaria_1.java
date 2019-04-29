package Gasolineria;


import static java.lang.Integer.parseInt;
import java.util.Scanner;

//Termianl bancaria del establecimiento que permite leer tarjetas de crédito o débito para efectuar pagos.
public class TerminalBancaria_1 {
    String banco;
    //Crea una terminal bancaria
    
    public TerminalBancaria_1(String banco) {
        this.banco = banco;
    }
    
    
    //Permite leer el código de la tarjeta introducida para efectuar el pago.
    public int leerTarjeta(){
        System.out.println("Accediendo a los datos de su tarjeta...");
        int numTarjeta = 0;
        int NIP;
        int propietario;
        return numTarjeta;
    }
    //Permite leer el código NIP intruducido para autorizar el pago realizado con la tarjeta-
    public void leerNip(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Inserta tu NIP");
        int resp = parseInt(sc.next());
        
    }
    //Imprime el recibo con los datos del pago realizado:
    public void imprimirRecibo(){
        System.out.println("Gracias por la compra");
    }
}
