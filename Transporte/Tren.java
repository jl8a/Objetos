package Transporte;

import java.util.ArrayList;
import java.util.Scanner;

public class Tren{
    ArrayList<Vagon> vagones;
    String conductor;
    Vagon control= new Vagon("Control",19000,"Vagon Principal");
    Scanner sc = new Scanner(System.in);
    public Tren(){
        //Constructor default, crea el tren con el unico vagon de control
        this.vagones=new ArrayList();
        vagones.add(control);
        this.conductor="aun sin asignar";
    }
    public Tren(ArrayList<Vagon> vagones, String conductor){
        //Constructor que recibe una lista de vagones ya hechos
            this.vagones=vagones;
            this.vagones.add(0, control);
            this.conductor=conductor;
    }
    public void AgregarVagon(Vagon x){
        //AGREGA. EL. VAGON.
        vagones.add(x);
    }
    void List(){
        //enlista todos los vagones por nombre
        for (int i = 0; i < vagones.size(); i++) {
            System.out.println("Vagon "+i+": "+vagones.get(i).nombre);
        }
    }
    public void ModificarVagon(){
        //Modifica un vagon especifico
        List();
        System.out.println("que vagon deseas modificar (solo el numero)");
        int ans= sc.nextInt();
        System.out.println("que contendra el vagon?");
        String material= sc.nextLine();
        System.out.println("Cuanto se le agregara?");
        int cantidad= sc.nextInt();
        vagones.get(ans).AsignarUtilidad(material, cantidad);
        System.out.println("Se ha completado el pedido");
    }
    public void RevisarVagon(int n){
        //Revisa un vagon especifico
        vagones.get(n).RevisarVagon();
    }
    public void RevisarTren(){
        //Revisa todos los vagones del tren
        System.out.println("Tren conducido por: "+conductor);
        for (int i = 0; i < vagones.size(); i++) {
            System.out.println("Vagon "+i+"");
            vagones.get(i).RevisarVagon();
            System.out.println("------------------------");
        }
    }
            
    
}
