
package br.unama.poo.inner;

/**
 *
 * @author wendelcastro
 */
public class Principal {


    public static void main(String[] args) {
        ClasseExterna ce = new ClasseExterna();
        //instanciar a classe interna
       // ClasseExterna.ClasseInterna ci = ce.new ClasseInterna();
        //System.out.println(ce.x + ci.y);
        ce.teste();
    }
    
}
