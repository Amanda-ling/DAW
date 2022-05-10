import java.awt.event.*;
import java.util.EventListener;

import javax.swing.*;

public class botoncitos extends JFrame implements ActionListener {
	private JButton boton1, boton2, boton3;
	
	public botoncitos(){
		setLayout(null);
		setBounds(0,0,450,350);
		
		boton1 = new JButton("b1");
		boton1.setBounds(100,250,50,30);
		boton1.addActionListener(this);
		add(boton1);
		
		boton2 = new JButton("b2");
		boton2.setBounds(200,250,50,30);
		boton2.addActionListener(this);
		add(boton2);
		
		boton3 = new JButton("b3");
		boton3.setBounds(300,250,50,30);
		boton3.addActionListener(this);
		add(boton3);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public interface ActionListener extends EventListener {
		public void actionPerformed(ActionEvent e);
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==boton1) {
			setTitle("Has pulsado b1");
		}
		else if (e.getSource()==boton2) {
			setTitle("Has pulsado b2");
			
		}
		else if (e.getSource()==boton3) {
			setTitle("Has pulsado b3");
			
		}
	}
	public static void main(String[] args) {
	new botoncitos();
	}


}
