package graficos;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Layouts_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marco_Layout marco = new Marco_Layout();
		marco.setVisible(true);
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class Marco_Layout extends JFrame{
	public Marco_Layout(){
		
		setTitle("Prueba acciines");
		setBounds(600,350,600,300);
		Panel_Layout lamina = new Panel_Layout();
		Panel_Layout2 lamina2 = new Panel_Layout2();
		//FlowLayout disposicion = new FlowLayout(FlowLayout.LEFT);	//CREAR UN OBJETO DE TIPO LAYOUT
		//lamina.setLayout(disposicion);							//SETEAR EL LAYOUT A LA LAMINA DONDE ESTAN LOS BOTONES
		
	
		add(lamina,BorderLayout.NORTH);		//DONDE QUIERO QUE APAREZCA LA LAMINA PORQUE SINO APARECE UNA ENCIMA DE OTRA
		add(lamina2,BorderLayout.SOUTH);
		
	}
	
}
class Panel_Layout extends JPanel{
	public Panel_Layout() {
		
		setLayout(new FlowLayout(FlowLayout.LEFT));		//SE DAN LAS PROPIEDADES DENTRO DE LA LAMINA COMO CSS
		
		
		//setLayout(new BorderLayout(10,10));		//INSTANCIARLO CON UN CONSTRUCTOR EN LA LAMINA Y EN LOS BOTONES DARLE ORDEN
		
	
		add(new JButton("Amarillo"));
		add(new JButton("Cafe"));
		
		
	}
	
}

class Panel_Layout2 extends JPanel{
	public Panel_Layout2() {
		
		setLayout(new BorderLayout());
		add(new JButton ("Rojo"),BorderLayout.WEST);
		add(new JButton("Azul"),BorderLayout.CENTER);
		add(new JButton("Naranja"),BorderLayout.EAST);
		
		
	}
}

















