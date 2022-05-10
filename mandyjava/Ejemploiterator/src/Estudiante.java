import java.util.ArrayList;
import java.util.Iterator;

public class Estudiante {
	private  int numficha;
	private  String nombre;
	private  int edad;
	public Estudiante(int num, String nom, int ed){
		numficha=num;
		nombre=nom;
		edad=ed;
	}
	
	public static void main(String[] args) {
			Estudiante est1= new Estudiante(101,"Pablo",23);
			Estudiante est2= new Estudiante(102,"Ana",21);
			Estudiante est3= new Estudiante(103,"Pedro",25);
			ArrayList<Estudiante> a1 = new ArrayList<Estudiante>();
			a1.add(est1);
			a1.add(est2);
			a1.add(est3);
			
			Iterator itr=a1.iterator();
			while (itr.hasNext()) {
				Estudiante estu=(Estudiante)itr.next();
				System.out.println(estu.numficha + " "+ estu.nombre + " " +estu.edad);
			}
			
//			ESTO DA ERROR PORQUE NO PODEMOS RECORRER Y MODIFICAR A LA VEZ, HABRIA QUE USAR ITERATOR
//			for (String nombre: a1) {
//				if (nombre.equals("Pedro")) {
//				a1.remove("Pedro");}
//			}
	}

}
