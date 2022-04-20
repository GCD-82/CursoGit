package ejemplo.primer.paquete;

import java.io.IOException;

//import java.io.IOException;

public class PrimeraClase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Primerar clase");
		
		//DividirPorCero.dividir();
		
		try {
			primer.paquete.DividirPorCero.dividir();
			
			}catch(ArithmeticException e){
			e.fillInStackTrace();
			System.out.println("Capturada la excepcion NullPointerException");
			
		}catch(IOException e){
			e.fillInStackTrace();
			System.out.println("Capturada la excepcion Exception");
			
		}
		
		System.out.println("Fuera del try-catch 2");

	}

}
