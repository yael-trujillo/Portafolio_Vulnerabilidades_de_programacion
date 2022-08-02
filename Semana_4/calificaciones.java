import java.util.Scanner;

public class calificaciones {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        System.out.println("Digite un numero entre 0 y 10: ");
        int calif = consola.nextInt();

        switch (calif) {
            case 9: case 10:
                System.out.println("A");
                break;
            case 8: case 7:
                System.out.println("B");
                break;
            case 6: case 5:
                System.out.println("C");
                break;
            case 4: case 3: case 2: case 1: case 0:
                System.out.println("D");
                break;
            default:
                System.out.println("Dato incorrecto");
                break;
        }
    }
}
