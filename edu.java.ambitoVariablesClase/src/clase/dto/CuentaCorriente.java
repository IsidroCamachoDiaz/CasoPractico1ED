package clase.dto;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CuentaCorriente {
	
	
	public CuentaCorriente(String dni, String nombreTitular) {
		super();
		this.dni = dni;
		this.nombreTitular = nombreTitular;
	}

	String dni;
	String nombreTitular;
	double saldoCuenta;
	public List <CuentaCorriente> cuentas= new LinkedList<>();

	public double crearCuenta(String dniCuenta,String nombreTitular) {
		double cero=0.0;
		CuentaCorriente cuenta = new CuentaCorriente(dniCuenta,nombreTitular);
		cuenta.saldoCuenta=cero;
		cuentas.add(cuenta);
		System.out.println("Cuenta creada su numero de cuenta es: "+(cuentas.size()-1));
		return cero;
	}

	public void inicio (String nombreTitular,String dniTitular,int numeroCuenta) {
		CuentaCorriente datosInicio = new CuentaCorriente(dniTitular,nombreTitular);
		Scanner leer = new Scanner(System.in);
		do {
			if(cuentas.get(numeroCuenta).dni!=datosInicio.dni||cuentas.get(numeroCuenta).nombreTitular!=datosInicio.nombreTitular) {
				System.out.println("Los datos Introducidos en la cuenta no coincide,vuelva a intrducir los datos:");
				System.out.println("Nombre del Titular: ");
				datosInicio.nombreTitular=leer.next();
				System.out.println("DNI: ");
				datosInicio.dni=leer.next();System.out.println("Numero de cuenta: ");
				numeroCuenta=leer.nextInt();
			}
		}while(cuentas.get(numeroCuenta).dni!=datosInicio.dni||cuentas.get(numeroCuenta).nombreTitular!=datosInicio.nombreTitular);
		leer.close();
	}

	public void ingresarDinero(double cantidadIngreso,String nombreTitular,String dniTitular,int numeroCuenta) {
		CuentaCorriente datos = new CuentaCorriente(dniTitular,nombreTitular);
		inicio(nombreTitular,dni,numeroCuenta);
		datos=cuentas.get(numeroCuenta);
		datos.saldoCuenta=datos.saldoCuenta+cantidadIngreso;
		cuentas.set(numeroCuenta, datos);
		
		
	}
	public void monstarInformacion(String dni,String nombreTitular,String dniTitular,int numeroCuenta) {
		inicio(nombreTitular,dni,numeroCuenta);
		CuentaCorriente CuentaPropia = new CuentaCorriente(dniTitular,nombreTitular);
		CuentaPropia=cuentas.get(numeroCuenta);
		
		System.out.println("Nombre: "+CuentaPropia.nombreTitular);
		System.out.println("DNI: "+CuentaPropia.dni);
		System.out.println("Saldo actual: "+CuentaPropia.saldoCuenta);
	}
	public double sacarDinero(double cantidadRetirada,String nombreTitular,String dniTitular,int numeroCuenta) {
		CuentaCorriente datos = new CuentaCorriente(dniTitular,nombreTitular);
		inicio(nombreTitular,dniTitular,numeroCuenta);
		datos=cuentas.get(numeroCuenta);
		if(datos.saldoCuenta-cantidadRetirada<0) {
			System.out.println("Saldo insuficiente");
			return 0;
		}
		else {
			System.out.println("Operacion realizada");
			datos.saldoCuenta=datos.saldoCuenta-cantidadRetirada;
			cuentas.set(numeroCuenta, datos);
			return cantidadRetirada;
		}
	}
} 

