
package Hotel;

public class ValetParking { //se encarga de recoger, estacionar y checar cajones disp, para el auto del huesped
    String nombre;
    String genero; 
    String horario; 
    int cajonesDisp;

    public ValetParking(String nombre, String genero, String horario, int cajonesDisp) {
        this.nombre = nombre;
        this.genero = genero;
        this.horario = horario;
        this.cajonesDisp = cajonesDisp;
    }
    
    
    
    public void recogerCarro (){ //recoge el coche que se llevara a estacionar
        
    }
    
    public void checarCajonesDisp (){ // checa cuantos lugares disp hay para estacionar el auto
        System.out.println("Hay disponibles "+ cajonesDisp+ " cajones disponibles");
    }
    
    public void estacionarCarro(){ //estaciona el coche
        
    }
           
    
}
