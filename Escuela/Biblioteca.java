package Escuela;

//Biblioteca escolar que mantiene registro de los libros que tiene disponibles.
public class Biblioteca {
    String nombreLibros[] = new String[200];
    int cantidadLibros[] = new int[nombreLibros.length];
    boolean abierto;
    String horario;
    
    //Crea una biblioteca sin especificar datos
    public Biblioteca() {
        this.abierto = false;
    }
    
    //Crea una biblioteca especificando si esta abierta o no y su horario
    public Biblioteca(boolean abierto, String horario) {
        this.abierto = abierto;
        this.horario = horario;
    }
    
    //Crea una biblioteca especificando datos y agregando una coleccion de
    //libros con la cantidad disponible de cada uno
    public Biblioteca(boolean abierto, String horario, String[] nombreLibros, int[] cantidadLibros) {
        this.abierto = abierto;
        this.horario = horario;
        for (int i = 0; i < nombreLibros.length; i++) {
            if (this.nombreLibros[i] == null) {
                this.nombreLibros[i] = nombreLibros[i];
                this.cantidadLibros[i] = cantidadLibros[i];
            }
        }
    }
    
    //Muestra si la biblioteca esta abierta o no
    public void mostrarAbierto() {
        System.out.println((abierto == true) ? "Abierto" : "Cerrado");
    }
    
    //Muestra el horario de la biblioteca
    public void mostrarHorario() {
        System.out.println("Horario: "+horario);
    }
    
    //Muestra los libros de la biblioteca y la cantidad de cada uno
    public void mostrarLibros() {
        System.out.println("Lista de libros");
        for (int i = 0; i < nombreLibros.length; i++) {
            if (nombreLibros[i] != null) {
                System.out.println("["+i+"] "+nombreLibros[i]+": "+cantidadLibros[i]);
            }
            else {
                break;
            }
        }
    }
    
    //Revisa el libro que se encuentre en alguna posicion del arreglo con libros
    //Notese que el 0 cuenta como la primera posicion
    public void checarLibro(int posicion) {
        System.out.println("["+posicion+"] "+nombreLibros[posicion]+": "+cantidadLibros[posicion]);
    }
    
    //Agrega un libro al final de la lista
    public void agregarLibro(String nombreLibro, int cantidadLibro) {
        boolean agregado = false;
        for (int i = 0; i < nombreLibros.length; i++) {
            if (nombreLibros[i] == null) {
                nombreLibros[i] = nombreLibro;
                cantidadLibros[i] = cantidadLibro;
                agregado = true;
                break;
            }
        }
        System.out.println((agregado == true) ? "Se agrego el libro." : "No se logro agregar el libro");
    }
    
    //Modifica un libro en una posicion especifica de la lista
    public void modificarLibro(int posicion, String nombreLibro, int cantidadLibro) {
        System.out.print("El libro: ");
        checarLibro(posicion);
        System.out.print("Cambia a: ");
        nombreLibros[posicion] = nombreLibro;
        cantidadLibros[posicion] = cantidadLibro;
        checarLibro(posicion);
    }
    
    //Cambia el horario de la biblioteca
    public void modificarHorario(String horario) {
        this.horario = horario;
        System.out.println("El horario se ha cambiado a: "+this.horario);
    }
}
