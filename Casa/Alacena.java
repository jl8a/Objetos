package Casa;

import java.util.Arrays;
import java.util.Scanner;

public class Alacena {

    String colorAlacena; //Color de la alacena: café, verde, azul, etc.
    String materialAlacena; //Material de la alacena: Arce, abedul, roble, etc.
    int modeloAlacena; //Modifica la capacidad de almacenamiento de la alacena (5 objetos, 6 objetos, etc).
    

    public void creacionAlacena() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Material de la alacena:");
        materialAlacena = sc.nextLine();
        System.out.println("");

        System.out.println("Color de la alacena:");
        colorAlacena = sc.nextLine();
        System.out.println("");

        System.out.println("Modelos de alacenas:");
        System.out.println("- El modelo 1 cuenta con una capacidad para 1 objetos.");
        System.out.println("- El modelo 2 cuenta con una capacidad para 2 objetos.");
        System.out.println("- El modelo 3 cuenta con una capacidad para 3 objetos.");

        switch (modeloAlacena = sc.nextInt()) {

            case 1:
                System.out.println("La alacena únicamente puede guardar 1 objeto dentro de ella.");
                break;

            case 2:
                System.out.println("La alacena únicamente guarda 2 objetos en su interior.");
                break;

            case 3:
                System.out.println("La alacena tiene capacidad de almacenamiento de 3 objetos.");
        }
        System.out.println("");
        System.out.println("¡Perfecto!" + "\n" + "El material de la alacena es " + materialAlacena + ", su color es " + colorAlacena + " y su modelo es el número " + modeloAlacena);
    }

    public void guardarObjetos() {
        System.out.println("");

        Scanner sc = new Scanner(System.in);

        System.out.println("Entonces, vamos a guardar algunos objetos dentro de la alacena!" + "\n");

        String[] numeroObjetos = new String[modeloAlacena];

        for (int i = 0; i < modeloAlacena; i++) {
            System.out.print((i + 1) + ".- ");
            numeroObjetos[i] = sc.nextLine();
        }

        System.out.println("");

        System.out.println("Los objetos dentro de la alacena son: " + "\n" + Arrays.toString(numeroObjetos));

        System.out.println("");
    }

}
