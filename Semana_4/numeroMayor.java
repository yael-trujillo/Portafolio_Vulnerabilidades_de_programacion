import java.util.Scanner;

public class numeroMayor {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        System.out.println("Digite un numero: ");
        int num1 = Integer.parseInt(consola.nextLine());
        System.out.println("Digite otro numero: ");
        int num2 = Integer.parseInt(consola.nextLine());

        //System.out.println("El numero mayor es: ");
        //System.out.println(num1 > num2 ? num1 : num2);
        
        if (num1 == num2) {
            System.out.println("Ambos son iguales");
        } else {
            if (num1 < num2) {
                System.out.println(num1 + " es menor a " + num2);
            } else {
                System.out.println(num1 + " es mayor a " + num2);
            }
        }
    }
}
