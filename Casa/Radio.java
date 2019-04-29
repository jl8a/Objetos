package Casa;

import java.util.Scanner;

public class Radio {
    int estacion;
    int volumen;
    boolean encendido;

    Scanner resp = new Scanner(System.in);
    
    public Radio(int estacion, int volumen, boolean encendido) {
        this.estacion = estacion;
        this.volumen = volumen;
        this.encendido = encendido;
    }
    
    public Radio() {
        this.estacion = 88;
        this.volumen = 15;
        this.encendido = false;
    }
    
    public void encender (boolean encendido, double estación, int volumen) {
        this.encendido = true;
        System.out.println("Escriba el número de la estación desea poner?: ");
        System.out.println("1.- Oldies");
        System.out.println("2.- Rock");
        System.out.println("3.- Corridos");

        
        estacion = resp.nextInt();
        
        switch (estacion){
            case 1:
                System.out.println("I don't want to set the world on fire");
                System.out.println("I just want to start a flame in your heart");
                System.out.println("In my heart I have but one desire");
                System.out.println("And that one is you, no other will do");
                System.out.println("I've lost all ambition for worldly acclaim");
                System.out.println("I just want to be the one you love");
                System.out.println("And with your admission that you'd feel the same");
                System.out.println("I'll have reached the goal I'm dreaming of, believe me");
                System.out.println("I don't want to set the world on fire");
                System.out.println("I just want to start a flame in your heart");
                System.out.println("I don't want to set the world on fire, honey");
                System.out.println("I love you too much");
                System.out.println("I just want to start a great big flame down in your heart");
                System.out.println("You see, way down deep inside of me, darling");
                System.out.println("I have only one desire");
                System.out.println("And that one desire is you");
                System.out.println("And I know, baby, ain't nobody else gonna do");
                System.out.println("I've lost all ambition for worldly acclaim");
                System.out.println("I just want to be the one you love");
                System.out.println("And with your admission that you'd feel the same");
                System.out.println("I'll have reached the goal I'm dreaming of, believe me");
                System.out.println("I don't want to set the world on fire");
                System.out.println("I just want to start a flame in your heart");
            break;
            
            case 2:
                System.out.println("Back in black\n" +
                "I hit the sack\n" +
                "I've been too long I'm glad to be back\n" +
                "Yes, I'm let loose\n" +
                "From the noose\n" +
                "That's kept me hanging about\n" +
                "I've been looking at the sky\n" +
                "'Cause it's gettin' me high\n" +
                "Forget the hearse 'cause I never die\n" +
                "I got nine lives\n" +
                "Cat's eyes\n" +
                "Abusin' every one of them and running wild\n" +
                "'Cause I'm back\n" +
                "Yes, I'm back\n" +
                "Well, I'm back\n" +
                "Yes, I'm back\n" +
                "Well, I'm back, back\n" +
                "Well, I'm back in black\n" +
                "Yes, I'm back in black\n" +
                "Back in the back\n" +
                "Of a Cadillac\n" +
                "Number one with a bullet, I'm a power pack\n" +
                "Yes, I'm in a bang\n" +
                "With a gang\n" +
                "They've got to catch me if they want me to hang\n" +
                "'Cause I'm back on the track\n" +
                "And I'm beatin' the flack\n" +
                "Nobody's gonna get me on another rap\n" +
                "So look at me now\n" +
                "I'm just makin' my play\n" +
                "Don't try to push your luck, just get out of my way\n" +
                "'Cause I'm back\n" +
                "Yes, I'm back\n" +
                "Well, I'm back\n" +
                "Yes, I'm back\n" +
                "Well, I'm back, back\n" +
                "Well, I'm back in black\n" +
                "Yes, I'm back in black\n" +
                "Well, I'm back, yes I'm back\n" +
                "Well, I'm back, yes I'm back\n" +
                "Well, I'm back, back\n" +
                "Well I'm back in black\n" +
                "Yes I'm back in black\n" +
                "Ho yeah\n" +
                "Oh yeah\n" +
                "Yes I am\n" +
                "Oh yeah, yeah oh yeah\n" +
                "Back in now\n" +
                "Well I'm back, I'm back\n" +
                "Back, (I'm back)\n" +
                "Back, (I'm back)\n" +
                "Back, (I'm back)\n" +
                "Back, (I'm back)\n" +
                "Back\n" +
                "Back in black\n" +
                "Yes I'm back in black\n" +
                "Out of the sight");
            break;
            
            case 3:
                System.out.println("Si señor yo soy de rancho\n" +
                "Soy de botas y a caballo\n" +
                "Soy nacido y creado en el monte\n" +
                "En barrancos y brechas\n" +
                "Me la he navegado\n" +
                "El olor a ganado costales de mota\n" +
                "Y el cantar de los gallos\n" +
                "Con frijoles de agua y sal\n" +
                "Mis padres me dieron crianza\n" +
                "No ocupe mas de un buen catre\n" +
                "Y una cobijona para las heladas\n" +
                "Y cuando ajustaba el caloron macizo\n" +
                "En el río me bañaba\n" +
                "Pero también me gustan las marcas\n" +
                "Vestirme a la moda contar buenos carros\n" +
                "Y aunque mi dinero sea ranchero\n" +
                "Aquí vale lo mismo no me lo he robado\n" +
                "Los cerros forrados de la mota\n" +
                "En greña costales llenando\n" +
                "Ay Pa toda la Plebada de Rancho pariente\n" +
                "En un Racer o a caballo o una troca ganadera\n" +
                "Depende cual sea el motivo\n" +
                "El negocio o la brecha o por la carretera\n" +
                "Y si ando enfiestado no mas con\n" +
                "Plebitas la Hemi me espera\n" +
                "La Virgen de Guadalupe y un San Judas\n" +
                "En el pecho es cierto que soy creyente\n" +
                "Y aunque estoy muy plebe también\n" +
                "Soy muy serio si se han preguntado\n" +
                "Por lo mujeriego viene de mi abuelo\n" +
                "Con orgullo digo soy de rancho\n" +
                "Y si visto de marca no olvido el pasado\n" +
                "Los mejores consejos de un viejo\n" +
                "Muy agradecido a mi padre adorado\n" +
                "El cerro es testigo que entre los pinales\n" +
                "Yo me la he rifado");
            break;
        }
    }
    
    public void apagar (boolean encendido){
        if (encendido == true) {
            System.out.println("La radio se a apagado.");
            this.encendido = false;
        } else {
            System.out.println("La radio ya esta apagada.");
        }
    }
    
}