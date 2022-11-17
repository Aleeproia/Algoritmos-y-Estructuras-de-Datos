package Parcial9;

import tp02.ejercicio2.ListaGenerica;
import tp04.ejercicio1.ArbolGeneral;

public class Parcial9Test {

	public static void main(String[] args) {
		
		
		ArbolGeneral<Integer> aR = new ArbolGeneral<Integer>(8);
		ArbolGeneral<Integer> a1 = new ArbolGeneral<Integer>(3);
		ArbolGeneral<Integer> a2 = new ArbolGeneral<Integer>(5);
		ArbolGeneral<Integer> a3 = new ArbolGeneral<Integer>(4);
		ArbolGeneral<Integer> a4 = new ArbolGeneral<Integer>(7);
		ArbolGeneral<Integer> a5 = new ArbolGeneral<Integer>(6);
		ArbolGeneral<Integer> a6 = new ArbolGeneral<Integer>(1);
		ArbolGeneral<Integer> a7 = new ArbolGeneral<Integer>(9);
		ArbolGeneral<Integer> a8 = new ArbolGeneral<Integer>(10);
		ArbolGeneral<Integer> a9 = new ArbolGeneral<Integer>(2);
		
		aR.agregarHijo(a1);
		aR.agregarHijo(a2);
		
		a1.agregarHijo(a3);
		a1.agregarHijo(a4);
		a1.agregarHijo(a5);
		
		a2.agregarHijo(a6);
		a2.agregarHijo(a7);
		a2.agregarHijo(a8);
		
		a4.agregarHijo(a9);
		
		Parcial9 p9 = new Parcial9();
		
		ListaGenerica<Integer> lis = p9.caminoMasLargo(aR);
		
		while(!lis.fin()) {
			System.out.print(lis.proximo()+"-");
		}

	}

}
