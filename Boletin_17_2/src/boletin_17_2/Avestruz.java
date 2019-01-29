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
public class Avestruz extends Aves implements IPodeCaminhar{
    @Override
    public void caminar(){
        System.out.println("Os avestruces poden camiñar");
    }
}