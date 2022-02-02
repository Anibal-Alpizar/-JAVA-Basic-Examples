
public class manipula_cadena {

	public static void main(String[] args) {
	

		//String nombre="Anibal";					//string para texto
		//int Final;								//cuantas letras tiene el texto "length()" 
		//Final = nombre.length();
		//System.out.print(Final);
		
		
		
		String nombre = "Juan"; 
		
		System.out.println("Mi nombre es " + nombre);							//imprime mi nombre
		
		System.out.println("Mi nombre tiene " + nombre.length() + " letras"); 	//imprime cantidad de letras
		
		System.out.println("La primera letra es: " + nombre.charAt(0)); 		//imprime la posicion
		
		
		
		int cantidad_letras; 
		cantidad_letras = nombre.length();
		System.out.println("Y la ultima letra de " + nombre + " es " + nombre.charAt(cantidad_letras-1));
		
		
		
		
	}

}
