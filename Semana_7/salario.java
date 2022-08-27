import java.util.Scanner;

/*Una compañia de venta de carros usados, paga a su personal de ventas un
un salario de $1000 mensuales, mas una comision de $150 por cada carro vendido.
 Hacer un programa que calcule e imprima el salario mensual de un vendedor dado.
 */

public class salario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float salario=1000,comision=150,vendidos;

        System.out.println("Cuantos carros vendio?: ");
        vendidos = entrada.nextInt();

        comision *= vendidos;
        salario += comision;

        System.out.println("Usted gano en comisiones: $" + comision);
        System.out.println("Sueldo del mes: $" + salario);
    }
}
