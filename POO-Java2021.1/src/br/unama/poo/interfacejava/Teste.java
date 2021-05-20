
package br.unama.poo.interfacejava;

/**
 *
 * @author wendelcastro
 */
//Múltipla Intefaces:
public class Teste implements PrimeiraInterface, SegundaInterface{

    @Override
    public void meuMetodo1() {
        System.out.println("Mensagem do método 1");
    }

    @Override
    public void meuMetodo2() {
        System.out.println("Mensagem do método 2");
    }
    
}
