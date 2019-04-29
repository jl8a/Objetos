
package Hotel;

public class SalaDeEspera {
    boolean status;
    int numSalas;
    String tipo;

    public SalaDeEspera(boolean status, int numSalas, String tipo) {
        this.status = status;
        this.numSalas = numSalas;
        this.tipo = tipo;
    }
    
    public static void disponible () {

    }
    public static void ocupada () {
    }    
    public static void main(String[] args) {
        SalaDeEspera sec=new SalaDeEspera(true, 0, "fgfgfg");
    }
}
