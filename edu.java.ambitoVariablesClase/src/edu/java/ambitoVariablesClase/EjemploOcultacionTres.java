package edu.java.ambitoVariablesClase;

public class EjemploOcultacionTres {
    int z=2; //atributo
    public void metodo(){
         double z;  //variable local
         z = 6.2;
          System.out.println("Ocultación Tres metodo con this: " + this.z);
    }
}
