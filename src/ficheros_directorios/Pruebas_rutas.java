package ficheros_directorios;

import java.io.*;

public class Pruebas_rutas {

    public static void main(String[] args) {

        //Guarda la ruta del proyecto donde guardo estos programas paquetes clases etc
        File archivo = new File ("ejemplo_archivo");
        // C:\Users\gcham\Documents\MiFormacionJava\ejemplo_archivo
        System.out.println(archivo.getAbsolutePath());

        //Indica si existe el archivo, que en principio no existe
        System.out.println(archivo.exists());

    }
}
