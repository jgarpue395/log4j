package ejemplo;

import org.apache.log4j.Logger;
import java.util.Scanner;

public class Main 
{
	private static final Logger log = Logger.getLogger(Main.class);
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		try
		{
			System.out.println("Introduce un dividendo");
			int dividendo = sc.nextInt();
			System.out.println("Introduce un divisor");
			int divisor = sc.nextInt();
			
			if (divisor == 0)
			{
				throw new ArithmeticException("No se puede dividir entre 0");
			}
			
			int cociente = dividendo/divisor;
			
			log.info("El resultado de dividir " + dividendo + "/"+ divisor + " es " + cociente);
		}
		catch (ArithmeticException ae)
		{
			log.error(ae.getMessage());
		}
		finally 
		{
			sc.close();
		}
	}
}
