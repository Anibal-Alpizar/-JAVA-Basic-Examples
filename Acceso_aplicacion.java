import javax.swing.*;
public class Acceso_aplicacion {

	public static void main(String[] args) {
		

		String clave = "Anibal";
		String pass  = "";
		
		
		
		while(clave.equals(pass)==false){		//equals sirve para ver si las 2 cadenas de texto son iguales
			pass = JOptionPane.showInputDialog("Introduce la cotrasena");  //para que la contrasena se actualice

			
			
			if (clave.equals(pass)==false){
				
				System.out.println("Incorrecta");
			}else{
				System.out.println("Acceso permitido");
			}
		}
		
	}

}
