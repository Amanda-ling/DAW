package excepciones2;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.ArrayIndexOutOfBoundsException;

public class principal{
	private static int[] vector = {10, 11, 12 ,13 ,14 ,15 ,16 ,17 ,18 ,19 };
	private static Scanner sc = new Scanner(System.in);
	private static int indice;
	
	
	public static void main(String[] args) {
		boolean prueba=false;
		
		do {
			prueba=false;
		try {
			System.out.println("Introduzca un indice del 1 al 10");
			indice = sc.nextInt()+1;
			System.out.println(vector[indice]);
			
			
		}	
		catch(ArrayIndexOutOfBoundsException e){
			prueba=true;
			System.out.println("Numero fuera de rango");
			sc.next();			
		}
		catch(InputMismatchException e){
			prueba=true;
			System.out.println("Introduce un entero");
			sc.next();
			
		}
		catch(NumberFormatException e){
			prueba=true;
			System.out.println("Introduce un entero");
			sc.next();
			
		}
		
		}while(prueba);
				

	}

}
