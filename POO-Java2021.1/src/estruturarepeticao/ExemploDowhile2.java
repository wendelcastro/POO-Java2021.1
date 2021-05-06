
package estruturarepeticao;

import java.util.Scanner;


public class ExemploDowhile2 {


    public static void main(String[] args) {
        int x, y = 0;
        String resp;
        Scanner in = new Scanner(System.in);  
        do {
            System.out.print("Digite um número: "); 
            x = in.nextInt();
            y = y + x;
            System.out.print("Você deseja continuar somando em Y? [Sim/Não]");
            resp = in.next().toUpperCase();
        }while(resp.equals("SIM"));
        System.out.println("A soma de todos os valores é: " + y);
    }
    
}
