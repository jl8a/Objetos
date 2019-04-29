
package Gimnasio;

public class MaquinaEscaladora {
    String identificador;                                                       //Nombre con el que se puede referir a la maquina
    boolean estado;                                                             //false =apagado   true=encendido
    double peso;

    public MaquinaEscaladora(String identificador) {
        this.identificador = identificador;
    }
    
    public void Encender(double peso){
        if (estado==true){
            System.out.println(identificador+" YA SE ENCUENTRA ENCENDIDO");
        }
        else{
            estado=true;
            this.peso=peso;
            System.out.println(identificador+" ENCENDIDO, PESO ACTUAL: "+this.peso);
        }
    }
    
    public void Apagar(){
        if (estado==false){
            System.out.println(identificador+" YA SE ENCUENTRA APAGADO");
        }
        else{
            estado=false;
            System.out.println(identificador+" APAGADO");
        }
    }
    
    public void CambioPeso(double nuevoPeso){
        if(estado==false){
            System.out.println("LA MAQUINA DEBE ESTAR PRENDIDA PARA CAMBIAR EL PESO");
        }
        else{
        System.out.println("EL PESO ACTUAL DE "+identificador+" ES "+peso+" ,NUEVO PESO: "+nuevoPeso);
        this.peso=nuevoPeso;
        }
    }
}
