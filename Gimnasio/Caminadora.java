package Gimnasio;

public class Caminadora {
    Boolean Estado;
    int velMaxima;
    int velActual;
    public Caminadora(){
        //constructor default
        this.Estado=false;
        this.velActual=0;
        this.velMaxima=10;        
    }
    public Caminadora(Boolean Estado, int velMaxima,int velActual){
        //constructor custom
        this.Estado=Estado;
        this.velActual=velActual;
        this.velMaxima=velMaxima;
    }
    public void SubirVelocidad(){
        //aumenta el nivel de velocidad de la maquina
        if (velActual==velMaxima) {
            velActual=1;
        }
        else velActual++;
        System.out.println("Velocidad nivel "+velActual);
    }
    public void BajarVelocidad(){
        //baja el nivel de velocidad de la maquina
        if (velActual==1) {
            velActual=velMaxima;
        }
        else velActual--;
        System.out.println("Velocidad nivel "+velActual);
    }
    public void Detener(){
        //detiene completamente la velocidad
        velActual=0;
        System.out.println("Se ha comenzado a detener la caminadora, cuidado durante el proceso de desaceleracion");
    }
    public void RevisarVelocidad(){
        //muestra el nivel de velocidad actual
        System.out.println("Actualmente esta en el Nivel "+velActual);
    }
}
