package graficos;

import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoPrueba mimarco = new MarcoPrueba();
		mimarco.setVisible(true);
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	}

class MarcoPrueba extends JFrame{
	
	public MarcoPrueba() {
		
		setBounds(500,300,500,350);
		
		LaminaPrueba milamina = new LaminaPrueba();
		add(milamina);
		milamina.setVisible(true);
	}
}

class LaminaPrueba extends JPanel{
	
	public LaminaPrueba() {
		
		EscuchaTexto escucha = new EscuchaTexto();
		JTextField micampo= new JTextField(20);
		Document midoc = micampo.getDocument();		//TRAEME EL DOCUMENTO QUE ESTA EN MICAMPO (JTEXTFIELD) Y ALMACENALO EN LA VARIABLE
		midoc.addDocumentListener(escucha);
		add(micampo);
		
	}
	private class EscuchaTexto implements DocumentListener{

		@Override
		public void insertUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Haz insertado texto");
			
		}

		@Override
		public void removeUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Haz borrado texto");
		}

		@Override
		public void changedUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	//private JTextField micampo;
}

