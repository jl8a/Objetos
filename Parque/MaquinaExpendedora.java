package Parque;

import java.util.Scanner;

public class MaquinaExpendedora {
    Scanner sc = new Scanner(System.in);
    String[][] productos;
    int[][] cantidad;
    int cantidadMaxima;
    String Pos(int x, int y){
        //Permitira Tener las posiciones de la maquina en el conocido sistema LETRA,NUMERO
        String[] Letters={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        return (String)(""+Letters[x]+y);
    }
    
    public MaquinaExpendedora(){
        //el inicializador de la maquina
        System.out.println("Bienvenido al sistema de Inicalizacion de MiMaquinaExpendedora");
        System.out.println("Cuanta capacidad necesitas por producto?");
        this.cantidadMaxima = sc.nextInt();
        System.out.println("Que tamaño tendra tu maquina? x*y");
        System.out.println("x=?");
        int x= sc.nextInt();
        System.out.println("y=?");
        int y= sc.nextInt();
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.println("Que pondras en el "+Pos(i,j)+"?");
                this.productos[i][j]=sc.nextLine();
                this.cantidad[i][j]=cantidadMaxima;
            }
        }
        System.out.println("La Maquina expendedora ha sido llenada exitosamente!");        
    }
    public MaquinaExpendedora(int cantidadMaxima,String[][] productos){
        //un constructor que recibe una lista BIDIMENSIONAL pre-hecha
        this.cantidadMaxima=cantidadMaxima;
        this.productos=productos;
        for (int i = 0; i < productos.length; i++) {
            for (int j = 0; j < productos[i].length; j++) {
                this.cantidad[i][j]=cantidadMaxima;
            }
        }
    }
    void List(){
        //Enlista todos los productos junto a su posicion, como viendo la maquina
        for (int i = 0; i < productos.length; i++) {
            for (int j = 0; j < productos[i].length; j++) {
                System.out.print(" | "+Pos(i,j)+":"+productos[i][j]+" | ");
            }
            System.out.println("");
        }
    }
    public void Usar(){
        //usa la maquina, para comprar y despues permite rellenarla
        List();
        System.out.println("Que desea comprar?");
        String ans= sc.nextLine();
        if (cantidad[(int)ans.charAt(0)-65][(int)ans.charAt(1)-48]==0) {
            System.out.println("Este producto se ha acabado");
        }else cantidad[(int)ans.charAt(0)-65][(int)ans.charAt(1)-48]--;
        System.out.println("Necesita algo mas? (comandos: \"usar\" y \"rellenar\")");
        ans= sc.nextLine();
        if (ans.equalsIgnoreCase("rellenar")) {
            Rellenar();
        }else if(ans.equals("usar")){
            Usar();
        }
    }
    public void Rellenar(){
        //rellena el stock de la maquina
        System.out.println("En estos momentos se esta llenando la maquina");
        for (int i = 0; i < productos.length; i++) {
            for (int j = 0; j < productos[i].length; j++) {
                this.cantidad[i][j]=cantidadMaxima;
            }
        }
        System.out.println("La maquina a ha sido Reestockeada");
    }
}