package Iglesia;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaDeLuces {

    ArrayList<Integer> LucesIntensidad = new ArrayList();
    ArrayList<String> LucesLugar = new ArrayList();
    Scanner sc = new Scanner(System.in);

    public SistemaDeLuces(int numLuces) {
        //el inicializador del sistema, crea el sistema de luces
        System.out.println("Bienvenido a CruxLux, tu sistema Inicializador de luces");
        System.out.println("Comenzaremos creando cada punto de luz");
        for (int i = 0; i < numLuces; i++) {
            System.out.println("Cual es el nombre del puesto " + (i + 1));
            LucesLugar.add(sc.nextLine());
            LucesIntensidad.add(0);
        }
        System.out.println("El Sistema de luces fue creado exitosamente");
    }

    void List() {
        //Sirve para usarse dentro del codigo y que muestre la lista en orden
        for (int i = 0; i < LucesLugar.size(); i++) {
            System.out.print("" + (i + 1) + ".- " + LucesLugar.get(i));
        }
    }

    public void RevisarSistema() {
        //Te muestra cada punto de luz y la intensidad a que esta puesta
        System.out.println("Lugares:");
        for (int i = 0; i < LucesLugar.size(); i++) {
            System.out.print("" + (i + 1) + ".- " + LucesLugar.get(i) + " estan ");
            if (LucesIntensidad.get(i) == 0) {
                System.out.println("apagadas");
            } else {
                System.out.println("encendidas al nivel " + LucesIntensidad.get(i));
            }
        }
    }

    public void ModificarLuz() {
        //Te pregunta cual punto especifico quieres cambiar
        List();
        System.out.println("Que lugar va a modificar?");
        int ans = sc.nextInt() - 1;
        System.out.println("La luz de " + LucesLugar.get(ans) + " esta al nivel " + LucesIntensidad.get(ans));
        System.out.println("a que nivel deseas ponerla?");
        int lvl = sc.nextInt();
        LucesIntensidad.set(ans, lvl);
        System.out.println("La luz fue modificada");
    }

    public void EncenderTodas() {
        //enciende todas las luces a la maxima intensidad
        for (int i = 0; i < LucesIntensidad.size(); i++) {
            LucesIntensidad.set(i, 10);
        }
        System.out.println("Se encendieron todas a su maxima intensidad");
    }

    public void ApagarTodas() {
        //apaga todas las luces poniendolas a una intensidad de 0
        for (int i = 0; i < LucesIntensidad.size(); i++) {
            LucesIntensidad.set(i, 0);
        }
        System.out.println("se han apagado todas las luces");
    }

    public void QuitarLuz() {
        //Remueve una luz del sistema
        List();
        System.out.println("Que luz quitaras?");
        int ans = sc.nextInt();
        LucesIntensidad.remove(ans);
        LucesLugar.remove(ans);
        System.out.println("se removio esa luz");
    }

    public void AgregarLuz() {
        //Agrega una luz al sistema
        System.out.println("Cual es el nombre del lugar?");
        LucesLugar.add(sc.nextLine());
        LucesIntensidad.add(0);
    }
}
