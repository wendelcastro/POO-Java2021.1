
package estruturacondicional;

public class ExemploSwitchCalc {

    public static void main(String[] args) {
        int n1,n2,r;
        String operador = "+";
        switch (operador){
            case "+":
                n1 = 10;
                n2 = 20;
                r = n1 + n2;
                System.out.println("A soma de N1 + N2 = " + r);
                break;
            case "-":
                n1 = 10;
                n2 = 20;
                r = n1 - n2;
                System.out.println("A subtração de N1 - N2 = " + r);
                break;
             default:
                 System.out.println("Nenhuma operação foi encontrada, digite outra");
        }
    }
    
}
