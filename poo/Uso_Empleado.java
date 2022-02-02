package poo;
import java.util.*;

public class Uso_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Jefatura jefe_RRHH = new Jefatura("Juan", 55000, 2006,9,25);
		jefe_RRHH.estableceIncentivo(2570);
		
		
		Empleado[] misEmpleados = new Empleado[6];
		misEmpleados[0] = new Empleado("Paco Gomez", 85000, 1990,12 ,17);
		misEmpleados[1] = new Empleado("Ana Lopez", 95000, 1995, 6, 02);
		misEmpleados[2] = new Empleado("Maria Martin",105000, 2002, 3, 15);
		misEmpleados[3] = new Empleado("Antonio Fernandez");
		misEmpleados[4] = jefe_RRHH;											//polimorfismo. Principio de susticion  //instanciar el objeto anteriormente 
		misEmpleados[5] = new Jefatura ("Maria", 95000, 1999, 5 ,26);			//instanciar el objeto directamente 
		Jefatura jefa_finanzas = (Jefatura) misEmpleados[5];					//casting 
		jefa_finanzas.estableceIncentivo(5000);
		
		System.out.println(jefa_finanzas.tomar_decisiones("Dar mas dias de vacaciones a los empleados"));
		System.out.println("El jefe " + jefa_finanzas.dameNombre() +  " tiene n un bonus de " + jefa_finanzas.establece_bonus(500));
		System.out.println(misEmpleados[3].dameNombre() + " tiene un bonus de " + misEmpleados[3].establece_bonus(200));
		
		for (Empleado e: misEmpleados) {										//for mejorado
			
			e.subeSueldo(5);
			
		}
		
			Arrays.sort(misEmpleados);			//para usar el metodo sort se debe implementar la intefarzas
			
		for (Empleado e: misEmpleados) {				
			System.out.println("Nombre: " + e.dameNombre() + " suelo: " + e.dameSueldo() + " Fecha de alta " + 
					e.dameFechaContrato());
		}
		
	}

}


class Empleado implements Comparable, Trabajadores {	//implementa de la interfaz trabajadores, para que todos lo empleados tengan un bonu	y como se implemeta de la intefaz es necesario implementar todos los metodos 
	
	public Empleado(String nom, double sue, int agno, int mes, int dia) { //CONSTRUCTOR
		
		nombre = nom;
		sueldo = sue;
		GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia); 	//creacion del objeto calendario, para crear fechas 
		altaContrato = calendario.getTime();
		
	}
	
	public double establece_bonus(double gratificacion) {
		
		return Trabajadores.bonus_base + gratificacion; 
		
	}
	
	
	
	public Empleado (String nom) {													//sobrecargar de constructor 
		this(nom, 30000, 2000,01,01);												//uso this()para dejar por defecto valores 
																					//el this. llama al otro constructor 
	}
	
	
	
	public String dameNombre() {					//GETT
		return nombre; 	
	}
	
	public double dameSueldo() {					//GETT
		return sueldo; 
	}
	
	
	public Date dameFechaContrato() {				//GETT
		return altaContrato; 
	}
	
	
	public void subeSueldo(double porcentaje) {		//SETT
		double aumento = sueldo * porcentaje / 100;
		sueldo += aumento; 
	}
	
	public int compareTo(Object miObjeto) {			//sort 
		
		Empleado otroEmpleado = (Empleado) miObjeto;
		
		if (this.sueldo < otroEmpleado.sueldo) {
			return -1;
		}
		if(this.sueldo > otroEmpleado.sueldo) {
			return 1;
		}
		return 0;
	}
		
	
	
	private String nombre;
	private double sueldo; 
	private Date altaContrato;			//java.util
	
	}


class Jefatura extends Empleado implements Jefes  {		//la clase jefatura hereda la clase empleado y APARTE implementa la interfaz de jefe, que jefe hereda de trabajadores
	
	public Jefatura(String nom, double sue, int agno, int mes, int dia) {
		
		super(nom, sue, agno ,mes, dia); 		//se debe poner valores exactos en los () porque tiene que buscar cual de los 2 constructores esta invocando
		
		
	}
	
	public String tomar_decisiones(String decision) {			//interfaz 
		
		return "Un miembro de la direccion a tomado la dicision de: " + decision; 
		
	}
	
	public double establece_bonus(double gratificacion) {
	
		double prima = 2000;
		
		return Trabajadores.bonus_base + gratificacion + prima; 
		
	}
	
	
	
	
	public void estableceIncentivo(double b){
		
		incentivo = b; 
		
	}
	
	
	public double dameSueldo() {
		
		double sueldoJefe = super.dameSueldo();
		
		return sueldoJefe + incentivo; 
	}
	
	
	private double incentivo; 
	
	
}


	
	
	
	
	
	
	



