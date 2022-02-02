package graficos;
import javax.swing.*;
import java.awt.*;		//PARA USAR EL GRAPHICS

public class EscribiendoEnMarco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoConTexto miMarco = new MarcoConTexto();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//OPERACION QUE REALIZARA AL CERRA EL PROGRAMA
		

	}
}

class MarcoConTexto extends JFrame{
	
	public MarcoConTexto() {
		
		setVisible(true);			//VER VISIBLE EL CUADRO
		
		setSize(600,450);			//DARLE TAMAÑO
		
		setLocation(400,200);		//DARLE UBICACION INICIAL
		
		setTitle("Primer texto");	//DARLE TITULO
		
		Lamina miLamina = new Lamina();			//LA LAMINA YA ESTA CREADA, SOLO FALTA AÑADIR LA LAMINA 
		add(miLamina);
	
	}
	//EL JFRAME AYUDA A CREAR EL CUADRO
	//EL JPANEL AYUDA A INTERACTUAR CON EL CUADRO
}



//JPANEL AYUDA A CREAR LA LAMINA
class Lamina extends JPanel{
	
	//EL PAINTCOMPONET ES EL METODO QUE AYUDA A DIBUJAR DE LA CLASE JCOMPONET
	public void paintComponent(Graphics g) {
		//EL GRAPHICS AYUDA A CREAR GRAFICOS, TEXTO, FIGURAS GEOMETRICAS
		
		//INVOCAR UN METODO DE LA CLASE PADRE
		super.paintComponent(g);
		
	//DRAWATRING AYUDA A ESCRIBIR TEXTO EN NUESTRA LIMANA	
		g.drawString("Estamos aprendiendo swing", 100, 100);
		//DRAWSTRING("STRING", INT X, INT Y);
		g.drawArc(120, 120, 300, 300, 360, 360); //CIRCULO
	}	
}







