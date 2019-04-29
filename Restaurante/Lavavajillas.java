
package Restaurante;


public class Lavavajillas { //se encarga de limpiar y secar los platos del restaurante
    boolean status; //disponible para lavar o en proceso
    int capacidadPlatos; // numero de platos
    String tipoCarga; //carga pesada, carga simple
    String tipoLavado; //delicado, extra sucio
    int cantPlatos; //cuantos platos hay adentro

    public Lavavajillas(boolean status, int capacidadPlatos, String tipoCarga, String tipoLavado, int cantPlatos) {
        this.status = status;
        this.capacidadPlatos = capacidadPlatos;
        this.tipoCarga = tipoCarga;
        this.tipoLavado = tipoLavado;
        this.cantPlatos = cantPlatos;
    }

    
    
    
public void lavar(){ //lava los platos 
    
}    
public void secar (){ //seca los platos
    
}    
}
