package primer.paquete;

import java.io.IOException;

public class CrearExcepciones {

	public CrearExcepciones(String string) {
		// TODO Auto-generated constructor stub
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			metodo();
		}catch (ArithmeticException e) {
			System.out.println("NO Capturo la excepción");
		}catch (miExcepcion e) {
			System.out.println("Si que capturo la excepción");
			e.printStackTrace();
		}
				
	}//Fin del Main	
	
	static void metodo () throws miExcepcion {
		 
		throw  new miExcepcion ("Lanzo Excepcion");
	}
		
}//Fin de la clase principal




class miExcepcion extends Exception{
	
	public miExcepcion(String arg) {
		super(arg);
	}
	
}
	

