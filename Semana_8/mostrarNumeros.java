/*Pedir un numero N, y mostrar todos los numeros del 1 a N */

import javax.swing.JOptionPane;

public class mostrarNumeros {
    public static void main(String[] args) {
        int numero=0;    

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));

        for (int i = 1; i <= numero; i++) {
            System.out.println(i);
        }
    }
}
