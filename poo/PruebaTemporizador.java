package poo;
import javax.swing.*;

import java.awt.Toolkit;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;

public class PruebaTemporizador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DameLaHora oyente = new DameLaHora();		//crear la instancia 
		
		
		Timer mitemporizador = new Timer(5000, oyente);
		
		
		mitemporizador.start();
		
		JOptionPane.showMessageDialog(null, "Pulsa aceptar para detener");

		System.exit(0);
	}

}

class DameLaHora implements ActionListener{ 		//para usar la clase hay que implementar 
	
	
	public void actionPerformed(ActionEvent e) {		//cada 5 segundos se ejecuta la accion 
		
		
		Date ahora = new Date();						//se almacena en ahora 
		
		System.out.println("Te pongo la hora cada 5 seg: " + ahora);
		
		Toolkit.getDefaultToolkit().beep();				//Tolkit para sonar 
	
	}
	
	
	
}
