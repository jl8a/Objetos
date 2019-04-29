package Hotel;

//Habitacion que mantiene control de los clientes que puede atender y su estado
//de limpieza.
public class Habitacion {
    int numHabitacion;
    int espacioEnClientes; //La cantidad de espacio medida en clientes que pueden ocuapr la habitacion
    String cliente;
    boolean limpio;
    
    //Crea una habitacion especificando el espacio que tiene para clientes, el
    //dueño de la habitación y el estado de limpieza
    public Habitacion(int numHabitacion, int espacioEnClientes, String cliente, boolean limpio) {
        this.numHabitacion = numHabitacion;
        this.espacioEnClientes = espacioEnClientes;
        this.cliente = cliente;
        this.limpio = limpio;
    }
    
    //Crea una habitacion especificando el espacio que tiene para clientes
    public Habitacion(int numHabitacion, int espacioEnClientes) {
        this.numHabitacion = numHabitacion;
        this.espacioEnClientes = espacioEnClientes;
        this.cliente = "Indefinido";
    }
    
    //Crea una habitación sin especificar datos
    public Habitacion(int numHabitacion) {
        this.numHabitacion = numHabitacion;
        this.espacioEnClientes = 1;
        this.cliente = "Indefinido";
    }
    
    //Muestra la cantidad de espacio que hay para clientes en la habtiacion
    public void mostrarEspacioEnClientes() {
        System.out.println("Habitación "+numHabitacion+", espacio para clientes: "+espacioEnClientes);
    }
    
    //Establece la cantidad de espacio que hay para clientes en la habitacion
    public void establecerEspacioEnClientes(int espacioEnClientes) {
        this.espacioEnClientes = espacioEnClientes;
        mostrarEspacioEnClientes();
    }
    
    //Muestra si la habitacion esta limpia o no
    public void mostrarLimpieza() {
        System.out.println("Habitación "+numHabitacion+", limpia: "+limpio);
    }
    
    //Establece si la habitacion esta limpia o no
    public void establecerLimpieza(boolean limpio) {
        this.limpio = limpio;
        mostrarLimpieza();
    }
}
