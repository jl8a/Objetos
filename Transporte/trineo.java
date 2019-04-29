package Transporte;

public class trineo {
    
    String color;
    String material;
    boolean trineo; //VARIABLE QUE REPRESENTA EL ESTADO DEL TRINEO

    public trineo(String color, String material, boolean trineo) {
        this.color = color;
        this.material = material;
        this.trineo = trineo;
    }
    
    public trineo() {
        this.color = "marrón";
        this.material = "madera";
        this.trineo = true;
    }
    
    public void deslizarTrineo(){
        if (trineo) {
            System.out.println("COMIENZA A DESLIZARSE");
        }
    }
    
    public void frenarTrineo(){
        if (!trineo) {
            System.out.println("COMIENZA A FRENAR");
        }
    }
}