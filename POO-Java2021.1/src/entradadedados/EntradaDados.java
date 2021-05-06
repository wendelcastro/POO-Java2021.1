package entradadedados;

import java.util.Scanner;

public class EntradaDados {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String name = in.nextLine();
        System.out.println("Digite o seu salário: ");
        float salario = in.nextFloat();
        
        System.out.println("Seu nome é: " + name);
        System.out.println("Seu salário: " + salario);

    }

}
