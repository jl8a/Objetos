package Parque;

public class Limpiador {
    String nombre, sexo, domicilio, id;
    int edad;
    double altura;

    public Limpiador(String nombre, String sexo, String domicilio, String id, int edad, double altura) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.domicilio = domicilio;
        this.id = id;
        this.edad = edad;
        this.altura = altura;
    }
    
    public void limpiar() throws InterruptedException{
        System.out.println("Limpiando el área...");
        Thread.sleep(1000);
        System.out.println("listo");
    }
    
    public void regar() throws InterruptedException{
        System.out.println("Regando plantas...");
        Thread.sleep(1000);
        System.out.println("Listo");
    }
}
