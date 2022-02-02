package graficos;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;
import java.awt.event.*;

public class Eventos_Raton {
	public static void main(String[]args) {
		
		MarcoRaton mimarco = new MarcoRaton();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}
class MarcoRaton extends JFrame{
	public MarcoRaton(){
		
		setBounds(700,300,600,450);
		setVisible(true);
		EventosDeRaton EventoRaton = new EventosDeRaton();
		addMouseListener(EventoRaton);
		addMouseMotionListener(EventoRaton);
	}
	
}
class EventosDeRaton extends MouseAdapter implements MouseMotionListener{

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("ESTAS ARRASTRANDO");
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("ESTAS MOVIENDO");
		
	}
	
	public void mousePressed(MouseEvent e) {
		
		//int valorRaton = e.getModifiersEx();
		
		if (e.getModifiersEx() == e.BUTTON1_DOWN_MASK) {
			System.out.println("HAZ DADO CLICK IZQUIERDO");
		}else if(e.getModifiersEx() == e.BUTTON2_DOWN_MASK) {
			System.out.println("HAZ DADO CLICK EN EL CENTRO");
		}else if (e.getModifiersEx() == e.BUTTON3_DOWN_MASK) {
			System.out.println("HAZ PRECIONADO EL BOTON DERECHO");
		}
	}

	/*@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("CORDENADA X: " + e.getX() +  " CORDENADA Y: " + e.getY());
		System.out.println("HAZ DADO: " + e.getClickCount());
		
	}
	*/
/*
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("HAZ PRESIONADO");
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("ACABAS DE LEVANTAR");
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("ACABAS DE ENTRAR AL FRAME");
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("ACABAS DE SALIR DEL FRAME");
		
	}
	*/	
}