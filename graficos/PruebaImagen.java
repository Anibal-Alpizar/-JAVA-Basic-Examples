package graficos;
import javax.swing.*;
import java.awt.*;
import javax.imageio.*;
import java.io.*;
public class PruebaImagen {

	public static void main(String[] args) {
		
		MarcoImagen mimarco = new MarcoImagen();
		mimarco.setVisible(true);
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}

}
class MarcoImagen extends JFrame{
	
	public MarcoImagen() {
		
		setTitle("MARCO CON IMAGEN");
		setBounds(750,300,300,200);
		
		LaminaConImagen miLamina = new LaminaConImagen();
		add(miLamina);
		
	}
}

class LaminaConImagen extends JPanel{
	
	public void paintComponet(Graphics g) {
		
		super.paintComponent(g);
		
		
		//File miimagen = new File("src/graficos/tenor.png");		//TENEMOS ALCENADO LA IMAGEN EN UNA VARIABLE DE TIPO FILE
		//Y SINO ENCUENTRAS LA IMAGEN... INTENTA....
		
		try {		//TRATAMIENTO DE EXCEPCIONES 
		imagen = ImageIO.read(new File("src/graficos/e8nZC.gif"));
		}
		catch(IOException e){
			System.out.println("LA IMAGEN NO SE HA PODIDO ENCOTRAR");
			
			g.drawImage(imagen, 0, 0, null);
			
		    g.copyArea(0, 0, 15, 15, 150, 75);
		
		}
	}
	
	
	
	private Image imagen; //TIPO IMAGE
	
}