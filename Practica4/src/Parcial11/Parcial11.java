package Parcial11;

import tp02.ejercicio2.ListaGenerica;
import tp04.ejercicio1.ArbolGeneral;

public class Parcial11 {
	
	public Integer resolver(ArbolGeneral<Integer>a) {
		return recursion(a);
	}

	private int recursion(ArbolGeneral<Integer>a) {
		int max=-99;
		ListaGenerica<ArbolGeneral<Integer>>hijos = a.getHijos();
		hijos.comenzar();
		while(!hijos.fin()) {
			max=recursion(hijos.proximo());
		}
		if(a.getDato() > max) {
			max=a.getDato();
			return max;
		}
		return max;	
		
	}
}
