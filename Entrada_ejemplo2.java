import javax.swing.*;

public class Entrada_ejemplo2 {

	public static void main(String[] args) {
	
	
		String nombre_usuario= JOptionPane.showInputDialog("Introduce tu nombre porfavor"); //Muestra el cuadro
		
		String edad = JOptionPane.showInputDialog("Introduce tu edad porfavor"); //Se almacena en un String, porque el ShowInputDialog te devuelve un String
		
		int edad_usuario = Integer.parseInt(edad); //El integer devuelve un String, esto se hace para almacenar el String en un int
		
		System.out.print("Hola " + nombre_usuario + ". El año que viene tendras " + (edad_usuario+1) + " años");

	}

}
