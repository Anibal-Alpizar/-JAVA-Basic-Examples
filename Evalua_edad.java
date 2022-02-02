import java.util.*;
public class Evalua_edad {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.print("Introduzca edad");
		int edad = entrada.nextInt();
		
		if(edad>=18){
		System.out.print("Es mayor de edad");
					}
		else{
			System.out.print("Eres menor de edad");
			entrada.close();
			}	
		}
	}


