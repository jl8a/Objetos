
package Gasolineria;

public class TerminalBancaria {
    int numBotones;
    double cantidad; //Cantidad que se va a cobrar al cliente de la gasolina
    String bancoTarjeta;
    boolean rollo; //Es para saber si la terminal tiene o no rollo para el voucher 

    public TerminalBancaria(int numBotones, double cantidad, String bancoTarjeta, boolean rollo) {
        this.numBotones = numBotones;
        this.cantidad = cantidad;
        this.bancoTarjeta = bancoTarjeta;
        this.rollo = rollo;
    }
    public TerminalBancaria() {
        this.numBotones = 14;
        this.cantidad = 0;
        this.bancoTarjeta = "X";
        this.rollo = true;
    }
    
    public void encender (){
    }
    public void apagar(){   
    }
    
    public void cobrar (){
        //Cobra la cantidad 
    }
    
    public void imprimir() {
        //Imprime el recibo (voucher)
    }
    
}
