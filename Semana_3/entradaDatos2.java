//con esta libreria podemos generar un panel gui para el usuario

import javax.swing.JOptionPane;

public class entradaDatos2 {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Introduce tu nombre: ");

        System.out.println("Tu nombre es " + nombre);
    }
}
