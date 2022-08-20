package operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        //Creacion de objeto
        Aritmetica aritmetica1 = new Aritmetica();
        //constructor vacio
        Aritmetica aritmetica2 = new Aritmetica();
        //Constructor con argumentos
        Aritmetica aritmetica3 = new Aritmetica(25, 3);
        
        //Variables locales
        //Se crean y se destruyen dentro de este metodo
        int a = 10;
        int b = 5;
        
        aritmetica1.a = 5;
        aritmetica1.b = 2;
        aritmetica1.sumar();
        
        int res = aritmetica1.sumarConRetorno();
        System.out.println("La suma que retorna es -> " + res);
        
        int res1 = aritmetica1.sumarConArgumentos(80, 74);
        System.out.println("Operacion con parametros -> " + res1);
        
        ////////////////////
        System.out.println("\naritmetica2 a -> " + aritmetica2.a);
        System.out.println("aritmetica2 b -> " + aritmetica2.b);
        
        System.out.println("aritmetica3 a -> " + aritmetica3.a);
        System.out.println("aritmetica3 b -> " + aritmetica3.b);
    }
    
    //Variable a y b no se pueden utilizar fuera del metodo
}
