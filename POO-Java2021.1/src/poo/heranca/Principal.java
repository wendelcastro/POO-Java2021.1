
package poo.heranca;


public class Principal {


    public static void main(String[] args) {
        PagamentoBoleto pagBoleto = new PagamentoBoleto();
        pagBoleto.setDescricao("Condomínio");
        pagBoleto.setValor(450);
        pagBoleto.setData("05/05/2021");
        pagBoleto.setLinhaDigitavel("12345 65447 8990 0000 38888");
        pagBoleto.setCedente("Ed. Equilíbrio");
        pagBoleto.emitirComprovante();
        
    }
    
}
