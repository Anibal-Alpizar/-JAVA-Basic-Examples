package graficos;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PruebaCombo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoCombo mimarco = new MarcoCombo();
		mimarco.setVisible(true);
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoCombo extends JFrame{
	public MarcoCombo() {
		setBounds(550,300,550,400);
		LaminaCombo milamina = new LaminaCombo();
		milamina.setVisible(true);
		add(milamina);
	}
}

class LaminaCombo extends JPanel{
	public LaminaCombo() {
		
		setLayout(new BorderLayout());
		
		texto = new JLabel("Hola como estas amigo mio");
		texto.setFont(new Font("serif", Font.PLAIN, 18));
		add(texto, BorderLayout.CENTER);
		
		lamina_norte = new JPanel();
		
		micombo = new JComboBox();
		micombo.setEditable(true);
	
		micombo.addItem("Serif");
		micombo.addItem("SansSerif");
		micombo.addItem("Monospaced");
		micombo.addItem("Dialog");
		
		lamina_norte.add(micombo);
		add(lamina_norte, BorderLayout.NORTH);
		
		gestion_eventos mievento = new gestion_eventos();
		
		micombo.addActionListener(mievento);
	}
	private class gestion_eventos implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			texto.setFont(new Font((String) micombo.getSelectedItem(), Font.PLAIN,18));
		}
		
	}
	
	
	private JLabel texto;
	private JComboBox micombo;
	private JPanel lamina_norte;
}