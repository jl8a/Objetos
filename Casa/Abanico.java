
package Casa;

public class Abanico {
    int numVelocidades;
    String tamaño;
    String color;

    public Abanico(int numVelocidades, String tamaño, String color) {
        this.numVelocidades = numVelocidades;
        this.tamaño = tamaño;
        this.color = color;
    }
    
        public Abanico() {
        this.numVelocidades = 3;
        this.tamaño = "Mediano";
        this.color = "Blanco";
    }
        
        public void encender() {    
            System.out.println("Se encendio el Abanico");
        } 
        public void velocidad(){    
            System.out.println("Velocidad 1");
        }
        public void apagar(){     
            System.out.println("El abanico se apago");
        }
}

