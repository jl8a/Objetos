package Hotel;
import java.util.ArrayList;
import java.util.Scanner;

public class Mucama {
    Scanner sc = new Scanner(System.in);
    ArrayList<String> actividades;
    ArrayList<String> lugarActividades;
    String nombre;
    String estado;
    String ubicacion;

    public Mucama(String nombre) {//constructor que pide nombre para customizar
        this.actividades = new ArrayList();
        this.lugarActividades = new ArrayList();
        this.nombre = nombre;
        this.estado = "Libre";
        this.ubicacion = "sala de empleados";
    }

    public void SolicitarTarea(String tarea, String lugar) {//Se le asigna una tarea a la mucama dentro de una lista a tareas para hacer
        actividades.add(tarea);
        lugarActividades.add(lugar);
    }

    public void TerminarTarea() {//La mucama avisa que termina una tarea
        for (int i = 0; i < actividades.size(); i++) {
            System.out.println("Tarea no. " + (i + 1) + actividades.get(i));
        }
        System.out.println("Que tarea ha Terminado?");
        int numero = sc.nextInt() - 1;
        actividades.remove(numero);
        lugarActividades.remove(numero);
        estado = "libre";
        ubicacion = "sala de empleados";
    }

    public void HacerTarea() {//la mucama Va y cumple la tarea que se le es ordenada
        for (int i = 0; i < actividades.size(); i++) {
            System.out.println("Tarea no. " + (i + 1)+" " + actividades.get(i));
        }
        System.out.println("Que tarea vas a requerir?");
        int numero = sc.nextInt() - 1;
        estado = "ocupada";
        ubicacion = lugarActividades.get(numero);
        System.out.println("La mucama "+nombre+" ira al lugar a cumplir la tarea.");
    }
    public void RevisarMucama(){//revisa el estado actual de la mucama
        System.out.println("La mucama "+nombre+" esta "+estado+".");
        System.out.println("Actualmente esta en "+ubicacion+".");
    }
    
}
