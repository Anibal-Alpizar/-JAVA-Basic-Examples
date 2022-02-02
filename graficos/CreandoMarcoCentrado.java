package graficos;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.*;

public class CreandoMarcoCentrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoCentrado miMarco = new MarcoCentrado();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco.setVisible(true);
		

	}

}

class MarcoCentrado extends JFrame{
	
	public MarcoCentrado() {
		
		Toolkit mipantalla = Toolkit.getDefaultToolkit();
		
		Dimension tamannoPantalla = mipantalla.getScreenSize();	//meter las dimensiones de la pantalla en tamannoPantalla
		
		int alturaPantalla = tamannoPantalla.height;			//extraer de tamannoPantalla el heigth y almacenarlo en alturaPantalla
		int anchoPantalla = tamannoPantalla.width;
		
		setSize(anchoPantalla/2, alturaPantalla/2);				////es un metodo de la clase JFRAME para crear un tamaño
		
		setLocation(anchoPantalla/4, alturaPantalla/4);
		
		setTitle("Marco Centrado");
		
		Image miIcono = mipantalla.getImage("src/graficos/je.jpg");
		
		setIconImage(miIcono);
	}
	
	
	
}