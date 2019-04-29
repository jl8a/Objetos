
package Escuela;
//Objeto de Escuela
public class AspersoresDeAgua {
    boolean estado;                                                             //false=apagado true=encendido
    String identificador;                                                       //Para referirse a cada aspersor
    String localizacion;                                                        //lugar donde está ubicado el aspersor
    double giro;                                                                //Grados que el aspersor girara para regar y después devolverse

    public AspersoresDeAgua(String identificador, String localizacion, double giro) {
        this.identificador = identificador;
        this.localizacion = localizacion;
        this.giro = giro;
    }
    
    
    
    public void Encender (){
        if (estado==true){
            System.out.println(identificador+" YA SE ENCUENTRA ENCENDIDO");
        }
        else{
            estado=true;
            System.out.println(identificador+" ENCENDIDO");
        }
    }
    
    public void Apagar (){
        if (estado==false){
            System.out.println(identificador+" YA SE ENCUENTRA APAGADO");
        }
        else{
            estado=false;
            System.out.println(identificador+" APAGADO");
        }
    }
    
    public void CambioGiro (double nuevoGiro){
        giro=nuevoGiro;
        System.out.println("LA NUEVA ROTACIÓN DE "+identificador+" ES: "+giro);
    }
    
    public void CambioLocalización (String nuevaLocalizacion){
        localizacion=nuevaLocalizacion;
        System.out.println("LA NUEVA LOCALIZACIÓN DE "+identificador+" ES: "+localizacion);
    }
    
    public void VerEstado (){
       
        System.out.println("IDENTIFICADOR: "+identificador);
         if(estado==true){
             System.out.println("ESTADO: ENCENDIDO");
        }
         else{
             System.out.println("ESTADO: APAGADO");
         }
        System.out.println("LOCALIZACIÓN: "+localizacion);
        System.out.println("ROTACIÓN: "+giro);
    }
    
    
}
