package pruebaarraylist;

import java.util.ArrayList;

public class prueba {
	public static void imprimir(ArrayList<String> lista){
		for(String elemento : lista)
			System.out.println(elemento + "-");
			System.out.println();
	}

	public static void main(String[] args) {
		ArrayList<String> lista1 = new ArrayList<String>();
		
		lista1.add("Juan");
		lista1.add("Luis");
		lista1.add("Carlos");
		imprimir(lista1);
		lista1.add(1,"ana");
		imprimir(lista1);
		lista1.remove(0);
		imprimir(lista1);
		lista1.remove("Carlos");
		imprimir(lista1);
		System.out.println("Cantidad de elementos en la lista:" + lista1.size());
		
		if (lista1.contains("ana")) {
			System.out.println("El nombre 'ana' si esta almacenado en la lista");}
		else {
				System.out.println("El nombre 'ana' no esta almacenado en la lista");}
	System.out.println("El segundo elemento de la lista es: " + lista1.get(1));
	lista1.clear();
	if (lista1.isEmpty())
	System.out.println("La lista se encuentra vacia");
		
	}

}