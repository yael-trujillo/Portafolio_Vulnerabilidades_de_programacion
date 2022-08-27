import javax.swing.JOptionPane;

/*Pedir numeros hasta que se teclee un 0, mostrar la suma de todos los numero introducidos */

public class numeros {
    public static void main(String[] args) {
        int nums, suma=0;

        do {
            nums = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));

            suma += nums;
        } while (nums != 0);
        JOptionPane.showMessageDialog(null, "La suma de los numeros es: " + suma);
   }
}
