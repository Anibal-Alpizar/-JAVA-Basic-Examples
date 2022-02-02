package graficos;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextPane;

public class Procesador2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MenuProcesador mimarco = new MenuProcesador();
		mimarco.setVisible(true);

	}

}

class MenuProcesador extends JFrame {
	public MenuProcesador() {

		setBounds(500, 300, 550, 400);
		setVisible(true);
		add(new LaminaProcesador());

	}

}

class LaminaProcesador extends JPanel {
	public LaminaProcesador() {
		
		setLayout(new BorderLayout());
		JPanel laminamenu = new JPanel();	//LAMINA QUE TENDRA EL MENU
		
							//TOP
		//----------------------------------------------------------------
		JMenuBar mibarra = new JMenuBar();	//BARRA DE MENU
		fuente = new JMenu("Fuente");	//OBJETOS DEL MENU
		estiloo = new JMenu("Estilo");	
		tamagno = new JMenu("Tamaño");
		

		//configura_menu("");
		//------------------------------------------------------------------------
		
		laminamenu.add(mibarra);		
		add(laminamenu,BorderLayout.NORTH);
		
		
		miarea = new JTextPane();
		add(miarea, BorderLayout.CENTER);
		
		
		
	}
	
	public void configura_menu(String rotulo, String menu, String tipo_letra, int estilo, int tam) {
		
		JMenuItem elem_menu = new JMenuItem(rotulo);
		
		if(menu == "fuente") {			
			fuente.add(elem_menu);
		
		}else if(menu == "estilo") {
			
			estiloo.add(elem_menu);
			
		}else if (menu == "tamaño") {
			
			tamagno.add(elem_menu);
		}
			
				
	}
	
	
	JTextPane miarea;
	JMenu fuente, estiloo, tamagno;
	Font letras; 
}






