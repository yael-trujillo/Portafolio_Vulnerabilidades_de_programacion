public class switch_numeros {
    public static void main(String[] args) {
        var numero = 3;
        var numeroTexto = "Valor desconocido";

        switch (numero) {
            case 1:
                numeroTexto = "Numero uno";
                break;
            case 2:
                numeroTexto = "Numero dos";
                break;
            case 3:
                numeroTexto = "Numero tres";
                break;
            case 4:
                numeroTexto = "Numero cuatro";
                break;
            //default:
            // 
            //   break;
        }

        System.out.println(numeroTexto);
    }
}