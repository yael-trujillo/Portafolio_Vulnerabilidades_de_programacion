public class operadores {

    public static void main(String[] args) {
        int a=3, b=2;

        //Operadores aritmeticos
        System.out.println("Valor de a = " + a);
        System.out.println("Valor de b = " + b);
        var resultado = a + b;
        System.out.println("\nSuma: " + resultado);
        resultado = a - b;
        System.out.println("Resta: " + resultado);
        resultado = a * b;
        System.out.println("Multiplicacion:" + resultado);
        var resultado2 = 3.0 / b; //la division debe tener float(en ocasiones)
        System.out.println("Division: " + resultado2);

        //Operadores de asignacion
        int d = 3;
        int c = d + 5 - b;//se resuelve de izquierda a derecha
        System.out.println(c);

        System.out.println("Valor de d --> " + d);
        d += 5;// a = a + 5 (suma)
        System.out.println("Valor de d mas 5 --> " + d);
        d -= 2;// d = d - 2 (resta)
        System.out.println("Valor de d menos 2 --> " + d);
        d *= 3;// d = d * 3 (multi)
        System.out.println("Valor de d por 3 --> " + d);
        d /= 9;// d = d / 9 (div)
        System.out.println("Valor de d entre 9 --> " + d);

        //Operadores unarios
        int e = 3, f = -e; //le cambiamos el signo a la variable
        System.out.println(e);
        System.out.println(f);

        var g = true;
        var h = !g;
        System.out.println(g);
        System.out.println(h);

        //incremento de variable (funciona igual con los otros operadores +,-,*,/)
        //preincremento (simbolo antes de la variable)
        var i = 3;
        var j = ++i;//se incrementa la varibale y despues usa su valor
        System.out.println(i);
        System.out.println(j);
        //postincremento (simbolo despues de la variable)
        var k = 5;
        var l = k++;//se utiliza el valor y luego se incrementa
        System.out.println(k);//incremento pendiente
        System.out.println(l);

        //Operadores de asignacion y relacionales
        var m = 3;
        var n = 2;
        //Operador de igualdad
        var o = (m == n);
        System.out.println(o);

        var cadena = "Hola";
        var cadena2 = "Hola";
        var comp = cadena.equals(cadena2);//comparamos contenido de cadenas
        System.out.println(comp);
        //Operador diferente a
        o = m != n; //se puede poner sin parentesis
        System.out.println(o);

        //Operadores relacionales
        var p = m > n;
        System.out.println(p);
        p = m < n;//Tambien podemos mayor o igual, menor o igual
        System.out.println(p);

        //Operador ternario
        var result = (5 > 2) ? "verdadero" : "falso";
        System.out.println(result);
        //ejemplo
        var numero = 7;
        result = (numero % 2 == 0) ? "Es par" : "Es impar";
        System.out.println(result);
    }
}