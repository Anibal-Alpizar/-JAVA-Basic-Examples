package graficos;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.*;
public class PruebaDibujo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoConDibujos mimarco = new MarcoConDibujos();
		mimarco.setVisible(true);
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MarcoConDibujos extends JFrame{
	
	public MarcoConDibujos(){
		
		setTitle("Prueba de dibujo y colores");
		setSize(500, 500);
		LaminaConFiguras milamina = new LaminaConFiguras();
		add(milamina);
		//milamina.setBackground(SystemColor.window);		//COLOR DE FONDO		//EL SYSTEMCOLOR.WINDOW DA EL COLOR DEL SISTEMA OPERATIVO 
		milamina.setBackground(Color.MAGENTA);
	}
	
}
class LaminaConFiguras extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		//.DRAW(OBJETO) DIBUJA 
	
		
		super.paintComponent(g);	//LLAMAR AL METODO EL LA CALSE PADRE, PARA QUE HAGA SU TRABAJO
		
		Graphics2D g2 = (Graphics2D) g;		//CONVERTIR EL OBJETO G A GRAPHICS2D, RENOMBRANDOLO G2
		g2.addRenderingHints(new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON));		//QUITA DIENTES DE COCODRILO
		
		
		Rectangle2D rectangulo = new Rectangle2D.Double(100,100,200,150);
		g2.setPaint(Color.RED.darker());		//AL OBJETO GRAPHICS (G2) LE DAMOS EL COLOR, SE PONE EL NOMBRE DEL METODO (COLOR) PORQUE ES STATIC 
		g2.fill(rectangulo);		//FILL = PINTAR O RELLANAR		DRAW = DIBUJAR
		g2.setPaint(Color.BLACK);	//BORDE
		g2.draw(rectangulo);		//BORDE
		
		Ellipse2D elipse = new Ellipse2D.Double();
		elipse.setFrame(rectangulo);		//EL SETFRAME LE DICE QUE LA ELIPSE DEBE DE ESTAR DENTRO DEL (RECTANGULO)
		//g2.setColor(new Color (100,140,255).brighter());		//BRIGHTER PONE EL COLOR MAS CLARO	/DARKER PONE EL COLOR MAS OSCURO
		Color micolor = new Color(125,189,200);	//MISMA FUNCIONALIDAD QUE EL //g2.setColor(new Color (100,140,255).brighter());	
		g2.setPaint(micolor);
		g2.fill(elipse);					//DIBUJA LA ELIPSE
		g2.setPaint(Color.GREEN);
		g2.draw(elipse);
		
		
		//g2.draw(new Line2D.Double(100,100,300,250));
		//double CentroEnX = rectangulo.getCenterX();		//ALMACENAR EN UNA VARIABLE DONDE SE ENCUENTRA EL CENTRO DE LA X 
		//double CentroEnY = rectangulo.getCenterY();		//ALMACENAR EN UNA VARIABLE DONDE SE ENCUENTRA EL CENTRO DE LA Y
		
		//double radio = 150;
		Ellipse2D circulo = new Ellipse2D.Double();
		//circulo.setFrameFromCenter(CentroEnX, CentroEnY, CentroEnX+radio, CentroEnY+radio);
		g2.draw(circulo);
		
		
		// g.drawRect(50, 50, 150, 150);	
		// g.drawArc(120, 120, 300, 300, 360, 360); 	//CIRCULO
		// g.drawLine(100, 100, 300, 200);				//LINEA
		// g.drawArc(50, 100, 100, 200, 120, 100);		//ARCO
		
		
	}
	
}