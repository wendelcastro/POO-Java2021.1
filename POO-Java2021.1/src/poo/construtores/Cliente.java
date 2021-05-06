
package poo.construtores;


public class Cliente {
    String nome;//atributo
    String cpf;
    
    Cliente(){
        
    }
    
    Cliente(String nome){//construtor -> Inicializa os objetos
       // System.out.println("Inicializando o objeto C1");
        this.nome = nome;
    }
    
    Cliente(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }
    
}
