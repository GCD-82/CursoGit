package primer.paquete;

import java.io.IOException;

public class DividirPorCero  {
	
	public static void dividir() throws IOException {
		try {
			System.out.println("3/0");
			System.out.println(3/0);
			
		}catch(Exception e){
			//e.fillInStackTrace();
			System.out.println("Capturada la excepcion");
			
		}
		
		System.out.println("Fuera del try-catch");
	}

}
