import java.util.Scanner;

public class principal {
    public static int indiceCocheMBarato(Vehiculo coches[]) {
        float precio;
        int indice = 0;

        precio = coches[0].getPrecio();

        for (int i = 1; i < coches.length; i++) {
            if (coches[i].getPrecio() < precio) {
                precio = coches[i].getPrecio();
                indice = i;
            }
        }
        return indice;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String marca,modelo;
        float precio;
        int numeroVehiculos,indiceBarato;

        System.out.println("Digite la cantidad de vehiculos: ");
        numeroVehiculos = entrada.nextInt();

        //Creamos objetos para los coches
        Vehiculo coches[] = new Vehiculo[numeroVehiculos];

        for (int i = 0; i < coches.length; i++) {
            entrada.nextLine();
            System.out.println("\nDigite las caracteristicas del vehiculo " + (i+1)+":");
            System.out.println("Introduzca la marca: ");
            marca = entrada.nextLine();
            System.out.println("Introduzca el modelo del coche: ");
            modelo = entrada.nextLine();
            System.out.println("Introduzca el precio: ");
            precio = entrada.nextFloat();

            coches[i] = new Vehiculo(marca, modelo, precio);
        }


        indiceBarato = indiceCocheMBarato(coches);
        System.out.println("\nEl coche mas barato es: ");
        System.out.println(coches[indiceBarato].mostrarDatos());
    }
}
