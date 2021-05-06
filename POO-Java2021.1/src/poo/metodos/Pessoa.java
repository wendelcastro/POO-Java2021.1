
package poo.metodos;


public class Pessoa {
    //Atributos são as características
   String nome;
   int idade;
    //métodos são os comportamentos
   void infoPessoa(String nome,int idade){//parâmetro
       System.out.println("Seu nome é " + this.nome + " Idade " + this.idade);
   }
   
   int somar(int n1, int n2){
       return  n1 + n2;
   }
   
   float somar(float n1, float n2, float n3){
       return n1 + n2 + n3;
   }
   
   double somar(double n1){
       return n1;
   }
   
   double multiplicar(double n1, double n2){
       return n1 * n2;
   }
   
}
