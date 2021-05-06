
package estruturarepeticao;

import javax.swing.JOptionPane;

public class ExemploRepeticao {

    
    public static void main(String[] args) {
        int x, y = 0;
        
        do{
            x = Integer.parseInt(JOptionPane.showInputDialog("Digite um número, mas o [0], interrompe"));
            y = y + x;
        }while(x != 0);
        
        JOptionPane.showMessageDialog(null, "O resultado é: " + y);
        
    }
    
}
