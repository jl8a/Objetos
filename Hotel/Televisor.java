
package Hotel;

public class Televisor {
    int numCanales;
    boolean estado;                        //false=apagada  true=encendida
    int contCanal=1;                       // Dice en que canal se encuentra actualmente la televisión (empieza en el canal 1)

    public Televisor(int numCanales) {
        this.numCanales = numCanales;
    }
    
    public void Encender(){
        if(estado==true){
            System.out.println("LA TELEVISIÓN YA SE ENCUENTRA ENCENDIDA");
        }
        else{
            estado=true;
            System.out.println("TELEVISIÓN ENCENDIDA");
        }
    }
    
    public void Apagar(){
        if(estado==false){
            System.out.println("LA TELEVISIÓN YA SE ENCUENTRA APAGADA");
        }
        else{
            estado=false;
            System.out.println("TELEVISIÓN APAGADA");
        }
    }
    
    public void CanalArriba(){                                                  //sube de canal 
        if(estado==false){
            System.out.println("LA TELEVISION SE ENCUENTRA APAGADA");
        }
        else{
        if(contCanal==numCanales){
            contCanal=1;
        }
        else{
            contCanal++;
        }
        System.out.println("CANAL: "+contCanal);
        }
    }
    
    public void CanalAbajo(){                                                   //Baja de canal
        if(estado==false){
            System.out.println("LA TELEVISION SE ENCUENTRA APAGADA");
        }
        else{
        if(contCanal==1){
            contCanal=numCanales;
        }
        else{
            contCanal--;
        }
        System.out.println("CANAL: "+contCanal);
        }
    }
    
    public void EscogerCanal(int canal){                                         //El usuario escoje el canal 
        if(estado==false){
            System.out.println("LA TELEVISION SE ENCUENTRA APAGADA");
        }
        else{
        System.out.println("CANAL: "+canal);
        contCanal=canal;
        }
    }
    
    public void MostrarCanal(){                                                   //Muestra el canal actual
        System.out.println("CANAL: "+contCanal);
    }
}
