package leyendo_escribiendo_bytes;

import javax.imageio.stream.FileImageInputStream;
import java.io.*;

public class Lectura_Escritura {
    public static void main(String[] args) {

        int cont=0;

        int datos_entrada [] = new int [312492];

        try{

            FileInputStream archivo_lectura = new FileInputStream ("C:\\Users\\gcham\\Desktop\\Ejemplo curso Java\\Clases Streams.jpg");
            boolean final_ar = false;

            while(!final_ar){

                //El método read devuelve entero
                int byte_entrada = archivo_lectura.read();

                if (byte_entrada !=-1)
                    datos_entrada[cont]= byte_entrada;

                else//if (byte_entrada ==-1)//Al finalizar la lectura devuelve -1 y sale del while
                    final_ar=true;

                //System.out.println(byte_entrada);
                cont ++;

            }

            archivo_lectura.close();

    }catch (IOException e){

            System.out.println("Salto la excepción no puedo leer");
        }

        System.out.println(cont);
        //Llamamos al metodo estatico dentro de la clase
        crea_fichero(datos_entrada);
    }

    //Nuevo metodo de la clase
    static void crea_fichero(int datos_fiche []){
        try{

            FileOutputStream fichero_nuevo = new FileOutputStream ("C:\\Users\\gcham\\Desktop\\Ejemplo curso Java\\Ejemplo_creado.jpg");
            for(int i=0; i<datos_fiche.length;i++){
                fichero_nuevo.write(datos_fiche [i]);
            }
            fichero_nuevo.close();

    }catch (IOException e){

            System.out.println("Salto la excepción no puedo crear fichero");
        }
    }
}
