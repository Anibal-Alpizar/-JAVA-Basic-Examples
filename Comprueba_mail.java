import javax.swing.JOptionPane;

public class Comprueba_mail {

	public static void main(String[] args) {

		
		int arroba = 0 ; //true o false 
		boolean punto = false;  
		
		String mail = JOptionPane.showInputDialog("Introduce mail");
		
	
		for(int i=0; 1<mail.length();i++){ //length numero de letras que tiene el texto
			
			//@
			if(mail.charAt(i)=='@') {
				arroba++;
			}
			//.
			if(mail.charAt(i)=='.') {
				punto=true; 
			}
				
			
		}
		
		
			if (arroba==1 && punto==true) {
			System.out.print("Tu mail es correcto");	
		}else{
			System.out.print("Tu mail es incorrecto");
		}
		
	}


}