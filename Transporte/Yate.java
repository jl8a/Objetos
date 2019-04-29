package Transporte;

//Transporte maritimo para recreacion.
public class Yate {
    boolean contieneVela;
    boolean contieneMotor;
    double combustible;
    double velocidad;
    boolean reparacion;
    
    //Crea un yate sin especificar datos
    public Yate() {
        this.contieneVela = false;
        this.contieneMotor = false;
        this.combustible = 0;
        this.velocidad = 0;
        this.reparacion = false;
    }
    
    //Crea un yate especificando si cuenta con vela y/o motor, junto con la
    //cantidad de combustible disponible.
    public Yate(boolean contieneVela, boolean contieneMotor, double combustible) {
        this.contieneVela = contieneVela;
        this.contieneMotor = contieneMotor;
        this.combustible = combustible;
        this.velocidad = 0;
        this.reparacion = false;
    }
    
    //Crea un yate especificando todos los datos
    public Yate(boolean contieneVela, boolean contieneMotor, double combustible, double velocidadActual, boolean reparacion) {
        this.contieneVela = contieneVela;
        this.contieneMotor = contieneMotor;
        this.combustible = combustible;
        this.velocidad = velocidadActual;
        this.reparacion = reparacion;
    }
    
    //Muestra si el yate cuenta con vela y/o motor
    public void mostrarVelaMotor() {
        System.out.println((contieneVela == true) ? "El yate contiene vela." : "El yate no contiene vela.");
        System.out.println((contieneMotor == true) ? "El yate contiene motor." : "El yate no contiene motor.");
    }
    
    //Modifica si el yate contiene vela y/o motor
    public void modificarVelaMotor(boolean contieneVela, boolean contieneMotor) {
        this.contieneVela = contieneVela;
        this.contieneMotor = contieneMotor;
        mostrarVelaMotor();
    }
    
    //Muestra el combustible que tiene el yate
    public void mostrarCombustible() {
        System.out.println("Combustible: "+combustible);
    }
    
    //Modifica la cantidad de combustible que contiene el yate
    public void modificarCombustible(double combustible) {
        this.combustible = combustible;
        mostrarCombustible();
    }
    
    //Muestra la velocidad actual
    public void mostrarVelocidad() {
        System.out.println("Velocidad actual: "+velocidad);
    }
    
    //Pone el yate en movimiento utilizando la vela o el motor
    public void mover(boolean utilizarMotor) {
        if (utilizarMotor) {
            if (contieneMotor) {
                if (combustible >= 5) {
                    combustible -= 5;
                    velocidad += 15;
                    mostrarVelocidad();
                }
                else {
                    System.out.println("No se cuenta con combustible suficiente, no es posible mover el yate.");
                }
            }
            else {
                System.out.println("No se cuenta con motor, no es posible mover el yate.");
            }
        }
        else {
            if (contieneVela) {
                if (velocidad < 20) {
                    velocidad = 20;
                }
                mostrarVelocidad();
            }
            else {
                System.out.println("No se cuenta con vela, no es posible mover el yate.");
            }
        }
    }
    
    //Detiene el yate
    public void detener() {
        velocidad = 0;
        mostrarVelocidad();
    }
    
    //Muestra si se requiere reparacion
    public void mostrarReparacion() {
        System.out.println((reparacion == true) ? "Requiere reparacion." : "No requiere reparacion.");
    }
    
    //Modifica la necesidad de reparaciones
    public void requerirReparacion(boolean reparacion) {
        this.reparacion = reparacion;
        mostrarReparacion();
    }
}
