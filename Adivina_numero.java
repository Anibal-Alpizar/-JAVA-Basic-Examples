import java.util.*;
public class Adivina_numero {

	public static void main(String[] args) {
		
		
		
		//System.out.println(Math.random()*100); //math.random() genera un numero aleatorio entre 0 y 1
		 										//se multiplica por 100, para mover la ,
		
		
		int aleatorio = (int)(Math.random()*100);					//me pasa de double a int para quitar los decimales									
		
		Scanner entrada = new Scanner(System.in);  					//tipo scanner, y le dicimos que vamos a usar la consola para introducir numero
		
		int numero = 0;												//se tiene que iniciar la variable, no solo declararla
		int intentos=0;
		
		while(numero!=aleatorio){ 									//diferente de
								  									//numero = 0, aleatorio generado por el programa
		intentos++;													//como intentos = 0     //hace un incremento por cada vez que pasa por si ciclo while
			System.out.println("Introduce un numero, por favor");
			numero = entrada.nextInt();
			
		if(aleatorio<numero){
			System.out.println("Mas bajo");
		}
		
		else if(aleatorio>numero){
			
			System.out.println("Mas alto");
		}
		
		}
		
		System.out.println("Correcto, lo has conseguido en  " + intentos + " intentos");	
		entrada.close();
	}
	

}
