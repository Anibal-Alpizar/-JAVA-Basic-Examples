package graficos;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.Border;

public class Sintaxis_radio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marco_Radio_Sintaxis mimarco = new Marco_Radio_Sintaxis();
		mimarco.setVisible(true);
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
class Marco_Radio_Sintaxis extends JFrame{
	public Marco_Radio_Sintaxis() {
		
		setBounds(550,300,500,300);
		setVisible(true);
		
		Lamina_Radio_sintaxis milamina = new Lamina_Radio_sintaxis();
		add(milamina);
	}
}
class Lamina_Radio_sintaxis extends JPanel{
	public Lamina_Radio_sintaxis() {
		
		
		//---------------CREAR GRUPO-----------------//
		ButtonGroup migrupo1 = new ButtonGroup(); 
		
		ButtonGroup migrupo2 = new ButtonGroup(); 

		
		//--------CREAR LOS BOTONES DE RADIO-------------//
		JRadioButton boton1 = new JRadioButton("Rojo", false);
		JRadioButton boton2 = new JRadioButton("Azul", true);
		JRadioButton boton3 = new JRadioButton("Verde", false);
		
		JRadioButton boton4 = new JRadioButton("Masculino", false);
		JRadioButton boton5 = new JRadioButton("Femenino", false);
		
		
		//-------A�ADIR LOS BOTONES DE RADIO AL GRUPO-----///
		migrupo1.add(boton1);
		migrupo1.add(boton2);
		migrupo1.add(boton3);
		
		
		migrupo2.add(boton4);
		migrupo2.add(boton5);
		//A�ADIR LOS BOTONES, NO EL GRUPO
		add(boton1);
		add(boton2);
		add(boton3);
		
		add(boton4);
		add(boton5);
		
	}
}