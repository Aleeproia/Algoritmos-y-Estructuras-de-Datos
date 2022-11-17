package Parcial8;

import tp02.ejercicio2.ListaGenerica;
import tp04.ejercicio1.ArbolGeneral;

public class Parcial8Test {

	public static void main(String[] args) {
		
		ArbolGeneral<Integer> aR = new ArbolGeneral<Integer>(2);
		ArbolGeneral<Integer> a1 = new ArbolGeneral<Integer>(1);
		ArbolGeneral<Integer> a2 = new ArbolGeneral<Integer>(12);
		ArbolGeneral<Integer> a3 = new ArbolGeneral<Integer>(14);
		ArbolGeneral<Integer> a4 = new ArbolGeneral<Integer>(5);
		ArbolGeneral<Integer> a5 = new ArbolGeneral<Integer>(4);
		ArbolGeneral<Integer> a6 = new ArbolGeneral<Integer>(8);
		ArbolGeneral<Integer> a7 = new ArbolGeneral<Integer>(4);
		ArbolGeneral<Integer> a8 = new ArbolGeneral<Integer>(7);
		ArbolGeneral<Integer> a9 = new ArbolGeneral<Integer>(9);
		ArbolGeneral<Integer> a10 = new ArbolGeneral<Integer>(10);
		ArbolGeneral<Integer> a11 = new ArbolGeneral<Integer>(5);
		ArbolGeneral<Integer> a12 = new ArbolGeneral<Integer>(3);
		ArbolGeneral<Integer> a13 = new ArbolGeneral<Integer>(13);

	

		
		aR.agregarHijo(a1);
		aR.agregarHijo(a2);
		aR.agregarHijo(a3);
		
		a1.agregarHijo(a4);
		a1.agregarHijo(a5);
		
		a5.agregarHijo(a9);
		a5.agregarHijo(a10);
		a5.agregarHijo(a11);
		
		a2.agregarHijo(a6);
		a2.agregarHijo(a7);
		a2.agregarHijo(a8);
		
		a6.agregarHijo(a12);
		
		a8.agregarHijo(a13);
		
		Parcial8 p8 = new Parcial8();
		
		ListaGenerica<Integer>l = p8.resolver(aR);
				
		while (!l.fin()){
		       System.out.println(l.proximo());
		 }		
		

	}

}
