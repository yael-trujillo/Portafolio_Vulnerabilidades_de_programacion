public class condicionales {
    public static void main(String[] args) {
        var a = 1;
        var valorMinimo = 0;
        var valorMaximo = 10;

        //&& = los dos valores deben ser verdaderos --> true
        var resultado = a >= valorMinimo && a <= valorMaximo;
        System.out.println(resultado);

        if (resultado) {
            System.out.println("Dentro del rango");
        } else {
            System.out.println("Fuera del rango");
        }

        //|| uno de los valores debe ser verdadero --> true

        var vacaciones = true;
        var diaDescanso = false;

        if (vacaciones || diaDescanso) {
            System.out.println("Puede tomarse un descanso");
        } else {
            System.out.println("No tiene permitido salir");
        }
    }
}
