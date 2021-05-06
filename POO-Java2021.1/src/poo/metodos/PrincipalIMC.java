
package poo.metodos;

public class PrincipalIMC {

    
    public static void main(String[] args) {
       Paciente p = new Paciente();
       p.peso = 100;
       p.altura = 1.60;
       
       IMC imc = p.calcularIMC();
       
        System.out.println("Abaixo do peso ideal " + imc.abaixodoPesoIdeal);
        System.out.println("Peso Ideal " + imc.pesoIdeal);
        System.out.println("Obeso " + imc.obeso);
        System.out.println("Grau de Obesidade " + imc.grauObesidade);
    }
    
}
