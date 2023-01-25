package clase.dto;

import java.util.Scanner;

public class mainCuenta {

	public static void main(String[] args) {
		
		
		int opcion;
		Scanner leer = new Scanner (System.in);
		do {
		System.out.println("Indique que operacion quiere realizar");
		System.out.println("╔════════════════════════════════╗");
		System.out.println("║	           MENU		         ║");
		System.out.println("╠════════════════════════════════╣");
		System.out.println("║				                 ║");
		System.out.println("║	     1.Crear Cuenta			 ║");
		System.out.println("║	     2.Ingresa Dinero		 ║");
		System.out.println("║	     3.Informacion		     ║");
		System.out.println("║	     4.Sacar Dinero		     ║");
		System.out.println("║	     0.Salir	             ║");
		System.out.println("║				                 ║");
		System.out.println("╚════════════════════════════════╝");
		
		opcion = leer.nextInt();
		System.out.println("Indique su nombre");
		String nombreTitular=leer.next();
		System.out.println("Indique su DNI");
		String dniCuenta=leer.next();
		CuentaCorriente cuenta = new CuentaCorriente(dniCuenta,nombreTitular);
		int numeroCuenta=0;
		if(opcion==2||opcion==3||opcion==4) {
		System.out.println("Numero de Cuenta: ");
		numeroCuenta=leer.nextInt();
		}
		
		switch(opcion) {
		case 1:
			cuenta.crearCuenta(dniCuenta, nombreTitular);
			break;
		case 2:

			System.out.println("Cuanto quiere Ingresar: ");
			int cantidad=leer.nextInt();
			cuenta.ingresarDinero(cantidad, nombreTitular, nombreTitular, numeroCuenta);
			break;
		case 3:
			cuenta.monstarInformacion(nombreTitular, nombreTitular, numeroCuenta);
			break;
		case 4:
			System.out.println("Cuanto quiere sacar: ");
			int retirada=leer.nextInt();
			cuenta.sacarDinero(retirada, nombreTitular, nombreTitular, numeroCuenta);
			break;
		}	
		}while(opcion!=0);
		leer.close();

	}

}
