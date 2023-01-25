package clase.dto;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CuentaCorriente {
	
	
	public CuentaCorriente(String dni, String nombreTitular) {
		super();
		this.dni = dni;
		this.nombreTitular = nombreTitular;
	}

	private String dni;
	private String nombreTitular;
	private double saldoCuenta;
	public List <CuentaCorriente> cuentas= new LinkedList<>();
	
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombreTitular() {
		return nombreTitular;
	}

	public void setNombreTitular(String nombreTitular) {
		this.nombreTitular = nombreTitular;
	}

	public double getSaldoCuenta() {
		return saldoCuenta;
	}

	public void setSaldoCuenta(double saldoCuenta) {
		this.saldoCuenta = saldoCuenta;
	}


	public double crearCuenta(String dniCuenta,String nombreTitular) {
		double cero=0.0;
		CuentaCorriente cuenta = new CuentaCorriente(dniCuenta,nombreTitular);
		cuenta.saldoCuenta=cero;
		cuentas.add(cuenta);
		System.out.println("Cuenta creada su numero de cuenta es: "+(cuentas.size()-1));
		return cero;
	}

	public void inicio (String nombreTitular,String dniTitular,int numeroCuenta) {
		Scanner leer = new Scanner(System.in);
		do {
			if(cuentas.get(numeroCuenta).dni!=dniTitular||cuentas.get(numeroCuenta).nombreTitular!=nombreTitular) {
				System.out.println("Los datos Introducidos en la cuenta no coincide,vuelva a intrducir los datos:");
				System.out.println("Nombre del Titular: ");
				nombreTitular=leer.next();
				System.out.println("DNI: ");
				dniTitular=leer.next();
				System.out.println("Numero de cuenta: ");
				numeroCuenta=leer.nextInt();
			}
		}while(cuentas.get(numeroCuenta).dni!=dniTitular||cuentas.get(numeroCuenta).nombreTitular!=nombreTitular);
		leer.close();
	}

	public void ingresarDinero(double cantidadIngreso,String nombreTitular,String dniTitular,int numeroCuenta) {
		inicio(nombreTitular,dni,numeroCuenta);
		cuentas.get(numeroCuenta).saldoCuenta=cuentas.get(numeroCuenta).saldoCuenta+cantidadIngreso;
	}
	public void monstarInformacion(String nombreTitular,String dniTitular,int numeroCuenta) {
		inicio(nombreTitular,dniTitular,numeroCuenta);
		System.out.println("Nombre: "+cuentas.get(numeroCuenta).nombreTitular);
		System.out.println("DNI: "+cuentas.get(numeroCuenta).dni);
		System.out.println("Saldo actual: "+cuentas.get(numeroCuenta).saldoCuenta);
	}
	public double sacarDinero(double cantidadRetirada,String nombreTitular,String dniTitular,int numeroCuenta) {
		inicio(nombreTitular,dniTitular,numeroCuenta);
		if(cuentas.get(numeroCuenta).saldoCuenta-cantidadRetirada<0) {
			System.out.println("Saldo insuficiente");
			return 0;
		}
		else {
			System.out.println("Operacion realizada");
			cuentas.get(numeroCuenta).saldoCuenta=cuentas.get(numeroCuenta).saldoCuenta-cantidadRetirada;
			return cantidadRetirada;
		}
	}
} 

