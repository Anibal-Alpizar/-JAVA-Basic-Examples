package graficos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Varios_oyentes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Marco_Principal mimarco = new Marco_Principal();
		mimarco.setVisible(true);
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class Marco_Principal extends JFrame{

	public Marco_Principal() {
		
		setTitle("Prueba Varios");
		setBounds(1300,100,300,200);
		Lamina_Principal lamina = new Lamina_Principal();
		add(lamina);
	}
	
}
class Lamina_Principal extends JPanel{
	
	public Lamina_Principal() {
		
		JButton boton_nuevo = new JButton("Nuevo");
		boton_cerrar  = new JButton ("Cerrar todo");
		
		add(boton_nuevo);
		add(boton_cerrar);
		
		//ANADIR LA ACCION AL BOTON
		OyenteNuevo mioyente = new OyenteNuevo();
		boton_nuevo.addActionListener(mioyente);
		
		
	}
	private class OyenteNuevo implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			Marco_Emergente marco = new Marco_Emergente(boton_cerrar);
			marco.setVisible(true);
			
		}
		
	}

	JButton boton_cerrar;		//FUERA DEL CONSTRUCOR PORQUE SE VA A UTILIZAR MAS ADELANTE 	
}

class Marco_Emergente extends JFrame{		//CLASE SOLO HACE UN MARCO
	
	public Marco_Emergente(JButton boton_de_principal){
		
		contador++;
		setTitle("Ventana" + contador);
		setBounds(40*contador, 40*contador, 300, 150);
		
		CierraTodos oyenteCerrar = new CierraTodos();
		boton_de_principal.addActionListener(oyenteCerrar);
	}
	
private class CierraTodos implements ActionListener{	//DEBE SER UNA CLASE INTENRA DE MARCO_EMERGENTE PORQUE SON LAS VENTANAS DE MARCO_EMERGENTE QUE DEBEN CERRAR

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		dispose();		//CERRAR TODO
	}
	
	
	
	
}
	private static int contador = 0; 	//VARIABLE STATIC PARA QUE SE COMPARTA E INCREMENTE
}

