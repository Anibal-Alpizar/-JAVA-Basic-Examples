package graficos;
import javax.swing.*;
import java.awt.*;
public class TrabajandoConFuentes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrincipalFuentes mimarco = new PrincipalFuentes();
		mimarco.setVisible(true);
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class PrincipalFuentes extends JFrame{
	
	public PrincipalFuentes(){
		
		setTitle("TRABAJANDO CON FUENTES");
		setSize(400,400);
		laminaL milamina = new laminaL();
		add(milamina);
		milamina.setForeground(Color.green);		//TODA LA LAMINA DE TAL COLOR
		
	}
}
class laminaL extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g; 
		
		Font mifuente = new Font("Arial", Font.BOLD, 24);
		g2.setFont(mifuente);
		//g2.setColor(Color.RED);
		g2.drawString("ANIBAL", 100, 100);
		
		
		g2.setFont(new Font("Courier", Font.ITALIC,20));
		//g2.setColor(new Color(128,90,50).brighter());
		g2.drawString("CURSO JAVA", 100, 200);
		
		
	}
	
	
}