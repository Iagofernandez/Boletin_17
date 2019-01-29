/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_17;

/**
 *
 * @author ifernandezblanco
 */
public class Gato extends Mamiferos implements IPodeNadar{
    @Override
    public void nadar(){
        System.out.println("Os gatos poden nadar");
    }
}
