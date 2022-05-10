package ventanacolores;
import javax.swing.*;
import java.awt.event.*;
import java.util.EventListener;
public class colores  extends JFrame implements ActionListener{
	private JLabel label1, label2, label3;
	private JButton boton1;
	public colores() {
		
		setLayout(null);
		setTitle("Colores");
	    setBounds(0,0,450,350);
	    
//	    label1= new JLabel ("rojo");
//		label1.setBounds(10,20,300,30);
//		add(label1);
//		
//		label2=new JLabel("verde");
//		label2.setBounds(10,40,100,30);
//		add(label2);
//		
//		label3=new JLabel("azul");
//		label3.setBounds(10,60,200,30);
//		add(label3);
		setVisible(true);
		
	    boton1 = new JButton("Finalizar");
	    boton1.setBounds(100,250,100,30);
	    add(boton1);
	    boton1.addActionListener(this);
	    
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public interface ActionListener extends EventListener {
		public void ActionPerformed(ActionEvent e);
	}
	public static void main(String[] args) {
	new colores();
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==boton1){
		System.exit(0);}
	}
}