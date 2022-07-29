import java.util.Scanner;

public class tiendaLibros {
    public static void main(String[] args) {
        /*Se solicita capturar la siguiente información de una tienda de libros:
        nombre (String)
        id (int)
        precio (double)
        envioGratuito (boolean) */

    Scanner consola = new Scanner(System.in); //Variable para pedir datos al usuario
    
        System.out.println("Digita el nombre: ");
        String nombreLibro = consola.nextLine();

        System.out.println("Digita el id: ");
        int idLibro  = consola.nextInt();

        System.out.println("Digite el precio: ");
        var precioLibro = consola.nextInt();

        System.out.println("¿Envio gratuito? (true/false): ");
        boolean envioLibro = consola.nextBoolean();

        System.out.println("=================================");
        System.out.println("\t Captura exitosa");
        System.out.println("=================================");
        System.out.println("Nombre: " + nombreLibro);
        System.out.println("ID: " + idLibro);
        System.out.println("Precio: $" + precioLibro + ".00 MXN");
        System.out.println("¿Envio gratuito?: " + envioLibro);
        System.out.println("=================================");    
    }
}
