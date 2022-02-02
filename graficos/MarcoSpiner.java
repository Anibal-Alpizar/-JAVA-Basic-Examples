package graficos;

import java.awt.Dimension;
import java.awt.GraphicsEnvironment;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

public class MarcoSpiner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FrameSppiner miframe = new FrameSppiner();
		miframe.setVisible(true);
		miframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class FrameSppiner extends JFrame{
	
	public FrameSppiner() {
		setBounds(550,350,550,350);
		setVisible(true);
		add(new LaminaSppiner());
	}
}
class LaminaSppiner extends JPanel{
	public LaminaSppiner() {
		
		
		//JSpinner misppiner = new JSpinner(new SpinnerDateModel());
		
		
		//String[] fuente = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();;
		//JSpinner misppiner = new JSpinner(new SpinnerListModel(fuente));
		
		
		//JSpinner misppiner = new JSpinner(new SpinnerNumberModel(5,0,10,2));	//[[
		
		//CLASE ANONIMA
		JSpinner misppiner = new JSpinner(new SpinnerNumberModel(5,0,10,1) {
			
			public Object getNextValue() {
				
				return super.getPreviousValue();
				
			}
			public Object getPreviusValue() {
				
				return super.getNextValue();
				
			}		
	
		});
		
		Dimension d = new Dimension(200,200);
		misppiner.setPreferredSize(d);
		
		
		add(misppiner);
	}
	
	/*private class MiModelo extends SpinnerNumberModel{
		
			public MiModelo() {
				
				super(5,0,10,1);		//LLAMA AL CONSTRUCTOR DE LA CLASE PADRE  [[
	}
	public Object getNextValue() {
		
		return super.getPreviousValue();
		
	}
	public Object getPreviusValue() {
		
		return super.getNextValue();
		
	}
	
}*/

	
}
