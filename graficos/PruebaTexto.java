package graficos;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PruebaTexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoTexto milamina = new MarcoTexto();
		milamina.setVisible(true);
		milamina.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		
	}

}
class MarcoTexto extends JFrame{
	public MarcoTexto() {
		setBounds(600,300,600,350);
		LaminaTexto milamina = new LaminaTexto();
		add(milamina);
		milamina.setVisible(true);
		
		
	}
}
class ContenedorButton extends JPanel{
	public ContenedorButton() {
		
		
		JLabel texto1 = new JLabel("Email: ");
		add(texto1);
		
		
	}
	
	
	
	
}
class LaminaTexto extends JPanel{
	public LaminaTexto() {
		
		setLayout(new BorderLayout());		//LAMINA PRINCIPAL DE BORDER LAYOUT 
		JPanel milamina2 = new JPanel();
		milamina2.setLayout(new FlowLayout());
		
		
		//CREAR Y AÑADIR EL BOTON Y EL TEXTFIELD
		
		resultado = new JLabel("",JLabel.CENTER);
		
	

		JLabel texto1 = new JLabel("Email: ");
		milamina2.add(texto1);
		
		
		
		campo1 = new JTextField("Ingrese una direccion de correo valida", 20);
		milamina2.add(campo1);
		
		add(resultado, BorderLayout.CENTER);
		
		
		JButton miboton = new JButton("Presiona para comprobar");
		milamina2.add(miboton);
		
		
	
		DameTexto lamina_comprobacion = new DameTexto();
		miboton.addActionListener(lamina_comprobacion);
		
		AccionBorrar lamina_borrar = new AccionBorrar();
		
		
		JButton borrar = new JButton("Borrar Texto");
		milamina2.add(borrar);
		borrar.addActionListener(lamina_borrar);
		
		add(milamina2,BorderLayout.NORTH);
	}
	
	private class DameTexto implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			boolean arroba = false;
			
			String guardo =campo1.getText();
			for (int i = 0; i<guardo.length(); i++) {
				
				if(campo1.getText().charAt(i) == '@') {
					arroba = true;
				}
			}
			if (arroba == true) {
				resultado.setText("Correcto");
			}else if (arroba == false) {
				resultado.setText("incorrecto");
			}
			
			
		}
		
	}
	private class AccionBorrar implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			campo1.setText("");
			
		}
		
	}
	private JTextField campo1;
	private JLabel resultado;
}





	