/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hotel;

/**
 *
 * @author Kevin Guerrero
 */
// Objeto con el cual dar luz a cierto lugar
public class Lampara {

    String material;
    boolean encendida;  // true da luz(Esta encendida), false no da luz(Esta apagada)
    String tipoBombilla;
    String colorLuz;

    public Lampara(String material, boolean encendida, String tipoBombilla, String colorLuz) {
        this.material = material;
        this.encendida = encendida;
        this.tipoBombilla = tipoBombilla;
        this.colorLuz = colorLuz;
    }

    // Lampara por Default
    public Lampara() {
        this.material = "Metal";
        this.encendida = true;
        this.tipoBombilla = "LED";
        this.colorLuz = "Blanco";
    }

    public void encender(){
        this.encendida = true;
        System.out.println("Tu lampara esta dando luz");
    }
    
    public void apagar(){
        this.encendida = false;
        System.out.println("Tu lampara esta apagada, ya no da luz");
    }
}
