package Escuela;

public class Extintor {
    boolean status; //disponibilidad del extintor
    int cantExtintor; //cantidad de extintores en la escuela

    public Extintor(boolean status, int cantExtintor) {
        this.status = status;
        this.cantExtintor = cantExtintor;
    }
    
    public static void disponible(){
    }
    public static void apagarFuego(){
    }
    public static void main(String[] args) {
        Extintor apagar= new Extintor(true, 0);
    }  
}
