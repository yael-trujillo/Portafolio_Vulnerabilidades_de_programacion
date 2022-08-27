import javax.swing.JOptionPane;
/*Hacer un prgrama que lea un caracter y compruebe si es mayuscula */
public class caracter {
    public static void main(String[] args) {
        char letra;

        letra = JOptionPane.showInputDialog("Digite una letra: ").charAt(0);

        if(Character.isUpperCase(letra)){
            JOptionPane.showMessageDialog(null, "Es una letra mayuscula");
        } else {
            JOptionPane.showMessageDialog(null, "Es una letra minuscula");
        }
    }
}
