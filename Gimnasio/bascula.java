package Gimnasio;

public class bascula {
    
    String UnidadDePeso;
    String UnidadDeMedida;
    double estatura;
    double peso;
    double IMC;

    public bascula(String UnidadDePeso, String UnidadDeMedida, double altura, double peso) {
        this.UnidadDePeso = UnidadDePeso;
        this.UnidadDeMedida = UnidadDeMedida;
        this.estatura = altura;
        this.peso = peso;
        this.IMC = IMC;
    }
    
    public bascula() {
        this.UnidadDePeso = "kg";
        this.UnidadDeMedida = "m";
        this.estatura = 1.65;
        this.peso = 70;
        this.IMC = 0;
    }
    
    public void ImprimirPeso(){
        System.out.println("SU PESO ES "+peso+UnidadDePeso);
    }
    
    public void ImprimirEstatura(){
        System.out.println("SU ESTATURA ES "+estatura+UnidadDeMedida);
    }
    
    public void ImprimirPesoEstatura(){
        System.out.println("SU PESO ES "+peso+UnidadDePeso);
        System.out.println("SU ESTATURA ES "+estatura+UnidadDeMedida);
    }
   
    public void CalcularIndiceDeMasaCorporal(){
        //Peso inferior al normal = Menos de 18.5
        //Normal = 18.5 - 24.9
        //Peso superior al normal = 25 - 29.9
        //Obesidad = Más de 30
        
        IMC = (peso/(estatura*estatura));
        System.out.println("SU INDICE DE MASA CORPORAL (IMC) ES "+IMC+"\n");
        if (IMC<18.5) {
            System.out.println("PESO INFERIOR AL NORMAL");
        }
        if (IMC>=18.5 && IMC<=24.9) {
            System.out.println("NORMAL");
        }
        if (IMC>=25 && IMC<=29.9) {
            System.out.println("PESO SUPERIOR AL NORMAL");
        }
        if (IMC>30) {
            System.out.println("OBESIDAD");
        }
    }
}
