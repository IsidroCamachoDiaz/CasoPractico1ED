package edu.java.ambitoVariablesClase;

import edu.java.ambitoVariablesClase.ejemploOcultacion.EjemploOcultación;

public class Principal {

	public static void main(String[] args) {
		EjemploOcultación.metodo();
		EjemploOcultacionDos.metodo();
		
		EjemploOcultacionTres eot = new EjemploOcultacionTres();
		eot.metodo();
	}

}
