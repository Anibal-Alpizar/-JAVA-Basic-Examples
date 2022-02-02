package graficos;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class PruebaArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoPruebaArea mimarco = new MarcoPruebaArea();
		mimarco.setVisible(true);
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class MarcoPruebaArea extends JFrame{
	public MarcoPruebaArea() {
		setTitle("Probando area de texto");
		setBounds(500,300,500,350);
		
		
		setLayout(new BorderLayout());
		
		LaminaBotones = new JPanel();
		botonInsertar = new JButton("Insertar");
		botonSaltoLinea = new JButton("Salto Linea");
		
		
		botonSaltoLinea.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
					
				boolean saltar =! areaTexto.getLineWrap(); //SI HAY SALTO DE LINEA = TRUE
				areaTexto.setLineWrap(saltar);
				
				/*if (saltar == true) {
					botonSaltoLinea.setText("Quitar salto");
				}else {
					botonSaltoLinea.setText("Salto Linea");
				}
				*/
				botonSaltoLinea.setText(saltar==true ? "Quitar salto" : "Salto Linea");
			}
			
		});
		
		
		botonInsertar.addActionListener(new ActionListener() {		//TODO DE UNA VEZ
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				areaTexto.append("En un lugar de la mancha no me quiero acordar");	//AÑADIR TEXTO SEGUIDO DEL ANTERIOR, SIN BORRAR
			}
		});
		LaminaBotones.add(botonInsertar);	//AGREGAR LOS BOTON
		LaminaBotones.add(botonSaltoLinea);
		add(LaminaBotones, BorderLayout.SOUTH);
		
		areaTexto = new JTextArea(8,20);
		laminaConBarras = new JScrollPane(areaTexto);
		add(laminaConBarras,BorderLayout.CENTER);
		
	}
	private JPanel LaminaBotones;
	private JButton botonInsertar, botonSaltoLinea;
	private JTextArea areaTexto;
	private JScrollPane laminaConBarras;
}






