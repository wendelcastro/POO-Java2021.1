
package br.unama.poo.polimorfismo;

/**
 *
 * @author wendelcastro
 */
public abstract class Animal {//classe abstrata, não pode ser
    //instânciada
    
    public void hello(){
        System.out.println("Olá! eu sou um animal");
    }//método concreto
    
    
    public abstract void barulho();//método abstrato
        
    public abstract void mover();
       
}
