package Parcial5;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp04.ejercicio1.ArbolGeneral;

public class Parcial5Test {

	public static void main(String[] args) {
		
		
		ArbolGeneral<String> aR = new ArbolGeneral<String>("A");
		ArbolGeneral<String> a1 = new ArbolGeneral<String>("B");
		ArbolGeneral<String> a2 = new ArbolGeneral<String>("C");
		ArbolGeneral<String> a3 = new ArbolGeneral<String>("D");
		ArbolGeneral<String> a4 = new ArbolGeneral<String>("E");
		ArbolGeneral<String> a5 = new ArbolGeneral<String>("F");
		ArbolGeneral<String> a6 = new ArbolGeneral<String>("G");
		ArbolGeneral<String> a7 = new ArbolGeneral<String>("H");
		ArbolGeneral<String> a8 = new ArbolGeneral<String>("I");
		ArbolGeneral<String> a9 = new ArbolGeneral<String>("J");
	

		
		
		/*
				 0
			   / | \ 
		      0  0  0  
		  	 /  / \     
		  	0  0   0  
		      / \
		     0   0
		*/
		
		aR.agregarHijo(a1);
		aR.agregarHijo(a2);
		aR.agregarHijo(a3);
		
		a1.agregarHijo(a4);
		a4.agregarHijo(a9);
		
		a2.agregarHijo(a5);
		a2.agregarHijo(a6);
		
		a5.agregarHijo(a7);
		a5.agregarHijo(a8);
		
		
		Parcial5 p5 = new Parcial5();
		
		p5.Imprimir(aR);
		
		ListaGenerica<ListaEnlazadaGenerica<String>> listaDeLista= p5.caminosPares(aR);
		
		 System.out.println("-----------");
		
		 System.out.println(listaDeLista.tamanio());

	}

}
