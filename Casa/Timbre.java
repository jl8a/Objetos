/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Casa;

/**
 *
 * @author YesicaIrasema
 */
public class Timbre {
    boolean tocarTimbre;

    public Timbre(boolean tocarTimbre) {
        this.tocarTimbre = tocarTimbre;
    }
    public Timbre() {
        this.tocarTimbre = true;
    }
    
    public void sonar(boolean tocarTimbre){
        if (tocarTimbre==true) {
            System.out.println("Ding Dong");
        }else{
            System.out.println(" ... ");
        }
        
    }
}
