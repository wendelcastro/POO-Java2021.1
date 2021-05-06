
package poo.metodos;


public class Paciente {
    double peso;
    double altura;
    
    IMC calcularIMC(){
        IMC imc = new IMC();
        double indice = peso / (altura * altura);
        //analisar o índice do paciente
        if(indice < 18.5) {
           imc.abaixodoPesoIdeal = true; //verdade
        } else if (indice < 25){
            imc.pesoIdeal = true; //verdade
        } else {
            imc.obeso = true;
            
            if (indice < 30) {
                imc.grauObesidade = "Acima do pesso";
            } else if (indice < 35){
                imc.grauObesidade = "I";
            } else if (indice < 40) {
                imc.grauObesidade = "II";
            } else {
                imc.grauObesidade = "III";
            }
        }
        return imc;
    }
}
