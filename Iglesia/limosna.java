package Iglesia;

public class limosna {
    
    String tipo;

    public limosna(String tipo) {
        this.tipo = tipo;
    }
    
    public limosna() {
        this.tipo = "canasta";
    }
    
    public void RecibirDinero(){
        System.out.println("UNA PERSONA PASA CON UNA CANASTA A RECIBIR DINERO DE LAS PERSONAS QUE ASISTEN A LA MISA");
    }
}
