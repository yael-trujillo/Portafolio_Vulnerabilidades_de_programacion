// Mi primer clase en java
public class HolaMundo {
    public static void main(String args[]){
        //Imprimiremos el mensaje en pantalla
        System.out.println("Hola Mundo");
        
        //Creacion de una variable entera
        int miVariableEntera = 10;
        System.out.println(miVariableEntera);
        
        //cambiamos el valor de la variable (tiene que ser un valor entero)
        miVariableEntera = 85;
        System.out.println("El valor a cambiado...");
        System.out.println(miVariableEntera);
        
        //Creacion de una variable string
        String miVariableCadena = "Saludos, esta es una variable string.\n";
        System.out.println(miVariableCadena);
        
        //Cambiamos el valor de la variable string
        miVariableCadena = "Adios, un gusto.";
        System.out.println(miVariableCadena);
    }
}