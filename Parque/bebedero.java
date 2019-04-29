package Parque;

public class bebedero {
    
    //TIPO DE BEBEDERO, HAY BEBEDEROS QUE SON DE LLAVE (COMO EN ESTE CASO) Y HAY OTROS QUE SON DE BOTÓN ASÍ COMO LOS QUE HAY EN LA UNIVERSIDAD
    String tipo;
    //INSERTÉ UNA VARIABLE BOOLEANA PARA ESPECIFICAR CUANDO ESTÁ ABIERTA Y CUANDO ESTÁ CERRADA
    //llave = true (LA LLAVE ESTÁ ABIERTA)
    //llave = false (LA LLAVE ESTÁ CERRADA)
    boolean llave;

    public bebedero(String tipo, boolean llave) {
        this.tipo = tipo;
        this.llave = llave;
    }
    
    public bebedero() {
        this.tipo = "llave";
        this.llave = true;
    }
    
    public void AbrirLlave(){
            if (llave) {
                System.out.println("SUBE LA PRESIÓN Y SALE AGUA");
        }
    } 
    
    public void CerrarLlave(){
            if (!llave) {
                System.out.println("BAJA LA PRESIÓN Y DEJA DE SALIR AGUA");
        }
    } 
}
