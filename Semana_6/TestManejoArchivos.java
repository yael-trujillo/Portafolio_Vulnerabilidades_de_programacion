package test;

//import static manejoarchivos.ManejoArchivos.crearArchivo;
import static manejoarchivos.ManejoArchivos.anexarArchivo;
import static manejoarchivos.ManejoArchivos.escribirArchivo;
import static manejoarchivos.ManejoArchivos.leerArchivo;

public class TestManejoArchivos {
    public static void main(String[] args) {
        var nombreArchivo = "prueba.txt";
        //crearArchivo(nombreArchivo);
        escribirArchivo(nombreArchivo, "Hola desde Java");
        anexarArchivo(nombreArchivo, "Otra vez");
        leerArchivo(nombreArchivo);
    }
}