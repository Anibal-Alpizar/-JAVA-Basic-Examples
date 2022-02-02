package graficos;
 
import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.Icon;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

public class PruebasAcciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoAccion marco = new MarcoAccion();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);

	}

}

class MarcoAccion extends JFrame{
	
	public MarcoAccion() {
		
		setTitle("Prueba Acciones");
		setBounds(600,350,600,300);
		
		PanelAccion Lamina = new PanelAccion();
		add(Lamina);
		
	}
}
class PanelAccion extends JPanel{
	
	public PanelAccion() {		//CONSTRUCTOR PARA EL BOTON
		
		//CUANDO PONEMOS LOS PARAMENTROS, ELLOS VIAJAN Y SE ALMACENAN DONDE DEBEN
		//PARA QUE EL PUTVALUE HAGA SU TRABAJO
		
		//INSTANCIADOS
		AccionColor accionAmarillo = new AccionColor("AMARILLO", Color.YELLOW);
		AccionColor accionAzul = new AccionColor("AZUL", Color.BLUE);
		AccionColor accionRojo = new AccionColor("ROJO", Color.RED);
		
		//CREAR EL BOTON CON LA INSTANCIA ANTERIOR 
		/*1.FORMA VERSION LARGA
		JButton botonAmarillo = new JButton(accionAmarillo);		 
		add(botonAmarillo);
		*/
		
		//1.FORMA VERSION CORTA
		
		add(new JButton(accionAmarillo));
		add(new JButton(accionAzul));
		add(new JButton(accionRojo));
		
		
		
		
		/*
		JButton botonAmarillo = new JButton("AMARILLO");
		JButton botonAzul = new JButton("AZUL");
		JButton botonRojo = new JButton("ROJO");
		
		//AÑADIR LOS BOTONES A LA LAMINA
		add(botonAmarillo);
		add(botonAzul);
		add(botonRojo);
		*/
		//
		
		//---------------CAMBIO DE COLOR POR COMBINACION DE TECLAS -----------------//
		
		
		//MAPA DE ENTRADA
		//SE USA EL WHEN.... PARA DECIRLE QUE SON CON BASE A LOS BOTONES 
		//COMO ESTAMOS TRABAJANDO EN LA LAMINA DICE "WINDOW"
		InputMap mapaEntrada = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		
		//CREAR LA COMBINACION DE TELCAS
		//KeyStroke teclaAmarillo = KeyStroke.getKeyStroke("ctrl A");	//STRING POR PARAMETRO
		
		//ASIGNAR LA COMBINACION DE TECLAS
		//VERSION SIMPLIFICADA ANADIENDO EL METODO ANTERIOR
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl A"), "fondo_amarillo");
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl B"), "fondo_azul");
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl R"), "fondo_rojo");
		
		//ASIGNAR O CREAR UN VINCULO EL OBJETO A LA ACCION CON EL "PUT" DE LA CLASE ACTION MAP
		ActionMap mapaAccion = getActionMap();
		mapaAccion.put("fondo_amarillo", accionAmarillo);
		mapaAccion.put("fondo_azul", accionAzul);
		mapaAccion.put("fondo_rojo", accionRojo);
		
		
		
			}
	private class AccionColor extends AbstractAction{//UNA CLASE QUE JUEGUE CON LOS COLORES DE LA LAMINA 
		
		public AccionColor(String nombre, Color color_boton) {
			
			//AL HACER ESTO, CUANDO SE CONSTRUYA LA INSTANCIA DE TIPO ACCIONCOLOR SE DEBE PASAR ESOS PARAMETROS
			putValue(Action.NAME, nombre);													//PARA ALMACENAR EL NOMBRE DE LA ACCION 	
			putValue(Action.SHORT_DESCRIPTION, "PONER LA LAMINA DE COLOR " + nombre);		//CREAR UNA DESCRIPCION 
			putValue("color_de_fondo", color_boton);
			
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			Color c = (Color) getValue("color_de_fondo");	//CONVERSION DE TEXTO - VALOR / CASTING	
			setBackground(c);			//SE DEBE DE SER LA CLASE INTERNA
			
			System.out.println(getValue(Action.NAME) + "," +getValue(Action.SHORT_DESCRIPTION));
			
		}
		
	}
}

