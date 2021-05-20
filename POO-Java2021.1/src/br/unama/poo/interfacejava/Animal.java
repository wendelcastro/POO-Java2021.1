
package br.unama.poo.interfacejava;

/**
 *
 * @author wendelcastro
 */
public interface Animal {
    //criando dois métodos sem corpo\\
    //Os métodos podem ser public ou abstract
    public void somAnimal();
    public void mover();
    public void dormir();
    
    //Por que eu uso Interface?
    //Segurança - oculto informações/detalhes
    
    //Java não suporta "Herança múltipla"
    //(Uma classe só pode herdar de uma superclasse)
}
