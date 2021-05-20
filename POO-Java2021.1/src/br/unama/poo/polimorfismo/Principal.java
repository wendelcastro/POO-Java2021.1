
package br.unama.poo.polimorfismo;


public class Principal {

  

    public static void main(String[] args) {
        //Classe Abstrata não se instancia objeto
        Animal c1 = new Cao(); // é um
        c1.hello();
        c1.barulho();
        c1.mover();
        System.out.println("\n");
        Animal p1 = new Passaro(); //é um
        p1.hello();
        p1.barulho();
        p1.mover();
    }
    
}
