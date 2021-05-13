
package br.unama.poo.polimorfismo;

/**
 *
 * @author wendelcastro
 */
public class Passaro extends Animal{

    @Override //sobrescrevemos os métodos da classe mãe (Abstrata)
    public void barulho() {
        System.out.println("O passaro faz piu piu"); 
    }

    @Override
    public void mover() {
        System.out.println("O passaro voa..");
    }
    
}
