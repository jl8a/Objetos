/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gimnasio;

/**
 *
 * @author Kevin Guerrero
 */
// Objeto en el que se le ponen pesas, para hacer algun ejercicio
public class BarraOlimpica {
    
    String material;    // De que esta hecho la barra
    double peso;        // Peso que tiene la barra olimpica sin ningun peso, en kg
    double capacidad;   // Peso maximo en kg que se le puede poner
    double pesas;       // Cantidad de peso que tiene puesto, en kg

    public BarraOlimpica(String material, double peso, double capacidad, double pesas) {
        this.material = material;
        this.peso = peso;
        this.capacidad = capacidad;
        this.pesas = pesas;
    }

    // Barra Olimpica por Default
    public BarraOlimpica() {
        this.material = "Metal";
        this.peso = 20.41;
        this.capacidad = 362.87;
        this.pesas = 0;
    }
    
    public void ejercicio(){
        double pesoTotal = peso+pesas;
        System.out.println("Alguien me esta levantando para ejercitarse");
        System.out.println("Y esta levantando "+pesoTotal+" kg.");
    }
}
