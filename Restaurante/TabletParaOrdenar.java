package Restaurante;

import java.util.ArrayList;
import java.util.Scanner;

public class TabletParaOrdenar {

    ArrayList<Integer> ordenes;
    ArrayList<String> comensal;
    String[] menu;
    int[] preciosMenu;

    Scanner sc = new Scanner(System.in);

    public TabletParaOrdenar() {
        System.out.println("Cuantos platillos tiene?");
        int tamañoMenu = sc.nextInt();
        this.ordenes = new ArrayList();
        this.comensal = new ArrayList();
        this.menu = new String[tamañoMenu];
        this.preciosMenu = new int[tamañoMenu];
    }

    public void CrearMenu() {
        for (int i = 0; i < menu.length; i++) {
            System.out.println("Cual sera el platillo no." + (i + 1));
            sc.nextLine();
            menu[i] = sc.nextLine();
            System.out.println("Cual es el Precio?");
            preciosMenu[i]=sc.nextInt();
        }
        System.out.println("Menu Creado");
    }

    public void Ordenar() {
        System.out.println("El menu es:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println("No." + (i + 1) + menu[i]);
        }
        System.out.println("Que desea ordenar? (introduzca el numero)");
        ordenes.add(sc.nextInt()-1);
        System.out.println("Porfavor introduzca su Mesa y Nombre, su pedido le sera entregado brevemente.");
        sc.nextLine();
        comensal.add(sc.nextLine());
        System.out.println("");
    }
    public void Ordenar(int orden,String cliente){
        ordenes.add(orden);
        comensal.add(cliente);
    }
    public void RevisarOrdenes(){
        for (int i = 0; i < ordenes.size(); i++) {
            System.out.println("Orden no."+(i+1)+" "+menu[ordenes.get(i)]+", para "+comensal.get(i));
        }
        System.out.println("");
    }
    public void TerminarPlatillo(){
        RevisarOrdenes();
        System.out.println("Que orden se entregara?");
        int orden = sc.nextInt()-1;
        System.out.println("COMENSAL "+comensal.get(orden)+" SU PEDIDO ESTA LISTO!!!!");
        Cobrar(orden);
        ordenes.remove(orden);
        comensal.remove(orden);
        System.out.println("");
    }
    public void Cobrar(int orden){
        System.out.println("su total es de "+ preciosMenu[ordenes.get(orden)]);
    }

}
