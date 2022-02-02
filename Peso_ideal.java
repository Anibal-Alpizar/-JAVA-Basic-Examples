import javax.swing.*;
public class Peso_ideal {

	public static void main(String[] args) {
		
		
		String genero="";
		
		do{
			
			genero=JOptionPane.showInputDialog("Introduce tu genero (H/M)");
			
		}while(genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false); //mientras digite otra cosa
		
		int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en Cm"));//showInputDialog devuelve un string
		int pesoideal=0;
				
		if (genero.equals("H")){
			pesoideal=altura-110;
					
		}
	
		else if(genero.equals("M")){
			
			pesoideal=altura-120;
		}
		System.out.println("Tu peso ideal es " + pesoideal);
	}

}
