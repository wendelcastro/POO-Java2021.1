
package poo.encapsulamento;


public class Principal {


    public static void main(String[] args) {
        Produto p1 = new Produto();
        
        p1.setNome("João da Silva");
        p1.setEstoque(10);
        
        System.out.println("Nome: " + p1.getNome());
        System.out.println("Estoque: " + p1.getEstoque());
    }
    
}
