
import java.util.Scanner;

public class entradaDatos {
    public static void main(String args[]){
        System.out.println("Escribe tu nombre: ");
        Scanner consola = new Scanner(System.in);
        var usuario = consola.nextLine();
        System.out.println(usuario+", ¿Que titulo tienes?: ");
        var titulo = consola.nextLine();
        System.out.println("\nDatos");
        System.out.println("Nombre: "+usuario);
        System.out.println("Titulo: "+titulo);
    }
}
