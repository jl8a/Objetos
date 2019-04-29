package Parque;

public class Resbaladilla {
    boolean escaleras;
    String material;
    String altura;

    public Resbaladilla() { //Constructor default
        this.escaleras = true;
        this.material = "plastico";
        this.altura = "1 metro";
    }
    
    public Resbaladilla(boolean escaleras, String material, String altura) {  //Constructor personalizado
        this.escaleras = escaleras;
        this.material = material;
        this.altura = altura;
    }
    
    public void Caracteristicas(){ //Metodo para ver las caracteristicas de la resbaladilla
        System.out.println("La resbaladilla tiene las siguientes caracteristicas: ");
        if (escaleras==true) {
            System.out.println("Tiene escaleras");
        }else System.out.println("No tiene escaleras");
        System.out.println("Esta hecho de "+material);
        System.out.println("Tiene una altura de "+altura);
    }
    
    public void Resbalarse() throws InterruptedException{ //Metodo para resbalarse
        System.out.println("Vamos a resbalarnos!");
        Thread.sleep(2000);
        System.out.println("Sube primero por las escaleras");
        Thread.sleep(2000);
        if (escaleras==true) {
            System.out.println("Muy bien!");
            Thread.sleep(2000);
            System.out.println("Ahora sientate y deslizate con las manos para impulsarte");
            Thread.sleep(2000);
            if (material.equalsIgnoreCase("fierro")) {
                System.out.println("¡Ten cuidado! puede estar caliente y te puedes quemar");
            } Thread.sleep(2000);
            System.out.println("¡Te estas resbalando wuuu!");
            Thread.sleep(2000);
            System.out.println("El paseo a terminado, fue divertido!");
        }else System.out.println("La resbaladilla no cuenta con escaleras y no es posible subirse :c");
    }
}
