package com.pair.view;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class FlowerSheet extends JPanel {
	
	private JPanel mySheet2;
	private JButton screen;
	//private boolean principio;
	//private double resultado;
	//private String ultimaOperacion;
	
	public FlowerSheet () {
	
		//principio = true;
		setLayout(new BorderLayout ());
		screen = new JButton("");
		screen.setEnabled(false);
		//setBounds(500,300,750,200);
		add(screen,BorderLayout.NORTH); 
		mySheet2 = new JPanel();
		//mySheet2.setLayout(new GridLayout(4,4));
		
		ActionListener insertar = new InsertaNumero ();
		//ActionListener orden = new AccionOrden();
		
		ponerBoton("Crear Floristeria", insertar);
		ponerBoton("Afegir Arbre", insertar);
		ponerBoton("Afegir Flor", insertar);
		//ponerBoton("/", orden);
		ponerBoton("Afegir Decoració", insertar);
		ponerBoton("Stock", insertar);
		//ponerBoton("*", orden);
						
		add(mySheet2, BorderLayout.SOUTH);
		
		//ultimaOperacion = "=";
	}
 
	private void ponerBoton(String tittle, ActionListener listener) {
		
		JButton button = new JButton (tittle);
		button.addActionListener(listener);
		mySheet2.add(button);
	}	
	
	private class InsertaNumero implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			String entrada = e.getActionCommand();	
			screen.setText(entrada);			
		//		screen.setText(screen.getText() + entrada);			
		}	
	}
}