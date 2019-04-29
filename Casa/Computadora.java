package Casa;

//Computadora que realiza funciones b�sicas de una computadora.
//Los m�todos regresan mensajes en la consola.
public class Computadora {
    boolean oficinista;
    String gpu;
    String cpu;
    int ram;
    double voltajeFuente;
    boolean tieneVentilador;
    
    //Crear computadora con especificaciones
    public Computadora(boolean oficinista, String gpu, String cpu, int ram, double voltajeFuente, boolean tieneVentilador) {
        this.oficinista = oficinista;
        this.gpu = gpu;
        this.cpu = cpu;
        this.ram = ram;
        this.voltajeFuente = voltajeFuente;
        this.tieneVentilador = tieneVentilador;
    }
    
    //Crear computadora sin especificar datos
    public Computadora() {
        oficinista = true;
        gpu = "B�sico";
        cpu = "B�sico";
        ram = 4;
        voltajeFuente = 300.0;
        tieneVentilador = false;
    }
    
    //Imprime un mensaje
    public void imprimir(String texto) {
        System.out.println(texto);
    }
    
    //Traba la computadora
    public void trabar() {
        while (true) {
            System.out.println("ERROR");
        }
    }
    
    //Genera un crash en la consola
    public void crash () {
        System.out.println(69/0);
    }
    
    //Computa una ecuaci�n
    public void computar() {
        int a = 0;
        int b = 0;
        System.out.println(a+" + "+b+" = "+(a+b));
    }
    
    //Computa con dos enteros espec�ficos
    public void computarAvanzado(int a, int b) {
        System.out.println(a+" + "+b+" = "+(a+b));
    }
    
    //Autodestruye
    public void autodestruccion() {
        System.out.println("$rm -rf /");
    }
}
