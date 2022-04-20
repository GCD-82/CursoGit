package primer.paquete;

//import java.io.IOException;

public class MenorDeEdad {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub //throws IOException
	
		
		try {
			System.out.println("Comprobando la edad:...");
			
				throw new NullPointerException ("Excepcion");
				
			
		}catch (ArithmeticException e) {
			
			System.out.println("Captura");
			
		}

	}

}
