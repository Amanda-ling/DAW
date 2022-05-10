package excepcion8;

public class calcula {
	private String nombre;
	private double saldo;
	
public calcula(String nombre, int saldo) {
		this.nombre=nombre;
		this.saldo=saldo;
		
	}
public void depositar(int depo) {
	this.saldo=saldo+depo;
		
	}

public void extraer(int depo) throws Exception{

if (saldo<depo){
	throw new Exception("La cuenta queda en negativo, no se puede retirar");
}
this.saldo=saldo-depo;
	
}

public void imprimir() {
System.out.println(nombre+ " tiene "+ saldo);
	
}


	public static void main(String[] args) {
		
		calcula c1 = new calcula("Juan", 2000);
		c1.depositar(50);
		
		try {
		
		c1.extraer(5000);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		finally {
			c1.imprimir();
		}
	}

}
