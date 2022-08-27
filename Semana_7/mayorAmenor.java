import java.util.Scanner;

/*Pedir tres numeros y mostrarlos ordenados de mayor a menor */

public class mayorAmenor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite tres numeros: ");
        int a = entrada.nextInt();
        int b = entrada.nextInt();
        int c = entrada.nextInt();

        if ((a>b) && (b>c)){
            System.out.println("Orden: " + a + " - " + b + " - " + c);
        } else if((a>c) && (c>b)) {
            System.out.println("Orden: " + a + " - " + c + " - " + b);
        } else if((b>a) && (a>c)) {
            System.out.println("Orden: " + b + " - " + a + " - " + c);
        } else if((b>c) && (c>a)) {
            System.out.println("Orden: " + b + " - " + c + " - " + a);
        } else if((c>a) && (a>b)) {
            System.out.println("Orden: " + c + " - " + a + " - " + b);
        } else {
            System.out.println("Orden: " + c + " - " + b + " - " + a);
        }
    }
}
