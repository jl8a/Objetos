package Hotel;
public class Bar {
    String estado;
    public Bar(String estado) {
        this.estado = estado;
    }
    public Bar(){
        this.estado = "Abierto";
    }
    public void verificar(){
        if (estado.equalsIgnoreCase("Abierto")) {
            System.out.println("El bar está abierto.");
        }else{
            System.out.println("El bar esta cerrado.");
        }
    }
}
