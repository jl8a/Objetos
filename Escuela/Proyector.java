package Escuela;

import java.util.Scanner;

public class Proyector {

    String conexionTipo;
    String Estado;
    Boolean conectado = false;
    int size;
    Scanner sc = new Scanner(System.in);

    public Proyector() {
        //Constructor Default
        this.conexionTipo = "vga";
        this.Estado = "apagado";
        this.size = 80;
    }

    public Proyector(String conexionTipo, String Estado, int size) {
        //Constructor Custom
        this.conexionTipo = conexionTipo;
        this.Estado = Estado;
        this.size = size;
    }

    public void BotonPower() {
        //El boton de encendido, si esta encendido se apaga, si esta apagado se enciende
        if (Estado.equalsIgnoreCase("apagado")) {
            Estado = "encendido";
        } else {
            Estado = "apagado";
        }
    }

    public void Conectar(String conexion) {
        //si esta encendida revisara la conexion que quieres poner y conectara el dispositivo
        if (Estado.equalsIgnoreCase("encendido")) {
            if (conexion.equalsIgnoreCase(conexionTipo)) {
            conectado = true;
            System.out.println("Se reconocio el dispositivo y esta listo para usarse");
        } else {
            System.out.println("La conexion no es igual, deberia ser " + conexionTipo);
        }
        } else System.out.println("piensas: \"Creo que deberia encenderla primero\"");
    }

    public void Desconectar() {
        //Desconecta el cable
        conectado = false;
        System.out.println("Es seguro retirar el cable");
    }

    void PrintToRigth(String banana) {
        //Proyecta todo hacia la derecha ...mas o menos...
        String b[] = banana.split(" ");
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }

    void PrintToLeft(String banana) {
        //Proyecta todo hacia la izquierda ...mas o menos...
        String b[] = banana.split(" ");
        for (int i = 0; i < b.length; i++) {
            int spaces = size - b[i].length();
            String blank = "";
            for (int j = 0; j < spaces; j++) {
                blank = blank + " ";
            }
            System.out.println(blank + b[i]);
        }
    }

    void PrintCentered(String banana) {
        //Proyecta todo centrado ...mas o menos...
        String b[] = banana.split(" ");
        for (int i = 0; i < b.length; i++) {
            int spaces = size - b[i].length();
            String blank = "";
            for (int j = 0; j < spaces / 2; j++) {
                blank = blank + " ";
            }
            System.out.println(blank + b[i]);
        }
    }

    public void ProyectarTexto(String txt) {
        //Proyecta el texto a como lo pida el usuario, solo si se encendio y se conecto primero
        if (Estado.equalsIgnoreCase("encendido")) {
            if (conectado) {
            System.out.println("Que clase de Proyeccion quieres?");
            System.out.println("1=A la Izquierda");
            System.out.println("2=A la Derecha");
            System.out.println("3=Centrado");
            int ans = sc.nextInt();
            System.out.println("-------------------------------");
            switch (ans) {
                case 1:
                    PrintToLeft(txt);
                    break;
                case 2:
                    PrintToRigth(txt);
                    break;
                case 3:
                    PrintCentered(txt);
                    break;
            }
            System.out.println("-------------------------------");
        }else System.out.println("hay un problema con el proyector, revisa la conexion.");
        } else System.out.println("Piensas: \"ay estoy bien menso, deberia prenderla primero\"");
    }
}
