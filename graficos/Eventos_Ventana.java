package graficos;
import javax.swing.*;
import java.awt.Event;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowStateListener;
public class Eventos_Ventana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoVentana mimarco = new MarcoVentana();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			//CIERRA EL PROGRAMA POR COMPLETO
		
		MarcoVentana mimarco2 = new MarcoVentana();
		mimarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);		//SOLO CIERRA EL FRAME
		
		mimarco.setTitle("VENTANA 1");
		mimarco.setBounds(300,300,500,350);
		
		mimarco2.setTitle("VENTANA 2");
		mimarco2.setBounds(900,300,500,350);
		
		

	}

}

class MarcoVentana extends JFrame{
	
	public MarcoVentana() {
		

		setVisible(true);	
		/*
		M_Ventana oytente_ventana = new M_Ventana();
		addWindowListener(oytente_ventana);			//!!!!
		*/
		
		addWindowListener(new M_Ventana()); 		//!!!!		//ADDWINDOWLISTENER(NEW NOMBRE_CLASE)
	}
		
	
}

class M_Ventana extends WindowAdapter{		//OBLIGACION DE ESCRIBIR TODOS SOLO SI IMPLEMENTS, PERO SE PUEDE HEREDAR PARA AHORRAR CODIGO 

	
	public void windowOpened(WindowEvent e) {	
		System.out.println("VENTANA ABIERTA");
	}

	
	public void windowClosing(WindowEvent e) {	
		System.out.println("VENTANA CERRANDO");
	}

	
	
	/*public void windowClosed(WindowEvent e) {
		System.out.println("LA VENTANA A SIDO CERRADA");
	}
	*/
	
	public void windowIconified(WindowEvent e) {
		System.out.println("VENTANA MINIMAZADA");
	}

	
	public void windowDeiconified(WindowEvent e) {	
		System.out.println("VENTANA RESTAURADA");
	}

	
	/*public void windowActivated(WindowEvent e) {	
		System.out.println("VENTANA ACTIVADA");
	}
	*/
	
	public void windowDeactivated(WindowEvent e) {
		System.out.println("VENTANA DESACTIVADA");
	}
	
}