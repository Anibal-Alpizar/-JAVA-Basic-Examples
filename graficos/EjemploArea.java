package graficos;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class EjemploArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoArea mimarco = new MarcoArea();
		mimarco.setVisible(true);
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class MarcoArea extends JFrame{
	public MarcoArea() {
		setBounds(500,300,500,350);
		LaminaArea milamina = new LaminaArea();
		milamina.setVisible(true);
		add(milamina);
	}
}
class LaminaArea extends JPanel{
	public LaminaArea() {
		
		//setLayout(new BorderLayout());
		miarea = new JTextArea(8,20);
		
		JScrollPane laminaBarras = new JScrollPane(miarea);		//LAMINA DE DESPLAZAMIENTO CON EL OBJETO QUE QUIERO QUE TENGA ADENTRO
		
		
		add(laminaBarras);
		//miarea.setLineWrap(true);		//SALTOS DE LINEA SI
		
		
		
		JButton miboton = new JButton("---PRESIONA---");
		add(miboton);
		
		Comprobar accion = new Comprobar();
		miboton.addActionListener(accion);
	}
	private class Comprobar implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println(miarea.getText());
		}
		
	}
	JTextArea miarea;
}

