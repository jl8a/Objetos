/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hotel;

/**
 *
 * @author YesicaIrasema
 */
public class Telefono {

    int opcion = 0; //opción 1 = resepción, opción 2 = servicio al cuarto, opción 3 = llamar por telefono
    String numeroTelefono;

    public Telefono(int opcion, String numeroTelefono) {
        this.opcion = opcion;
        this.numeroTelefono = numeroTelefono;
    }
    
    public Telefono() {
        this.opcion = 1;
        this.numeroTelefono = "";
    }
    
    public void llamaResepcion (int opcion){
        if (opcion == 1) {
            System.out.println("Usted se ha comunicado con resepción :D ");
        }else{
            System.out.println("Opción incorrecta");
        }
    }
    
    public void llamarSrvicioAlCuarto(int opcion){
        if (opcion == 2) {
            System.out.println("Usted se ha comunicado con servicio al cuarto :P ");
        }else{
            System.out.println("Opción incorrecta");
        }
    }
    
    public void llamarPorTelefono (int opcion, String numeroTelefono){
        if (opcion == 3) {
            if (numeroTelefono.length()<= 10) { //Porq un numero de telefono solo tiene un maximo de 10 dijitos 
                System.out.println("Llamando al numero: "+numeroTelefono+" . . . ");
            }else{
                System.out.println("El numero que usted marco no existe ... ");
            }
        }else{
            System.out.println("Opción incorrecta");
        }
    }
    

}
