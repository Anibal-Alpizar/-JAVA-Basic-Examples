
public class Uso_Arrays_II {

	public static void main(String[] args) {

		
			String[] paises = new String [8];
		
				paises[0] = "Espanna";
				paises[1] = "Mexico";
				paises[2] = "Colombia";
				paises[3] = "Peru";
				paises[4] = "Chile";
				paises[5] = "Argentina";
				paises[6] = "Ecuador";
				paises[7] = "Venezuela";

			/*for(int i = 0; 1<paises.length; i++) {
					System.out.println("Paises " + (i+1) + " " + paises[i] );
				*/
				
			for (String i: paises) { //for para trabajar con matrices
					System.out.println(i);
		}
	}

}
