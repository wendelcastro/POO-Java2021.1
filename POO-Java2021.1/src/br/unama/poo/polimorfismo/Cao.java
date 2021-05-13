
package br.unama.poo.polimorfismo;

/**
 *
 * @author wendelcastro
 */
public class Cao extends Animal{
    @Override
    public void barulho(){
        System.out.println("O cão late Au Au");
    }
    
    @Override
    public void mover(){
        System.out.println("O cão corre e muito");
    }
}
