/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gasolineria;

/**
 *
 * @author Acer Notebook
 */
public class LetreroPrecios {
    String NombreGasolinera;
    String TipoGasolina;
    String Diesel;
    Double precioGasolina;
    Double precioDiesel;
    

    public LetreroPrecios(String NombreGasolinera, String TipoGasolina, String Diesel, Double precioGasolina, Double precioDiesel) {
        this.NombreGasolinera = NombreGasolinera;
        this.TipoGasolina = TipoGasolina;
        this.Diesel = Diesel;
        this.precioGasolina = precioGasolina;
        this.precioDiesel = precioDiesel;
    }

    public LetreroPrecios() {
        this.NombreGasolinera = "Pemex";
        this.TipoGasolina = "Premium";
        this.Diesel = "Diesel";
        this.precioGasolina = 19.71;
        this.precioDiesel = 19.10;
    }
    
    
    
    
    public void MostrarPrecios(){
        System.out.println("Bienvenidos a : " + NombreGasolinera);
        System.out.println("Precios Gasolina : \n");
        
        if(TipoGasolina=="Premium"){
            System.out.println("PRECIO: " + precioGasolina);
            
        }
        
        if(TipoGasolina=="Magna"){
            System.out.println("PRECIO : " + precioGasolina);
    
    

         }
        System.out.println("Diesel: " + precioDiesel);
    }
}