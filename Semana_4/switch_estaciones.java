import java.util.Scanner;

public class switch_estaciones {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        var estacion = "desconocida";

        System.out.println("Digite un mes: ");
        int mes = consola.nextInt();

        switch (mes) {
            case 1: case 2: case 12:
                estacion = "invierno";
                break;
            case 3: case 4: case 5:
                estacion = "primavera";
                break;
            case 6: case 7: case 8:
                estacion = "verano";
            case 9: case 10: case 11:
                estacion = "otoño";
        }
        System.out.println("La estacion es " + estacion);
    }
}
