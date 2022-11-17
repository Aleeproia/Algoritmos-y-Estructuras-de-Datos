package Ejercicio7;

import tp04.ejercicio1.ArbolGeneral;

public class RedDeAguaPotableTest {

	public static void main(String[] args) {
		
		ArbolGeneral<Integer> aR = new ArbolGeneral<Integer>(0);
		ArbolGeneral<Integer> a1 = new ArbolGeneral<Integer>(0);
		ArbolGeneral<Integer> a2 = new ArbolGeneral<Integer>(0);
		ArbolGeneral<Integer> a3 = new ArbolGeneral<Integer>(0);
		ArbolGeneral<Integer> a4 = new ArbolGeneral<Integer>(0);;
		ArbolGeneral<Integer> a5 = new ArbolGeneral<Integer>(0);
		ArbolGeneral<Integer> a6 = new ArbolGeneral<Integer>(0);
		ArbolGeneral<Integer> a7 = new ArbolGeneral<Integer>(0);
		ArbolGeneral<Integer> a8 = new ArbolGeneral<Integer>(0);
		ArbolGeneral<Integer> a9 = new ArbolGeneral<Integer>(0);
		ArbolGeneral<Integer> a10 = new ArbolGeneral<Integer>(0);
		ArbolGeneral<Integer> a11 = new ArbolGeneral<Integer>(0);
		ArbolGeneral<Integer> a12 = new ArbolGeneral<Integer>(0);
		ArbolGeneral<Integer> a13 = new ArbolGeneral<Integer>(0);
		ArbolGeneral<Integer> a14 = new ArbolGeneral<Integer>(0);
		
		
		/*
				  0
			   / / \ \
		      0  0  0  0
		  	    / \  \    
		  	   0   0  0 0 0 0 0
		    	   |	 / \
		    	   0    0   0
		
		*/
		
		aR.agregarHijo(a1);
		aR.agregarHijo(a2);
		aR.agregarHijo(a3);
		aR.agregarHijo(a4);
		a2.agregarHijo(a5);
		a2.agregarHijo(a6);
		a6.agregarHijo(a7);
		a3.agregarHijo(a8);
		a3.agregarHijo(a9);
		a3.agregarHijo(a10);
		a3.agregarHijo(a11);
		a3.agregarHijo(a14);
		a10.agregarHijo(a12);
		a10.agregarHijo(a13);
		
		RedDeAguaPotable rp= new RedDeAguaPotable();
		
		System.out.print(rp.minimoCaudal(aR,1000));
		
	}

}
