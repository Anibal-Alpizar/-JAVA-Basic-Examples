package graficos;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoCalculadora mimarco = new MarcoCalculadora();
		mimarco.setVisible(true);
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class MarcoCalculadora extends JFrame{
	
	public MarcoCalculadora() {
		
		setTitle("Calculadora");
		
		setBounds(500,300,450,300);
		
		LaminaCalculadora milamina = new LaminaCalculadora();
		
		add(milamina);
		
		//pack();		//ADAPTAR
	}
}
class LaminaCalculadora extends JPanel{
	
	public LaminaCalculadora(){
		
		principio = true;
		
		setLayout(new BorderLayout());		//DISTRIBUCION DE LA LAMINA
		
		//NORTH
		//JButton pantalla = new JButton ("0");	//DEBE SER CLASE INTERNA 
		pantalla.setEnabled(false);
		add(pantalla, BorderLayout.NORTH);
		
		//GRIDLAYOUT (4,4)
		milamina2 = new JPanel();
		milamina2.setLayout(new GridLayout(4,4));
		
		ActionListener insertar = new InsertaNumero();
		ActionListener orden = new AccionOrden();
		
		ponerBoton("7", insertar);
		ponerBoton("8", insertar);
		ponerBoton("9", insertar);
		ponerBoton("/", orden);
		ponerBoton("4", insertar);
		ponerBoton("5", insertar);
		ponerBoton("6", insertar);
		ponerBoton("*", orden);
		ponerBoton("1", insertar);
		
		ponerBoton("2", insertar);
		ponerBoton("3", insertar);
		ponerBoton("-", orden);
		ponerBoton("0", insertar);
		ponerBoton(".", insertar);
		ponerBoton("=", orden);
		ponerBoton("+", orden);



		
		add(milamina2, BorderLayout.CENTER);
		
		ultimaOperacion = "";
		
	}
private void ponerBoton(String rotulo, ActionListener oyente) {
		
		JButton boton = new JButton(rotulo);
		boton.addActionListener(oyente);		//PONER EL BOTON A LA ESCUCHA
		milamina2.add(boton);
	}
private class InsertaNumero implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		
		// TODO Auto-generated method stub
		String entrada = e.getActionCommand();	//GETACTIONCOMMAND DEVUELVE EL STRING DE LA ACCION
		if (principio == true) {
			pantalla.setText("");
			principio = false;
		}
		pantalla.setText(pantalla.getText() + entrada);
	}
	
}

private class AccionOrden implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String operacion=e.getActionCommand();
		System.out.println(operacion);
		calcular(Double.parseDouble(pantalla.getText()));
		ultimaOperacion = operacion;
		principio = true;
	}
	public void calcular(double x) {	//CEREBRO DEL PROGRAMA
		
		if(ultimaOperacion.equals("+")) {
			resultado+=x;
			System.out.println(resultado);
		}
		else if(ultimaOperacion.equals("-")) {
			resultado-=x;
		}
		else if (ultimaOperacion.equals("=")) {
			resultado = x;
		}
		else if(ultimaOperacion.equals("*")) {
			resultado*=x;	
		}
		else if(ultimaOperacion.equals("/")) {
			resultado/=x;
		}
		pantalla.setText(""+resultado);
	}
}

	private JButton pantalla = new JButton ("0");
	private JPanel milamina2 = new JPanel();
	private boolean principio;
	private double resultado;
	private String ultimaOperacion;
}








