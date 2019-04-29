/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Escuela;

/**
 *
 * @author YesicaIrasema
 */
public class Copiadora {
    boolean sacarCopiasBlancoNegro;
    boolean sacarCopiasColor;
    boolean imprimirBlancoNegro;
    boolean imprimirColor;
    int cantidadHojas;

    public Copiadora(boolean sacarCopiasBlancoNegro, boolean sacarCopiasColor, boolean imprimirBlancoNegro, boolean imprimirColor) {
        this.sacarCopiasBlancoNegro = sacarCopiasBlancoNegro;
        this.sacarCopiasColor = sacarCopiasColor;
        this.imprimirBlancoNegro = imprimirBlancoNegro;
        this.imprimirColor = imprimirColor;
    }
    
    public Copiadora() {
        this.sacarCopiasBlancoNegro = true;
        this.sacarCopiasColor = false;
        this.imprimirBlancoNegro = false;
        this.imprimirColor = true;
    }
    
    public void sacarCopias(boolean sacarCopiasBlancoNegro, boolean sacarCopiasColor, int cantidadHojas) throws InterruptedException{
        if (sacarCopiasBlancoNegro == true) {
            System.out.println("sacando: "+cantidadHojas+" copias a blanco y negro. . .");
            for (int i = 1; i <= cantidadHojas; i++) {
                System.out.println("Copia numero: "+i+" . . . ");
                Thread.sleep(500);
            }
            System.out.println("Listo!!!");
        }else{
            System.out.println("----------------------------------------------");
        }
        if (sacarCopiasColor == true) {
            System.out.println("sacando: "+cantidadHojas+" copias a color. . .");
            for (int i = 1; i <= cantidadHojas; i++) {
                System.out.println("Copia numero: "+i+" . . . ");
                Thread.sleep(500);
            }
            System.out.println("Listo!!!");
        }else{
            System.out.println("----------------------------------------------");
        }
    }
    
    public void imprimir(boolean impririrBlancoNegro, boolean imprimirColor,int cantidadHojas) throws InterruptedException{
     if (imprimirBlancoNegro == true) {
            System.out.println("Imprimirndo: "+cantidadHojas+" copias a blanco y negro. . .");
            for (int i = 1; i <= cantidadHojas; i++) {
                System.out.println("Imprecion numero: "+i+" . . . ");
                Thread.sleep(500);
            }
            System.out.println("Listo!!!");
        }else{
            System.out.println("----------------------------------------------");
        }
        if (imprimirColor == true) {
            System.out.println("Imprimirndo: "+cantidadHojas+" copias a color. . .");
            for (int i = 1; i <= cantidadHojas; i++) {
                System.out.println("Imprecion numero: "+i+" . . . ");
                Thread.sleep(500);
            }
            System.out.println("Listo!!!");
        }else{
            System.out.println("----------------------------------------------");
        }   
    }
    
}
