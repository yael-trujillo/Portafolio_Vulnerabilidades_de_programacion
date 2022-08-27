import javax.swing.JOptionPane;

/*Programa que simule un cajero automatico con un saldo inicial de $1000, con el
 * siguiente menu:
 * - Ingresar dinero a la cuenta
 * - Retirar dinero de la cuenta
 * - Salir
 */

public class cajero {
    public static void main(String[] args) {
        final int saldo_inical = 1000;
        int opcion;
        float ingreso, saldo_actual,retiro;

        opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a su cajero automatico\n"
        + "1. Ingresar dinero a la cuenta\n"
        + "2. Retirar dinero de la cuenta\n"
        + "3. Salir"));

        switch (opcion) {
            case 1: ingreso = Float.parseFloat(JOptionPane.showInputDialog("Digite la cantidad a ingresar"));
                saldo_actual = saldo_inical + ingreso;
                JOptionPane.showMessageDialog(null, "Dinero en cuenta: " + saldo_actual);
                break;
            case 2: retiro = Float.parseFloat(JOptionPane.showInputDialog("Cantidad a retirar: "));
                if (retiro > saldo_inical) {
                    JOptionPane.showMessageDialog(null, "Saldo insuficiente");
                } else {
                    saldo_actual = saldo_inical - retiro;
                    JOptionPane.showMessageDialog(null, "Dinero en cuenta: " + saldo_actual);
                }
                break;
            case 3: 
                break;                    
            default:
                JOptionPane.showMessageDialog(null,"Opcion invalida");
                break;
        }
    }
}
