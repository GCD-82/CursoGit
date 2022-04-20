package ficheros_directorios;
import java.io.*;

public class Acceso_Ficheros {

    public static void main(String[] args) {
        File ruta = new File("C:\\Users\\gcham\\Desktop\\Ejemplo curso Java");
        System.out.println(ruta.getAbsolutePath());
        //El metodo list devuelve un tipo array de strings
        String [] nombres_archivos=ruta.list();

        for(int i=0; i< nombres_archivos.length;i++){
            System.out.println(nombres_archivos[i]);
            //Generamos otro Objeto file, intorducciendo dos argumentos en su construtor ruta padre y ruta hijo
            File f=new File(ruta.getAbsolutePath(),nombres_archivos[i]);

            if(f.isDirectory()){
                //hacemos lo mismo con una subcarpeta
                String [] archivos_subcarpetas=f.list();
                for(int j=0; j< archivos_subcarpetas.length;j++) {
                    System.out.println(archivos_subcarpetas[j]);
                }
            }
        }
    }
}
