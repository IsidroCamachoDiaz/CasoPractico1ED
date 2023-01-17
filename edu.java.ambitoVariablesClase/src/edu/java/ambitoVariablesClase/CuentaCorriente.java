package edu.java.ambitoVariablesClase;

import java.util.Scanner;

public class CuentaCorriente {


	public static void crearCuenta(int dni,String nombre) {
		Scanner leer= new Scanner(System.in);
		System.out.print("Introduzca su DNI sin letra");
		dni = leer.nextInt();
		System.out.print("Introduzca su nombre");
		nombre=leer.next();
	}
	public static int ingresarDinero(int dineroMeter,String dni){
		registro();
		
		return 8;
	}
	public static String registro() {
		System.out.print("Introduzca su DNI sin la letra");
		Scanner leer= new Scanner(System.in);
		String dni=leer.next();
		leer.close();
		return dni;
	}
		
	}
	

