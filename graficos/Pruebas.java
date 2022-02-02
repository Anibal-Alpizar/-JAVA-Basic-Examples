package graficos;

import java.awt.GraphicsEnvironment;
import javax.swing.*;

public class Pruebas {
	public static void main(String[] args) {
		
		String fuente = JOptionPane.showInputDialog("Introduce fuente");
		boolean estalafuente = false;
		
		String[] nombresDeFuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();		//DAME LAS FUENTES TENGO INSTALDAS Y PONLAS EN NOMBRESDEFUENTES
		
		for(String nombredelafuente: nombresDeFuentes) {				//RECORRO TODO EL FOR EACH 
			
			if(nombredelafuente.equalsIgnoreCase(fuente)){				//SI NOMBREDELAFUENTE ES IGUAL A FUENTE(INTROCIDA POR EL USUARIO)
			
				estalafuente = true;
			}
		}
		
		if(estalafuente == true){
			System.out.println("Fuente Instalada");
		}else{
			System.out.println("No esta intalada la fuente");
		}
	}
}
