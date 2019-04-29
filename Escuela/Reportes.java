package Escuela;

import java.util.Scanner;

public class Reportes {

    String fecha;
    String alumnoReporte;
    String alumnoReportado;
    String reporte;
    int cantidadReportes;

    public Reportes() {
        this.fecha = "x";
        this.alumnoReporte = "x";
        this.alumnoReportado = "x";
        this.reporte = "x";
        this.cantidadReportes = 0;
    }

    public void creacionReporte() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cantidad de reportes a realizar: ");
        cantidadReportes = sc.nextInt();

        for (int i = 0; i < cantidadReportes; i++) {
            System.out.println("==================================");    
            System.out.println("**¡Creación del reporte!**" + "");
            System.out.println("");

            System.out.print("Fecha: ");
            fecha = sc.nextLine();
            System.out.println("");

            System.out.print("Quién realiza el reporte: ");
            alumnoReporte = sc.nextLine();
            System.out.println("");

            System.out.print("Alumno a quien se reportá:");
            alumnoReportado = sc.nextLine();
            System.out.println("");

            System.out.println("Redacción del reporte: " + "\n" + "Se hace el siguiente reporte al alumno " + alumnoReportado + " por la razón de: ");
            reporte = sc.nextLine();
            System.out.println("==================================");
            
           
        }

    }
}
