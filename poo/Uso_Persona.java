package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Persona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Persona[]lasPersonas = new Persona[2];
		
		lasPersonas[0] = new Empleado2("Luis Conde" , 50000, 2009, 02, 25);
		lasPersonas[1] = new Alumno("Ana Lopez", "Biologicas");
		
		for (Persona p: lasPersonas) {
			System.out.println(p.dameNombre() +", " + p.dameDescripcion());
		}
		
		
		
	}

}

abstract class Persona{								//la clase tambien tiene que ser abstracto porque el metodo lo es 
	
	
	public Persona (String nom) {

	nombre = nom; 
	
	}
	
	
	public abstract String dameDescripcion();		//metodo abstracto //solo se define, no se construye 
	
	

	public String dameNombre() {
		
		return nombre;
		
	}
	
	
	private String nombre; 

	
}


class Empleado2 extends Persona{		//CONSTRUCTOR
	
	public Empleado2(String nom, double sue, int agno, int mes, int dia) {
		
		super (nom);
		sueldo = sue;
		GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia); 	//creacion del objeto calendario, para crear fechas 
		altaContrato = calendario.getTime();
		++IdSiguiente; 
		Id = IdSiguiente; 
		
	}
	public String dameDescripcion() {

		return "Este empleado tiene un ID = " + Id + " con un sueldo = " + sueldo ;
	}
	
	double dameSueldo() {					//GETT
		return sueldo; 
	}
	
	
	public Date dameFechaContrato() {				//GETT
		return altaContrato; 
	}
	
	
	public void subeSueldo(double porcentaje) {		//SETT
		double aumento = sueldo * porcentaje / 100;
		sueldo += aumento; 
	}
	
	
	private double sueldo; 
	private Date altaContrato;			//java.util
	private static int IdSiguiente;
	private int Id;
	}

class Alumno extends Persona{
	
	public Alumno(String nom, String car) {
		
		super(nom);
		
		carrera = car;
		
		
	}
	
	public String dameDescripcion() {
		
		return "Este almuno esta estudiando la carrea de " + carrera;
		
	}
	private String carrera;
	
	
}


