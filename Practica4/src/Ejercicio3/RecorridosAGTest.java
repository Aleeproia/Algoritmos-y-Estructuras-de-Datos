package Ejercicio3;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp04.ejercicio1.ArbolGeneral;

public class RecorridosAGTest {

	public static void main(String[] args) {
		
		System.out.println("�RBOL DE INTEGER");
		
		ArbolGeneral<Integer> aR = new ArbolGeneral<Integer>(8);
		ArbolGeneral<Integer> a3 = new ArbolGeneral<Integer>(2);
		ArbolGeneral<Integer> a4 = new ArbolGeneral<Integer>(1);
		ArbolGeneral<Integer> a7 = new ArbolGeneral<Integer>(5);
		ArbolGeneral<Integer> a2 = new ArbolGeneral<Integer>(3);
		ArbolGeneral<Integer> a6 = new ArbolGeneral<Integer>(6);
		ArbolGeneral<Integer> a5 = new ArbolGeneral<Integer>(10);
		ArbolGeneral<Integer> a1 = new ArbolGeneral<Integer>(9);
		
		/*
				 8
			  /     \
		    2        10
		  / | \      |
		  1 5 6      9
		    |
		    3
		
		*/
		
		aR.agregarHijo(a3);
		aR.agregarHijo(a5);
		a3.agregarHijo(a4);
		a3.agregarHijo(a7);
		a7.agregarHijo(a2);
		a3.agregarHijo(a6);
		a5.agregarHijo(a1);
		
		RecorridosAG rg = new RecorridosAG();
		
		ListaGenerica<Integer> lista = rg.numerosImparesMayoresQuePreOrden(aR,3);
		System.out.println("-----------");
		while(!lista.fin()) {
			System.out.print(lista.proximo()+"-");
		}

	}

}
