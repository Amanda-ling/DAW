import javax.swing.event.ChangeListener;
import javax.swing.*;

public class BotonDesactivado extends JFrame implements ChangeListener{
	private JLabel texto;
	private JCheckBox Politica_priv;
	private JButton aceptar;
	
	public BotonDesactivado() {
		setLayout(null);
		texto=new JLabel("Política de privacidad");
		add(texto);
		
		Politica_priv= new JCheckBox("PP");
		Politica_priv.setBounds(10,50,50,25);
		
	}
	
	
	public static void main(String[] args) {
		

	}

}
