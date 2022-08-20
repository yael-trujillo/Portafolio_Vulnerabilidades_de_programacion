package operaciones;

public class Aritmetica {    
    
    //Argumentos
    int a;
    int b;
    
    //Constructor vacio (Metodo especial)
    public Aritmetica() {
        System.out.println("Ejecutando constructor");
    }
    
    //Contructor con argumentos
    public Aritmetica(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("Ejecutando contructor con argumentos");
    }
    
    //Metodo
    public void sumar() {
        int c = a + b;
        System.out.println("La suma de los numeros es = " + c);
    }
    
    public int sumarConRetorno() {
//        int res = a + b;
//        return res;
        return a + b;
    }
    
    public int sumarConArgumentos(int arg1, int arg2) {
        a = arg1;
        b = arg2;
        //return a + b;
        return sumarConRetorno();
    }
}
