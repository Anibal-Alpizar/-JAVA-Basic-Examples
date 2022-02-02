import java.util.Scanner;

public class Entrada_ejemplo1 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		
		
		System.out.println("Introduce tu nombre");
		int nombre_usuario;
		nombre_usuario = entrada.nextInt();
		
		
		
		System.out.println("Introduce edad, por favor");
		int edad;
		edad = entrada.nextInt();
		
		
		
		System.out.println("Hola " + nombre_usuario + ". El año que viene tendras " + (edad+1) + " años");
	
		entrada.close();
	}

}
