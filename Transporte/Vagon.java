package Transporte;

public class Vagon {
    String contenido;
    int peso;
    String nombre;
    public Vagon(){
        //Crea un vagon vacio
        this.contenido="Nada";
        this.peso=10000;
        this.nombre="Vagon Libre";
    }
    public Vagon(String contenido,int peso, String nombre){
        //Crea un vagon especifico
        this.contenido=contenido;
        this.peso=peso;
        this.nombre=nombre;
    }
    public void AsignarUtilidad(String material, int cantidad){
        //le cambia a el contenido a un vagon este vacio o ocupado. REPURPOSE
        contenido=material;
        peso=10000+cantidad;
    }
    public void RevisarVagon(){
        //Revisa el vagon
        System.out.println("Vagon: "+nombre+"\nQue contiene "+contenido+"\nPesa: "+peso+"kg");
    }
}
