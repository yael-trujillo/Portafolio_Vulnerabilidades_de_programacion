import java.util.Scanner;

public class diferenteCero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);  
        int i;

        do {
            System.out.println("Introduce un numero diferente a cero: ");
            i = entrada.nextInt();
        } while (i == 0);

        System.out.println(i);
    }
}
