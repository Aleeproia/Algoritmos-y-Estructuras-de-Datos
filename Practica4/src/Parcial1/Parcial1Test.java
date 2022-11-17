package Parcial1;

import tp02.ejercicio2.ListaGenerica;
import tp04.ejercicio1.ArbolGeneral;

public class Parcial1Test {

	public static void main(String[] args) {

		ArbolGeneral<Variables> a1 = new ArbolGeneral<Variables>(new Variables("G", 1));
		
		ArbolGeneral<Variables> a2 = new ArbolGeneral<Variables>(new Variables("E", 3));
		ArbolGeneral<Variables> a3 = new ArbolGeneral<Variables>(new Variables("F", 2));
		ArbolGeneral<Variables> a4 = new ArbolGeneral<Variables>(new Variables("j", 5));
		
		ArbolGeneral<Variables> a5 = new ArbolGeneral<Variables>(new Variables("A", 11));
		ArbolGeneral<Variables> a6 = new ArbolGeneral<Variables>(new Variables("B", 13));
		ArbolGeneral<Variables> a7 = new ArbolGeneral<Variables>(new Variables("C", 5));
		ArbolGeneral<Variables> a8 = new ArbolGeneral<Variables>(new Variables("D", 16));
		ArbolGeneral<Variables> a9 = new ArbolGeneral<Variables>(new Variables("H", 17));		
		ArbolGeneral<Variables> a10 = new ArbolGeneral<Variables>(new Variables("I", 12));

		
		a1.agregarHijo(a2);
		a1.agregarHijo(a3);
		a1.agregarHijo(a4);
	
		a2.agregarHijo(a5);
		a2.agregarHijo(a6);
		a2.agregarHijo(a7);
		

		a3.agregarHijo(a8);
		
		a4.agregarHijo(a9);
		a4.agregarHijo(a10);
		

		
		Parcial1 p1 = new Parcial1();
			
		ListaGenerica<String> recorrer = p1.devolverletra(a1);
		p1.Imprimir(a1);
		while(!recorrer.fin()) {
			System.out.print(recorrer.proximo());
		}

	}

}
