package graficos;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class MarcoMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MenuFrame miframe = new MenuFrame();
		miframe.setVisible(true);
		miframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class MenuFrame extends JFrame{
	public MenuFrame() {
		
		setBounds(500,300,350,350);
		setVisible(true);
		
		MenuLamina milamina = new MenuLamina();
		add(milamina);
	
		
	}
}
class MenuLamina extends JPanel{
	public MenuLamina() {
		
		//setLayout(new BorderLayout());
		
		JMenuBar mibarra = new JMenuBar();
		
		JMenu archivo = new JMenu("Archivo");
		JMenu edicion = new JMenu("Edicion");
		JMenu herramientas = new JMenu("Herramientas");
		JMenu generales = new JMenu("generales");
		
		
		mibarra.add(archivo);
		mibarra.add(edicion);
		mibarra.add(herramientas);
		
		
		
		JMenuItem guardar = new JMenuItem("Guardar");
		JMenuItem guardar_como = new JMenuItem("Guardar como...");
		JMenuItem copiar = new JMenuItem("Copiar");
		JMenuItem cortar = new JMenuItem("Cortar");
		JMenuItem pegar = new JMenuItem("Pegar");
		
		JMenuItem opcion1 = new JMenuItem("Opcion 1");
		JMenuItem opcion2 = new JMenuItem("Opcion 2");
		JMenu opcionx = new JMenu("Opcion X");
		
		
		
		archivo.add(guardar);
		archivo.add(guardar_como);
		edicion.add(copiar);
		edicion.add(cortar);
		edicion.add(pegar);

		
		herramientas.add(generales);
		
		generales.add(opcion1);
		generales.add(opcion2);
		generales.addSeparator();
		generales.add(opcionx);
		
		add(mibarra);
		
		
	}
}