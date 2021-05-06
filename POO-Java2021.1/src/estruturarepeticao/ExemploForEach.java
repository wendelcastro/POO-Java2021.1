
package estruturarepeticao;


public class ExemploForEach {


    public static void main(String[] args) {
        String[] cars = {"Celta", "Fusca", "Palio", "Uno"};
        //System.out.println(cars[2]);
        //cars[3] = "Gol";
        //System.out.println(cars[3]);
        //System.out.println(cars.length);
        //for (int i = 0; i < cars.length; i++){
         //   System.out.println(cars[i]);
       // }
        for (String i: cars){
            System.out.println(i);
        }
    }
    
}
