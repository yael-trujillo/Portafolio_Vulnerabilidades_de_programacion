import java.util.Scanner;

public class mayorEdad {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        System.out.println("¿Que edad tienes? ");
        int edad = consola.nextInt();

        if (edad > 0 && edad <= 119) {
            if (edad >= 18) {
                System.out.println("Eres mayor de edad");
            } else {
                System.out.println("Eres menor de edad");
            }
        } else {
            System.out.println("Edad incorrecta");
        }
    }
}
