package paquete.stream;
import java.io.*;


public class Acceso_Fichero {

    public static void main(String[] args) {

        Leer_fichero accediendo = new Leer_fichero();

        accediendo.lee();

    }
}

class Leer_fichero {

    public void  lee (){
    {
        try {
            //Fichero vrado en mi escritorio
            FileReader entrada = new  FileReader ("C:\\Users\\gcham\\Desktop\\ejemplo.txt");

           // BufferedReader mibuffer = new BufferedReader (entrada);

            int c = entrada.read();//Cada vez que llama a este metodo lee y pasa al siguiente.

            while (c!=-1){
                c = entrada.read();
                char letra = (char) c;
                System.out.print(letra);

            }
            entrada.close();

        } catch (FileNotFoundException e) {
            //e.printStackTrace();
            System.out.println("No encontré el fichero");
        } catch (IOException ex) {
            System.out.println("Error al leer");
        }/*finally{ //Tendrías que declarar fuera el FileReader entrada, ademas tine try-catch
            entrada.close();
        }*/
    }

    }


}