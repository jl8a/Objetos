
package Restaurante;


public class Cuchara {
	String tamaño;    
	String material;
   	

    public Cuchara(String material, String tamaño) {
        this.material = material;
        this.tamaño = tamaño;
    }
    
    public Cuchara() {
        this.material = "Metal";
        this.tamaño = "Promedio";
    }
      
      public void retener (){  
	// retener el liquido o elemento deseado para transportarlo   
      }
      
      public void revolverr(){
      //revolver comida 
      }
}
