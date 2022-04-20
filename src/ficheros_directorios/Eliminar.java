package ficheros_directorios;

import java.io.File;

public class Eliminar {
    public static void main(String[] args) {
        File ruta = new File("C:\\Users\\gcham\\Desktop\\Ejemplo curso Java\\prueba_texto.txt");

        ruta.delete();
    }
}
