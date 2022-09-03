import javax.swing.JOptionPane;

/*Pedir 10 numeros, y mostrar si se ha introducido un numero negativo o un cero
 */

public class indicarNumeros {
    public static void main(String[] args) {
        int numero;

        for (int i = 1; i <= 10 ; i++) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));

            if (numero < 0) {
                System.out.println(numero + " es un numero negativo");
            } else if (numero == 0) {
                System.out.println("Digito cero");
            }
        }
    }
}
