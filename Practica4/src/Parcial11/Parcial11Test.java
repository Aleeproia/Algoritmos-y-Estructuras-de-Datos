package Parcial11;

import tp04.ejercicio1.ArbolGeneral;

public class Parcial11Test {

	public static void main(String[] args) {
		
		ArbolGeneral<Integer> aR = new ArbolGeneral<Integer>(2);
		ArbolGeneral<Integer> a1 = new ArbolGeneral<Integer>(7);
		ArbolGeneral<Integer> a2 = new ArbolGeneral<Integer>(5);
		ArbolGeneral<Integer> a3 = new ArbolGeneral<Integer>(22);
		ArbolGeneral<Integer> a4 = new ArbolGeneral<Integer>(2);
		ArbolGeneral<Integer> a5 = new ArbolGeneral<Integer>(6);
		ArbolGeneral<Integer> a6 = new ArbolGeneral<Integer>(9);
		ArbolGeneral<Integer> a7 = new ArbolGeneral<Integer>(20);
		ArbolGeneral<Integer> a8 = new ArbolGeneral<Integer>(1);
		ArbolGeneral<Integer> a9 = new ArbolGeneral<Integer>(3);
		ArbolGeneral<Integer> a10 = new ArbolGeneral<Integer>(1);
		ArbolGeneral<Integer> a11 = new ArbolGeneral<Integer>(4);
		ArbolGeneral<Integer> a12 = new ArbolGeneral<Integer>(8);
		ArbolGeneral<Integer> a13 = new ArbolGeneral<Integer>(22);
		ArbolGeneral<Integer> a14 = new ArbolGeneral<Integer>(9);
		
		aR.agregarHijo(a1);
		aR.agregarHijo(a2);
		aR.agregarHijo(a3);
		
		a1.agregarHijo(a4);
		a1.agregarHijo(a5);
		
		a2.agregarHijo(a6);
		
		a3.agregarHijo(a7);
		a3.agregarHijo(a8);
		
		a5.agregarHijo(a9);
		a5.agregarHijo(a10);
		
		a6.agregarHijo(a11);
		
		a8.agregarHijo(a12);
		a8.agregarHijo(a13);
		a8.agregarHijo(a14);
		
		Parcial11 p11= new Parcial11();
		
		System.out.print(p11.resolver(aR));

	}

}
