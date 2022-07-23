
public class concatenacion {

    public static void main(String args[]) {
        var usuario = "Juan";
        var titulo = "Ingeniero";
        var union = titulo + " " + usuario;
        System.out.println("Union --> " + union);
        
        var i = 2;
        var j = 8;
        System.out.println(i + j + usuario);//se realiza suma de numeros
        System.out.println(usuario + i + j);//contexto cadena
        //si el primer valor es string, lo siguiente valores se interpretan igual
        //no se realiza la suma

        //si quisieramos realizar la suma seria de la forma:
        System.out.println(usuario + (i + j));//primero se realiza la suma
        //Con los parentesis le damos prioridad y resuelve la operacion
        
        
        ///////////////////////////////////////////////////////////////////////
        //Uso de caracteres especiales
        
        var nombre = "Karla";
        System.out.println("Salto de linea: \n"+nombre);
        System.out.println("Tabulador: \t"+nombre);
        System.out.println("Retroceso: \b"+nombre);
        System.out.println("Comilla simple: \'"+nombre+"'");//en algunos casos
        //es necesario poner \ al final
        System.out.println("Comilla simple: \""+nombre+"\"");//es necesario el \ al final

    }
}
