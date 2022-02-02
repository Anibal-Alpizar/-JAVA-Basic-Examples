
public class TiendaPaquetePromocion {

	public static void main(String[] args) {
	
		
		int annosDesintegracion = 9; 
		double pesoInicial = 2.2;
	
		double pesoFinal; 
		for (int i=1; i<=annosDesintegracion; i++){

		switch (annosDesintegracion) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
			pesoFinal = pesoInicial - 0.15;			
		 	break; 
		case 7:
		case 8:
		case 9:
			pesoFinal = pesoInicial - 0.10;
			break; 
		case 10:
		case 11:
		case 12:
		case 13:
		case 14:
		case 15:
			pesoFinal = pesoInicial - 07.07;
			break;

		 default: 
			pesoFinal = pesoInicial - 03.08;
			break; 
		} 
		
System.out.println("El peso que tendra la bolsa ya desintegrada es de " + pesoFinal +" en " + i + " año(s)");
		}
	}
}
