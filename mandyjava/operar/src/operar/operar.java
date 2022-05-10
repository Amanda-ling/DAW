package operar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class operar extends JFrame implements ChangeListener, ActionListener {
	
	private JTextField num1, num2;
	private JRadioButton suma, resta;
	private JLabel resultado;
	private JButton operar;
	private ButtonGroup bg;
	private int rdo;
	private int numero1, numero2;
	

	public operar() {
		setLayout(null);
		bg = new ButtonGroup();
		
		suma = new JRadioButton("Suma");
		suma.setBounds(10,10,100,30);
		suma.addChangeListener(this);
		add(suma);
		bg.add(suma);
		
		resta = new JRadioButton("Resta");
		resta.setBounds(10,40,100,30);
		resta.addChangeListener(this);
		add(resta);
		bg.add(resta);
		
		num1 = new JTextField();
		num1.setBounds(160,10,100,30);
		add(num1);
		
		num2 = new JTextField();
		num2.setBounds(160,40,100,30);
		add(num2);
		

		operar = new JButton("operar");
		operar.setEnabled(false);
		operar.setBounds(160,90,100,30);
		operar.addActionListener(this);
		add(operar);
		
		resultado = new JLabel("Resultado: ");
		resultado.setBounds(10,90,100,30);
		add(resultado);
		
		
	}
	
	public void stateChanged (ChangeEvent e){
		numero1=Integer.parseInt(num1.getText());
		numero2=Integer.parseInt(num2.getText());
		if(suma.isSelected()==true ) {
			rdo=numero1+numero2;
			operar.setEnabled(true);
		}
		if(resta.isSelected()==true) {
			rdo=numero1-numero2;
			operar.setEnabled(true);

		}
	}
	

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==operar) {
		resultado.setText("Resultado: "+rdo);
		}
		}
		
	
	public static void main(String[] args) {
		operar operacion = new operar();
		operacion.setVisible(true);
		operacion.setBounds(10,10,200,300);
		

	}

}
