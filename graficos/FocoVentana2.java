package graficos;

import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

import javax.swing.JFrame;

public class FocoVentana2 extends JFrame implements WindowFocusListener{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FocoVentana2 miv = new FocoVentana2();
		miv.iniciar();			//LLAMA AL METODO INCIAR PARA TRABAJAR CON EL

	}
	public void iniciar() {
		
		marco1 = new FocoVentana2();
		marco2 = new FocoVentana2();
		
		marco1.setVisible(true);
		marco2.setVisible(true);
		
		marco1.setBounds(300,100,600,350);
		marco2.setBounds(1200,100,600,350);
		
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		marco1.addWindowFocusListener(this);
		marco2.addWindowFocusListener(this);

	}
	

	@Override
	public void windowGainedFocus(WindowEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() ==	marco1) {			//e.getsouce = DETECTAR QUIEN HA GENERADO EL FOCO
			marco1.setTitle("TENGO EL FOCO");
		}else{
			marco2.setTitle("TENGO EL FOCO");
		}
	}

	@Override
	public void windowLostFocus(WindowEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() ==	marco1) {			//e.getsouce = DETECTAR QUIEN HA GENERADO EL FOCO
			marco1.setTitle("");
		}else{
			marco1.setTitle("");
		}
		
	}
	FocoVentana2 marco1;
	FocoVentana2 marco2;

}
