
package poo.modificadores;


public class Principal {

    public static void main(String[] args) {
        Produto p1 = new Produto(20);
        p1.estoque = 50;//segurança
        p1.zerarEstoque();
    }
    
}
