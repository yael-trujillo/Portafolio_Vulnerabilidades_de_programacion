import java.util.Scanner;
/*Un obrero necesita calcular su salario semanal, el cual se obtiene de la
 * siguiente manera:
 * - Si trabaja 40 horas o menos se le paga $16 por hora
 * - Si trabaja mas de 40 horas se le paga $16 y $20 por cada hora extra
 */

public class salario2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int salario, hora = 16;

        System.out.println("Horas de trabajo esta semana: ");
        int horas = entrada.nextInt();

        if (horas <= 40) {
            salario = hora * horas;
        } else {
            salario = (40*hora) + ((horas-40) * 20);
        }

        System.out.println("Tu salario es: " + salario);
    }
}
