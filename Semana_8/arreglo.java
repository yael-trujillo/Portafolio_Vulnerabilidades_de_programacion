import java.util.Scanner;

/*Leer cinco numeros, guiardarlos en un arreglo y mostrarlos en el mismo orden introducido */

public class arreglo {
    public static void main(String[] args) {
        float numeros[] = new float[5];

        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print((i+1) + ". Digite un numero: ");
            numeros[i] = entrada.nextFloat();
        }

        System.out.print("\nImprimir los elementos del arreglo.\n");
        for (float i : numeros) {
            System.out.println(i);
        }
    }
}
