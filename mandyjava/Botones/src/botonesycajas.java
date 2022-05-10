import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;

import javax.swing.*;

public class botonesycajas extends JFrame implements ActionListener {
	private JButton boton1;
	private JLabel label1, label2;
	private JTextField textfield1;
	private JPasswordField passw1;
	public botonesycajas() {		
		setLayout(null);
		setBounds(0,0,450,350);
		
		label1=new JLabel("Usuario:");
		label1.setBounds(10,10,100,30);
		add(label1);
		label1=new JLabel("Contraseña:");
		label1.setBounds(10,50,100,30);
		add(label1);
		
		passw1=new JPasswordField();
		passw1.setBounds(120,50,150,20);
		add(passw1);
		
		textfield1 = new JTextField();
		textfield1.setBounds(120,10,150,20);
		add(textfield1);
		
		boton1= new JButton("aceptar");
		boton1.setBounds(300,20,100,20);
		boton1.addActionListener(this);
		add(boton1);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}


	public static void main(String[] args) {
		new botonesycajas();
	}
	
	public interface ActionListener extends EventListener {
		public void actionPerformed(ActionEvent e);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==boton1) {
			setTitle("Hola "+textfield1.getText());
			
			
		}
		
	}

}
