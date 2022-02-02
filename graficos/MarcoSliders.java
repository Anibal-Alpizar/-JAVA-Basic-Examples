package graficos;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class MarcoSliders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame_Slider miframe = new Frame_Slider();
		miframe.setVisible(true);
		miframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class Frame_Slider extends JFrame{
	public Frame_Slider() {
		
		setBounds(550,400,550,350);
		Lamina_Slider milamina = new Lamina_Slider();
		milamina.setVisible(true);
		add(milamina);
		 
	}
}


class Lamina_Slider extends JPanel{
	public Lamina_Slider() {
		
		JSlider control = new JSlider(0,100,25);
		
		/*
		//--------------EDICION------------------//
		control.setMajorTickSpacing(25);
		control.setMinorTickSpacing(5);
		control.setPaintTicks(true);
		control.setPaintLabels(true);
		
		control.setSnapToTicks(true);		//IMAN
		
		
		//---------------FUENTE--------------------//
		control.setFont(new Font("Serif",Font.ITALIC,12));
		
		//control.setOrientation(SwingConstants.VERTICAL);
		add(control);
		*/

		setLayout(new BorderLayout());
		
		rotulo = new JLabel("En un lugar de la mancha...");
		add(rotulo, BorderLayout.CENTER);
		
		
		control = new JSlider(8,50,12);
		
		
		control.setMajorTickSpacing(20);
		control.setMinorTickSpacing(5);
		control.setPaintTicks(true);
		control.setPaintLabels(true);
		control.setFont(new Font ("Serif", Font.ITALIC,10));
		control.setSnapToTicks(true);
		
		
		
		JPanel laminaSlider = new JPanel();
		laminaSlider.add(control);
		add(laminaSlider,BorderLayout.NORTH);
		
		
		
		
		eventoSlider evento = new eventoSlider();
		control.addChangeListener(evento);
		
	}
	private class eventoSlider implements ChangeListener{

		@Override
		public void stateChanged(ChangeEvent e) {
			// TODO Auto-generated method stub
			contador++;
			//System.out.println("estoy en: " + control.getValue() );
			
			rotulo.setFont(new Font("Sefir" ,Font.PLAIN, control.getValue()));
		}
		
	}
	
	private JLabel rotulo;
	private JSlider control;
	private static int contador = 0;

}