package paquete.stream;

import java.io.*;

public class Acceso_Fichero_Buffered {

    public static void main(String[] args) {

        Leer_fichero2 accediendo = new Leer_fichero2();

        accediendo.lee();

    }
}

class Leer_fichero2 {

    public void  lee (){
    {
        try {
            //Fichero vrado en mi escritorio
            FileReader entrada = new  FileReader ("C:\\Users\\gcham\\Desktop\\ejemplo.txt");

            BufferedReader mibuffer = new BufferedReader(entrada);

            String linea = "";

            while (linea!=null){
                linea=mibuffer.readLine();

                if (linea!=null)//Para que no imprima null
                System.out.println(linea);
            }
            entrada.close();

        } catch (FileNotFoundException e) {
            //e.printStackTrace();
            System.out.println("No encontré el fichero");
        } catch (IOException ex) {
            System.out.println("Error al leer el buffer");
        }/*finally{ //Tendrías que declarar fuera el FileReader entrada, ademas tine try-catch
            entrada.close();
        }*/
    }

    }


}