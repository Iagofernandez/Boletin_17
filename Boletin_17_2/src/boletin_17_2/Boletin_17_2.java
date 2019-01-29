/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_17_2;

/**
 *
 * @author ifernandezblanco
 */
public class Boletin_17_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gato obxG=new Gato();
        obxG.nadar();
        obxG.caminar();
        
        Mamifero obxM=new Mamifero();
        obxM.caminar();
        
        Papagaio obxP=new Papagaio();
        obxP.voar();
    }
    
}
