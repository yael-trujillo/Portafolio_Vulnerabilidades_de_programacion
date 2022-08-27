import javax.swing.JOptionPane;

/*Hacer un juego para adivinar un numero. Generar un numero aaleatorio entre 0-100 y luego ir pidiendo numeros
 * indicando si es mayor o menor segun sea con respecto a N. El proceso termina cuando el usuario acierta
 * y mostrar el numero de intentos
 */

public class adivinarNumero {
    public static void main(String[] args) {
        int num,ale,intentos = 0;

        ale = (int)(Math.random()*100); //convertimos a entero

        do {
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));

            if(ale > num) {
                System.out.println("Digite un numero mayor");
            } else {
                System.out.println("Digite un numero menor");
            }
            intentos++;//Aumentamos los intentos
        } while (num != ale);

        System.out.println("\nAdivinaste el numero en " + intentos + " intentos");
    }
}
