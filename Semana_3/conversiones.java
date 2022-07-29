import java.util.Scanner;

public class conversiones {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        
        var dato = "20";
        System.out.println(dato + 1); //no podemos hacer operaciones matematicas

        //Convertir String a int
        var edad = Integer.parseInt("20");
        System.out.println(edad + 1);//ya podemos hacer operaciones matematicas

        //convertir String a double
        var valorPi = Double.parseDouble("3.1416");
        System.out.println(valorPi*3);//ya podemos hacer operaciones matematicas

        System.out.println("Proporciona edad: ");
        edad = Integer.parseInt(consola.nextLine());//tomamos la cadena y lo convierte en int
        System.out.println(edad);

        //convertir int a String
        var otraEdad = String.valueOf(35);
        System.out.println(otraEdad + 1);

        //si solo queremos recuperar un caracter en especifico
        var caracter = "hola".charAt(0);
        System.out.println(caracter);

        //la variable soló guardara el primer valor 
        System.out.println("Proporciona un caracter: ");
        caracter = consola.nextLine().charAt(0);
        System.out.println(caracter);
    }
}
