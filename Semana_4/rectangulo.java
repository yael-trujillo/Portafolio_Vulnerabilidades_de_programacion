import java.util.Scanner;

public class rectangulo {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        System.out.println("Proporciona el alto: ");
        int alto = consola.nextInt();
        System.out.println("Proporciona el ancho: ");
        int ancho = consola.nextInt();

        int area = alto * ancho;
        int perimetro = (alto + ancho)  * 2;

        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + perimetro);
    }
}
