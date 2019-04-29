package Gasolineria;

import java.util.Random;

public class BombaDeAgua {
    Random rng = new Random();
    Boolean AguaActiva;
    Boolean AireActivo;
    int PresionAgua;
    int PresionAire;

    public BombaDeAgua(Boolean AguaActiva, Boolean AireActivo, int PresionAgua) {
        //Constructor Custom
        this.AguaActiva = AguaActiva;
        this.AireActivo = AireActivo;
        this.PresionAgua = PresionAgua;
    }
    public BombaDeAgua() {
        //Constructor Default
        this.AguaActiva = true;
        this.AireActivo = true;
        this.PresionAgua = 150;
        this.PresionAire= 20;
    }
    boolean Desgaste(){
        //un randomizador que hara que la bomba se arruine en algun momento de su uso
        if (rng.nextInt(100)>=90) {
            return true;
        }
        else return false;
    }
    public void UsarAgua() {
        //Se dispensa agua, y se dira si esta fuera de servcio o no y en caso de usarse se roleara si en este uso la maquina se estropea
        if (AguaActiva) {
            System.out.println("Dispensando agua a " + PresionAgua + " kPa");
            if (Desgaste()){
                AguaActiva=false;
                System.out.println("Parece que usaste mal la maquina y se estropeo");
            }
        } else {
            System.out.println("Esta bomba de agua esta fuera de servicio");
        }
        System.out.println("----------------------------");
    }
    public void UsarAire() {
        //igual que con la de agua, dispensara agua y tendra una posibilidad de estropearse
        if (AireActivo) {
            System.out.println("Dispensando agua a " + PresionAire + " psi");
            if (Desgaste()){
                AireActivo=false;
                System.out.println("Parece que usaste mal la maquina y se estropeo");
            }
        } else {
            System.out.println("Esta bomba de aire esta fuera de servicio");
        }
        System.out.println("----------------------------");
    }
    public void Reparar(){
        //si alguna bomba esta dañada se arreglara de otra manera solo dira que esta bien
        if (!AireActivo){
            System.out.println("La bomba de Aire esta actualmente rota, se mandara a arreglar");
            AireActivo=true;
            System.out.println("Se ha arreglado la bomba de aire, tenga cuidado con su uso");
            System.out.println("----------------------------");
        } else System.out.println("Parece que la bomba de aire no necesita arreglo");
        if (!AguaActiva){
            System.out.println("La bomba de Agua esta actualmente rota, se mandara a arreglar");
            AguaActiva=true;
            System.out.println("Se ha arreglado la bomba de agua, tenga cuidado con su uso");
            System.out.println("----------------------------");
        } else System.out.println("Parece que la bomba de agua no necesita arreglo");
    }
}
