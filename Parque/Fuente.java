package Parque;
public class Fuente {
     
   
    boolean fuenteFuncional;

    public Fuente( boolean fuenteFuncioanl) {
        
        this.fuenteFuncional = fuenteFuncional;
    }
    public Fuente() {
       
        this.fuenteFuncional = false;
    }
    
    public void fuenteFuncionando (){
        
        
        
        if (fuenteFuncional) {
            System.out.println("No hay servicio fuentístico. Lloremos.");
        } else {
            System.out.println("No podés entrar, estamos en proceso de limpiar el agua.");
            fuenteFuncional = false;
            System.out.println("Listo, ya podés entrar :) ");
        }
    }
}
