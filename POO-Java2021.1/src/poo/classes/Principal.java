
package poo.classes;


public class Principal {

    public static void main(String[] args) {
        //Instanciar/criar um objeto do tipo Carro
         //Declaramos uma varíavel
        Carro meuCarro = new Carro();//Intanciação de um carro
        meuCarro.anoFabricacao = 2010;
        meuCarro.cor = "Preto";
        meuCarro.fabricante = "Fiat";
        meuCarro.modelo = "Argo";
        meuCarro.tipoCombustivel = "Bicobustível";
        meuCarro.varlorMercado = 50000;
        
        //Acessando atributod do objeto Carro
        System.out.println("Modelo: " + meuCarro.modelo);
        System.out.println("Ano Fab: " + meuCarro.anoFabricacao);
        Carro seuCarro = new Carro();
    }
    
}
