
package poo.modificadores;


public class Produto {
    protected int estoque;
    
    public Produto(int estoque){
        this.estoque = estoque;
    }
    
    public void zerarEstoque(){
        this.estoque = 0;
        System.out.println("Teste");
    }
}
