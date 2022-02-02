import java.util.*;
public class Evalua_edad2 {

	public static void main(String[] args) {

		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Introduce tu edad porfavor");
		int edad = entrada.nextInt();
		
	
		
		if (edad<=10){
			System.out.print("Estas pequeno");
		}
		else if (edad<=18){
			System.out.print("Eres adolencente");
		}
		else if (edad>18 && edad<50){
			System.out.print("Eres adulto");
		
		}
		else if (edad>=50){
			System.out.print("Cuidate");
		}
		entrada.close();

		}
	}


