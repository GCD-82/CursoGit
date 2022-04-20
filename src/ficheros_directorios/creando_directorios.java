package ficheros_directorios;
import java.io.*;

public class creando_directorios {

    public static void main(String[] args) {

        File ruta = new File("C:\\Users\\gcham\\Desktop\\Ejemplo curso Java\\prueba_texto.txt");

        //Esté metodo genera directorio o crea lo que falta en la ruta argumentada en el construtor
        //ruta.mkdir();

        String archivo_destino= ruta.getAbsolutePath();

        //Esté metodo genera fichero sino existe, tiene una exceptio tipo IO

        try {

            ruta.createNewFile();

        } catch (IOException e) {
            System.out.println("No pudo crear el archivo");
        }

        Escribiendo accede_es = new Escribiendo();
        accede_es.escribir(archivo_destino);
    }
}

class Escribiendo{
    public void escribir(String ruta_archivo){
        String frase="Esto es un ejemplo";
        try{
            //Creamos el flujo
            FileWriter escritura = new FileWriter(ruta_archivo);

            for(int i=0;i<frase.length();i++){
                escritura.write(frase.charAt(i));
            }

            escritura.close();

        }catch (IOException e){
            System.out.println("No pudo escribir en el archivo");

        }
    }
}
