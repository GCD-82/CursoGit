package paquete.stream;

import java.io.FileWriter;
import java.io.IOException;

public class Escribir_Fichero {
    public static void main(String[] args) {
        Escribiendo prueba = new Escribiendo();
        prueba.escribir();

    }
}

class Escribiendo{
    public void escribir () {
        String frase = "Prueba de escritura";

        try {
            FileWriter escritura = new FileWriter("C:\\Users\\gcham\\Desktop\\nuevo.txt");
            for(int i=0; i<frase.length();i++){
                escritura.write(frase.charAt(i));
            }
            escritura.close();//Dentro del try
        } catch (IOException e) {

            System.out.println("No se ha podido escribir el archivo");
            e.printStackTrace();
        }
    }
}

