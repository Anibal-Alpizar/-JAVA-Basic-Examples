package graficos;

import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FocoVentana {
	public static void main(String[] args) {

		MarcoFoco mimarco = new MarcoFoco();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoFoco extends JFrame {

	public MarcoFoco() {

		setVisible(true);
		setBounds(300, 300, 600, 450);
		// LaminaFoco mipanel = new LaminaFoco();
		// add(mipanel);
		add(new LaminaFoco());

	}
}

class LaminaFoco extends JPanel {
	public void paintComponent(Graphics g) {

		super.paintComponent(g);

		setLayout(null); // JAVA HACE UNA COLECAION POR DEFECTO, CON ESTE METODO LO DESACTIVAMOS

		cuadro1 = new JTextField(); // INSTANCIAR LA VARIABLE //CONSTRUCOR POR DEFECTO
		cuadro2 = new JTextField();

		cuadro1.setBounds(120, 10, 150, 20);
		cuadro2.setBounds(120, 50, 150, 20);

		add(cuadro1); // AGREGARLOS A LA LAMINA
		add(cuadro2);
		LanzaFocos elfoco = new LanzaFocos();		//INSTANCIA DE LA CLASE OYENTE
		cuadro1.addFocusListener(elfoco);			//YA TENEMOS EL CUADRO1 A LA ESCUCHA
	}

	private class LanzaFocos implements FocusListener { // NECESITO ACCEDER A CUADRO1 - CUADRO2 PERO ESTAN EN OTRA CLASE
														// USAR CLASES INTERNAS, AGEGANDOLA A LAMINAFOCO Y ENCAPSULARLA
		@Override										// AHORA SI PUEDO ACCEDER A CUADRO1 - CUADRO2 POQUE PERTENECE A LA CLASE PADRE (LAMINAFOCO)
		public void focusGained(FocusEvent e) {
				
		}

		@Override
		public void focusLost(FocusEvent e) {
			
			String email = cuadro1.getText();
			
			boolean comprobacion = false;
			
			for(int i = 0; i<email.length(); i++ ) {	//LETRA A LETRA
				
				if (email.charAt(i) == '@') {			//EVALUAR DE POSICION EN POSICION HASTA LLEGAR AL @
					
					comprobacion = true;
				}
				
			}
			if (comprobacion) {
				System.out.println("Correcto");
			}else {
				System.out.println("Incorrecto");
			}
		}
	}

	JTextField cuadro1; // VARIABLE DE TIMPO JTEXTFIELD
	JTextField cuadro2; // LAS VARIBLES ESTAN FUERA DEL } PORQUE MAS ADELANTE SE REQUIEREN USAR, SI SE
						// PONEN DETRO SOLO EN ESE HAMBITO LOCAL
}
