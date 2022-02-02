package graficos;
import java.awt.Frame;

import javax.swing.*;

public class CreandoMarcos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		miMarco marco1 = new miMarco();									
		marco1.setVisible(true);										//hacer el objeto visible con el .setVisible
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			//cuando se cierre la ventana, el programa tiene que acabar 		
																		//pide un numero entero el setdefault(https://docs.oracle.com/javase/7/docs/api/)

	}

}

class miMarco extends JFrame {											//clase llamada miMarco, heredada de JFRAME		//JFRAME me da la posibilidad de usar todos los metodos de JFRAME
	
	public miMarco() {		//constructor
		
		//setSize(500,300);												//es un metodo de la clase JFRAME para crear un tamaño 
		
		//setLocation(500, 300);										//establecer donde va a aparecer el marco
		
		setBounds(500,300,550,250);										//hace el trabajo del setsize y setlocation
		
		//setResizable(false);											//permitir si se puede extender o no el cuadro
		
		//setExtendedState(Frame.MAXIMIZED_BOTH);						//inica el cuadro en pantalla completa	//se usa el nombre de la clase FRAME. porque es static
		
		setTitle("MI VENTANA");											//titulo a la ventana 
	}
	
	
	
}

