
package br.unama.poo.inner;

/**
 *
 * @author wendelcastro
 */
public class ClasseExterna {
    int x = 10;
    
    public void teste(){
        ClasseInterna ci = new ClasseInterna();
        System.out.println(ci.y);
    }
    //Classe Java Inner
    private class ClasseInterna {
        int y = 20;
        
        public void teste(){
            System.out.println("Testando classe interna");
        }
    }
}
