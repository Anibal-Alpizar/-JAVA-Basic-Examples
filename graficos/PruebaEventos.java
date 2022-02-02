package graficos;
import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;
public class PruebaEventos {

	public static void main(String[] args) {

		MarcoBotones mimarco = new MarcoBotones();
		mimarco.setVisible(true);
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}


class MarcoBotones extends JFrame{
	
	public MarcoBotones() {
		
		setTitle("BOTONES Y EVENTOS");
		setBounds(700,300,500,300);
		
		LaminaBotones laminaBotones = new LaminaBotones();
		add(laminaBotones);
		
	}	
	
}
class LaminaBotones extends JPanel {		//IMPLEMENTS PORQUE ES LA PROPIA LAMINA QUIEN RECIBE EL EVENTO
	
	JButton botonAzul = new JButton("AZUL");		//CREACION BOTON //TEXTO EN()
	JButton botonAmarillo = new JButton("AMARILLO");
	JButton botonRojo = new JButton("ROJO");
	
	public LaminaBotones() {						//CONSTRUCOR

		add(botonAzul);								//AGREGAR EL BOTON AL CONSTRUCTOR
		add(botonAmarillo);
		add(botonRojo);
		
		ColorFondo Amarillo = new ColorFondo(Color.YELLOW);
		ColorFondo Azul = new ColorFondo(Color.BLUE);
		ColorFondo Rojo = new ColorFondo(Color.RED);
		
		botonAzul.addActionListener(Azul);			//DECIRLE AL BOTONAZUL QUE VA A RECIR UNA ACCION Y TIENE QUE ESTAR PENDIENTE //ACTION = AL HACER CLICK
		botonAmarillo.addActionListener(Amarillo);		//THIS = QUIEN VA A EJECUTAR LA ACCION: EN ESTE CASO LA LAMINA	//3 OBJETOS(COLORES) QUE VAN A EJECUTAR UNA ACCION EN THIS (LAMINA)
		botonRojo.addActionListener(Rojo);
		
		
	}		

private class ColorFondo implements ActionListener{			//CLASE OYENTE
	
	public ColorFondo(Color c) {							//CONSTRUCTOR
		
		colorDeFondo = c;
	}
	
public void actionPerformed(ActionEvent e) {
	
	setBackground(colorDeFondo);
	
		}
	private Color colorDeFondo;

	}								
}	//








