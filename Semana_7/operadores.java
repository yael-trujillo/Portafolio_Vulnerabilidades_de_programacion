/* Guillermo tiene N dolares. Luis tiene la mitad de lo que tiene Guillermo.
Juan tiene la mitad de lo que tiene Luis y Guillermo juntos. Hacer un programa
que calcule e imprima la cantidad de dinero que tienen entre los tres.
 */

import java.util.Scanner;

public class operadores {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float guillermo,luis,juan,total;

        System.out.println("Digite la cantidad de dinero que tiene Guillermo: ");
        guillermo = entrada.nextFloat();

        luis = guillermo / 2;
        juan = (guillermo+luis)/2;

        total = guillermo+luis+juan;

        System.out.println("Guillermo tiene: " + guillermo);
        System.out.println("Luis tiene: " + luis);
        System.out.println("Juan tiene: " + juan);
        System.out.println("Entre los tres: " + total);
    }
}