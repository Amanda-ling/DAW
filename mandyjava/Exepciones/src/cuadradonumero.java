import java.util.Scanner;
import java.util.InputMismatchException;

public class cuadradonumero {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, num2;
		float resul;
		boolean prueba=false;
		
		do {
		try {
		prueba=false;
		System.out.println("Introduce un numero entero");
		num= sc.nextInt();
		System.out.println("Introduce un numero entero");
		num2= sc.nextInt();
		resul=(float)num/(float)num2;
		System.out.println(resul);
		}
		
		catch(InputMismatchException exc){
			prueba=true;
			System.out.println("Debe introducir un numero entero");
			sc.next();
			
		}
		catch(ArithmeticException exc){
			prueba=true;
			System.out.println("No se puede dividir entre cero");
			sc.next();
			
		}
		}while(prueba);
	
}

}
