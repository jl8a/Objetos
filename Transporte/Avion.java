
package Transporte;

public class Avion {
    double velocidadActual;                                                     //Velocidad actual del avion en KM/h
    double alturaActual;                                                        //Altura actual del avion en Metros
    int numPersonas;                                                            //Numero de personas que el avion transporta
    String destino;                                                             //Lugar donde se dirige el avion
    String horaEstimadaLlegada;                                                 // Ejemplo: 7:30 P.M.

    //Con todos los datos
    public Avion(double velocidadActual, double alturaActual, int numPersonas, String destino, String horaEstimadaLlegada) {
        this.velocidadActual = velocidadActual;
        this.alturaActual = alturaActual;
        this.numPersonas = numPersonas;
        this.destino = destino;
        this.horaEstimadaLlegada = horaEstimadaLlegada;
    }
     //Sin datos
     public Avion() {
        this.velocidadActual = 0;
        this.alturaActual = 0;
        this.numPersonas = 0;
        this.destino = "";
        this.horaEstimadaLlegada = "";
    }
    
public void VerEstado(){
    System.out.println("DESTINO: "+destino);
    System.out.println("ALTURA ACTUAL: "+alturaActual+" METROS");
    System.out.println("VELOCIDAD ACTUAL: "+velocidadActual+" KM/H");
    System.out.println("HORA ESTIMADA DE LLEGADA: "+horaEstimadaLlegada);
    System.out.println("NUMERO DE PERSONAS EN EL AVION: "+numPersonas);
    System.out.println("");
}    

public void CambiarVelocidad(double nuevaVelocidad){
    velocidadActual=nuevaVelocidad;
}

public void CambiarAltura(double nuevaAltura){
    alturaActual=nuevaAltura;
}

public void CambiarDestino(String nuevoDestino){
    destino=nuevoDestino;
}

public void CambiarHoraEstimadaDeLlegada(String nuevaHora){
    horaEstimadaLlegada=nuevaHora;
}

public void CambiarNumeroDePersonas (int NuevoNumero){
    numPersonas=NuevoNumero;
}

}
