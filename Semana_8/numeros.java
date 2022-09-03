import javax.swing.JOptionPane;

/*Pedir numeros hasta que se introduzca uno negativo y calcular el promedio */

public class numeros {
    public static void main(String[] args) {
        int numero, elementos = 0, suma = 0;
        float promedio;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));

        while (numero >= 0) {
            suma += numero; //Suma
            elementos++; //Aumentamos uno

            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        }
        
        if (elementos == 0) {
            System.out.println("Error, la division entre cero no existe");
        } else {
            promedio =  (float) suma / elementos;
            System.out.println("El promedio es " + promedio);
        }
    }
}
