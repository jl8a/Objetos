package Restaurante;

//Mesa que mantiene control del numero de comensales y muestra su estado de
//limpieza.
public class Mesa {
    int numMesa;
    int comensales = 0;
    int platos = 0;
    boolean limpio;
    
    //Crea una mesa especificando numero de mesa y su estado de limpieza
    public Mesa(int numMesa, boolean limpio) {
        this.numMesa = numMesa;
        this.limpio = limpio;
    }
    
    //Crea una mesa especificando numero de mesa y asigna su estado de
    //limpieza en verdadero por default
    public Mesa(int numMesa) {
        this.numMesa = numMesa;
        this.limpio = false;
    }
    
    //Imprime cuantos comensales hay en la mesa
    public void mostrarComensales() {
        System.out.println("Mesa "+numMesa+", comensales: "+this.comensales);
    }
    
    //Agrega comensales al numero de comensales de la mesa
    public void agregarComensales(int comensales) {
        this.comensales += comensales;
        mostrarComensales();
    }
    
    //Remueve comensales al numero de comensales de la mesa
    public void removerComensales(int comensales) {
        this.comensales -= comensales;
        if (this.comensales < 0) {
            this.comensales = 0;
            System.out.println("Se removieron demasiados comensales, la mesa se estableció en 0.");
        }
        mostrarComensales();
    }
    
    //Devuelve el numero de comensales de la mesa
    public int obtenerComensales() {
        return comensales;
    }
    
    //Establece un numero especifico de comensales en la mesa
    public void establecerComensales(int comensales) {
        this.comensales = comensales;
        mostrarComensales();
    }
    
    //Imprime si la mesa esta limpia o no
    public void mostrarLimpio() {
        System.out.println("Mesa "+numMesa+", limpio: "+limpio);
    }
    
    //Establece si la mesa esta limpia o no
    public void establecerLimpio(boolean limpio) {
        this.limpio = limpio;
        mostrarLimpio();
    }
    
    //Devuelve el estado de limpieza de la mesa
    public boolean obtenerLimpio() {
        return limpio;
    }
}
