package Gasolineria;

//Auto que funcionara como registro para los clientes que se atienden.
public class Auto {
    String modelo;
    String color;
    String nombreCliente;
    double gasCargado;
    double pagoRecibido;
    
    //Crea un auto con todos los datos
    public Auto(String modelo, String color, String nombreCliente, double gasCargado, double pagoRecibido) {
        this.modelo = modelo;
        this.color = color;
        this.nombreCliente = nombreCliente;
        this.gasCargado = gasCargado;
        this.pagoRecibido = pagoRecibido;
    }
    
    //Crea un auto solo con datos de la gasolina
    public Auto(double gasCargado, double pagoRecibido) {
        this.modelo = "Indefinido";
        this.color = "Indefinido";
        this.nombreCliente = "Indefinido";
        this.gasCargado = gasCargado;
        this.pagoRecibido = pagoRecibido;
    }
    
    //Crea un auto del que no se registraron datos
    public Auto() {
        this.modelo = "Indefinido";
        this.color = "Indefinido";
        this.nombreCliente = "Indefinido";
        this.gasCargado = 0;
        this.pagoRecibido = 0;
    }
    
    //Muestra los datos del auto atendido
    public void mostrarDatos() {
        System.out.println("Auto modelo: "+modelo+", color: "+color+", del cliente: "+nombreCliente+
                "\nCargo de gas: "+String.valueOf(gasCargado)+", pago: "+String.valueOf(pagoRecibido));
    }
    
    //Cambia el gas cargado
    public void cambiarGasCargado(double gasCargado) {
        this.gasCargado = gasCargado;
        System.out.println("Gas cargado: "+this.gasCargado);
    }
    
    //Cambia el pago recibido
    public void cambiarPagoRecibido(double pagoRecibido) {
        this.pagoRecibido = pagoRecibido;
        System.out.println("Pago recibido: "+this.pagoRecibido);
    }
    
    //Cambia los datos del auto que se atendio
    public void cambiarDatos(String modelo, String color, String nombreCliente) {
        this.modelo = modelo;
        this.color = color;
        this.nombreCliente = nombreCliente;
        System.out.println("Auto modelo: "+modelo+", color: "+color+", del cliente: "+nombreCliente);
    }
}
