
package Casa;

public class Luces {
    boolean estado=false;
    double intensidad;
    double intensidadMax;
    double intensidadMed;
    double intensidadMin;

    public Luces(double intensidadMax, double intensidadMed, double intensidadMin,boolean estado) {
        this.intensidadMax = intensidadMax;
        this.intensidadMed = intensidadMed;
        this.intensidadMin = intensidadMin;
        this.estado = estado;
    }
    
    
    public void Apagar () {
        if(estado==false){
            System.out.println("LAS LUCES YA ESTÁN APAGADAS");
        }
        System.out.println("APAGANDO LAS LUCES");
        intensidad=0;
        estado=false;
    }
    public void Encender(){
        if(estado==true){
            System.out.println("LAS LUCES YA ESTÁN ENCENDIDAS");
        }
        else{
        System.out.println("LUCES ENCENDIDAS");
        intensidad=intensidadMed;
        estado=true;
        }
    }
    public void SubirIntencidad(){
        if(intensidad==100){
            System.out.println("NO ES POSIBLE SUBIR MÁS LA INTESIDAD");
        }
        if(intensidad==intensidadMed){
            intensidad=intensidadMax;
            System.out.println("LA INTENSIDAD ACTUAL ES: "+intensidad+"LUX");
        }
        if(intensidad==intensidadMin){
            intensidad=intensidadMed;
            System.out.println("LA INTENSIDAD ACTUAL ES: "+intensidad+"LUX");
        }
    }
    public void BajarIntensidad(){
        if(intensidad==intensidadMin){
            System.out.println("NO ES POSIBLE BAJAR LA INTESIDAD");
        }
        if(intensidad==intensidadMax){
            intensidad=intensidadMed;
            System.out.println("LA INTENSIDAD ACTUAL ES: "+intensidad+"LUX");
        }
        if(intensidad==intensidadMed){
            intensidad=intensidadMin;
            System.out.println("LA INTENSIDAD ACTUAL ES: "+intensidad+"LUX");
        }
    }
    public void autodestruccion (){
        System.out.println("$rm -rf /");
    }
}
