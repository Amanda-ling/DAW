package pilacorchetes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;


public class formula extends JFrame implements ActionListener {
	private JButton botonvalidar;
	private static JTextField form;
	private JLabel enun, resultado;
	private static String str;
	public formula() {
		setLayout(null);
		
		enun = new JLabel("Inserte formula: ");
		enun.setBounds(10,2,100,30);
		add(enun);
		
		form = new JTextField();
		form.setBounds(160,10,100,30);
		add(form);
		
		botonvalidar = new JButton("Validar formula");
		botonvalidar.setEnabled(true);
		botonvalidar.setBounds(160,90,180,50);
		//botonvalidar.addActionListener(this);
		add(botonvalidar);
		
		
		resultado = new JLabel("Resultado: ");
		resultado.setBounds(10,90,100,30);
		add(resultado);
		str = form.getText();
		setVisible(true);
	}
	
	public void caracteres(String str) {
		
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==botonvalidar) {
		Stack<String> pila1 = new Stack <String>();
		while (str){
			pila1.push(str);
			if (str==")"||str=="]"||str=="}"){
					pila1.peek();
				if (str=="("||str=="["||str=="{") {
					pila1.pop();
					pila1.pop();}
				}		
			}
		resultado.setText("Resultado: es validado");
		}
		}
		
	public static void main(String[] args) {
		formula operacion = new formula();

	}

}
