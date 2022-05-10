
public class Termometro  {
	private int temperatura;
	
	public Termometro(int temperatura) {
		this.temperatura=temperatura;
	}

	public void Ejecutar() throws TemperaturaFueraDeRango{
		
		if (temperatura<(-192) || (temperatura>100)) {
			throw new TemperaturaFueraDeRango ("El chocobo se sale de rango");
		}
		else {
			System.out.println("El chocobo es "+this.temperatura);
		}
		
	}
	
	public static void main(String[] args) throws TemperaturaFueraDeRango{
		
		try {
		Termometro t1 = new Termometro(800);
		t1.Ejecutar();
		}
		catch(TemperaturaFueraDeRango ex){
			System.out.println(ex.getMessage());
			
		}

	}

}


