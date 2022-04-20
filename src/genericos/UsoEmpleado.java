package genericos;

import java.util.*;
public class UsoEmpleado {

    public static void main(String[] args) {


      /*  Empleado[] listaEmpleados = new Empleado[3];
        listaEmpleados[0] = new Empleado("Ana", 45,2500);
        listaEmpleados[1] = new Empleado("Antonio", 55,2000);
        listaEmpleados[2] = new Empleado("Maria", 25,2600);*/

        ArrayList <Empleado> listaEmpleados = new ArrayList<Empleado>();

        //listaEmpleados.add(listaEmpleados[0]);

        //Con este codigo en principio podemos ir añadiendo los objetos que queramos no hace falta indica el indice

        listaEmpleados.add(new Empleado("Ana", 45,2500));

        listaEmpleados.add(new Empleado("Antonio", 55,2000));

        listaEmpleados.add(new Empleado("Maria", 25,2600));

        for (Empleado e: listaEmpleados){
            System.out.println(e.dameDatos());
        }
        System.out.println("   ");

        Empleado arrayEmpleados []  = new Empleado[listaEmpleados.size()];

        listaEmpleados.toArray(arrayEmpleados);

        for (Empleado e: arrayEmpleados){
            System.out.println(e.dameDatos());
        }

        listaEmpleados.set(2,new Empleado("Ornella", 34,10000));
        System.out.println(" ");
        //Bucle convencional

        for(int i=0; i<listaEmpleados.size(); i++){

            Empleado e=listaEmpleados.get(i);
            System.out.println(e.dameDatos());
        }

        System.out.println(" ");

        //Otra forma convencional de array "arrayEmpleados"
        for(int i=0; i<arrayEmpleados.length; i++){

            System.out.println(arrayEmpleados[i].dameDatos());
        }
    }
}
class Empleado{
    private String nombre;
    private int edad;
    private double salario;

    public Empleado(String nombre, int edad, double salario){
        this.nombre=nombre;
        this.edad=edad;
        this.salario=salario;
    }
    public String dameDatos() {
        return "El empleado se llama " + nombre + " tiene " + edad + " años " + " Y tiene un salario de " + salario;
    }

}
