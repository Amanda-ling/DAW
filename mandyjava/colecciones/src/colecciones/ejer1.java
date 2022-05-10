package colecciones;

import java.util.Stack;

public class ejer1 {
	public static void main(String[] args) {
		Stack<String> pila1 = new Stack <String>();
		System.out.println("Insertamos tres elementos");
		pila1.push("juan");
		pila1.push("ana");
		pila1.push("luis");
		System.out.println("Cantidad de elementos en pila "+ pila1.size());
		System.out.println("Extraemos un elemento de la pila" + pila1.pop());
		System.out.println("Cantidad de elementos en pila "+ pila1.size());
		System.out.println("Consultamos el primer elemento de la pila sin extraerlo " + pila1.peek());
		System.out.println("Cantidad de elementos en pila "+ pila1.size());
		System.out.println("Extraemos uno a uno cada elemento de la pila mientras no este vac�a");
		while (!pila1.isEmpty())
			System.out.println(pila1.pop()+"-");
			System.out.println();
			
			Stack<Integer> pila2 = new Stack <Integer>();
			pila2.push(70);
			pila2.push(120);
			pila2.push(6);
			System.out.println("Borramos toda la pila");
			pila2.clear();
			System.out.println("Cantidad de elementos en la pila de enteros: " + pila2.size());
	}
}
