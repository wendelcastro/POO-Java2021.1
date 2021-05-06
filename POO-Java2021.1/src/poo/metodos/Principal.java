
package poo.metodos;

import java.util.Scanner;


public class Principal {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Entre com n1: ");
        int w = in.nextInt();
        System.out.println("Entre com n2: ");
        int u = in.nextInt();
        Pessoa p1 = new Pessoa();
        int resSoma = p1.somar(w, u);
        double resSoma2 = p1.somar(u);
        //double resMult = p1.multiplicar(10.5, 20.5);
        System.out.println("Soma: " + resSoma);
        System.out.println(resSoma2);
        //System.out.println("Multiplcação: " + resMult);
    }
    
}
