
package Casa;

public class Abanico {
    int numVelocidades;
    String tama�o;
    String color;

    public Abanico(int numVelocidades, String tama�o, String color) {
        this.numVelocidades = numVelocidades;
        this.tama�o = tama�o;
        this.color = color;
    }
    
        public Abanico() {
        this.numVelocidades = 3;
        this.tama�o = "Mediano";
        this.color = "Blanco";
    }
        
        public void encender() {    
        } 
        public void velocidad(){    
        }
        public void apagar(){     
            System.out.println("El abanico se apago");
        }
}

