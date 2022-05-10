
public class Ejemplo {
	private int edad;
	private String nombre;
	
	public Ejemplo(int edad, String nombre) throws Exception {
		this.nombre=nombre;
		
		if (edad<18){
			throw new Exception(nombre+" No tiene edad");
			
		}
			this.edad=edad;
	}
	
	public void imprimir(){
		System.out.println("Nombre:"+nombre);
		System.out.println("Edad:"+edad);
	}
	

	public static void main(String[] args) {
		try {
		Ejemplo e1 = new Ejemplo(24, "Mandy");
		e1.imprimir();
		Ejemplo e2 = new Ejemplo(12, "Paquito");
		e2.imprimir();
		}
		catch(Exception ex){
			System.out.println(ex.getMessage());
		}
		

		
		
		
	}
		
		

}
