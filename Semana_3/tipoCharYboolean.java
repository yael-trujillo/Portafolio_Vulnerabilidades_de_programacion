public class tipoCharYboolean {
    public static void main(String[] args) {
        //TIPO CHAR
        char miCaracter = '!'; //Creacion de variable char
        //Podemos pasarle el caracter, valor unicode o decimal
        char miCaracter2 = '\u0021';
        //Podemos pasar su valor decimal
        char miCaracter3 = 33;
        System.out.println("Valor en string: " + miCaracter);
        System.out.println("Valor en unicode: " + miCaracter2);
        System.out.println("Valor en decimal: " + miCaracter3);

        var miCaracter4 = '!';
        var miCaracter5 = '\u0021';
        var miCaracter6 = 33; //Lo tomara como numero entero
        //si queremos convertirlo seria --> var [nombreVariable] = (char)33
        System.out.println("Valor en string con var: " + miCaracter4);
        System.out.println("Valor en unicode con var: " + miCaracter5);
        System.out.println("Valor en decimal con var: " + miCaracter6);


        // =================================================================
        //TIPO BOOLEAN

        boolean valor = true;
        System.out.println(valor);

        if (valor) {
            System.out.println("La bandera es verdadera");
        }
        else {
            System.out.println("La bandera es falsa");
        }

        var edad = 28;
        //var esAdulto = edad >= 18;
        if (edad >= 18) {
            System.out.println("Mayor de edad");
        }
        else {
            System.out.println("Menor de edad");
        }
    }
}