package graficos;
import java.awt.Frame;
import java.awt.event.*;

import javax.swing.*;

public class CambioEstado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoEstado mimarco = new MarcoEstado();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoEstado extends JFrame{ 
	
	
	public MarcoEstado() {
		
		setBounds(300,300,500,350);
		setVisible(true); 
		
		CambiaEstado nuevoEstado = new CambiaEstado();
		addWindowStateListener(nuevoEstado);
		
		
	}
	
}
class CambiaEstado implements WindowStateListener{

	public void windowStateChanged(WindowEvent e) {		//e: INSNTACIA DE LA CLASE
		
		System.out.println("LA VENTANA HA CAMBIADO DE ESTADO");
		
		//System.out.println(e.getNewState());
		
		if(e.getNewState() == Frame.MAXIMIZED_BOTH) {	//FRAME VENTANTA COMPLETA
			System.out.println("PANTALLA A VENTANA COMPLETA");
			
		}else if(e.getNewState() == Frame.NORMAL) {		//VENTANA A TAMAÑO NORMAL
			System.out.println("PANTALLA ES NOMRAL");
		
		}else if(e.getNewState() == Frame.ICONIFIED) { 
			System.out.println("PANTALLA MINIMIZADA");
		}
		}
	
	} 
