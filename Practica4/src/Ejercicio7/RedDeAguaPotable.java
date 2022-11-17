package Ejercicio7;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp04.ejercicio1.ArbolGeneral;
import tp04.ejercicio1.ColaGenerica;

public class RedDeAguaPotable {


	
	public int minimoCaudal(ArbolGeneral<Integer>a,int caudal) {	
		return recursion(a,caudal);
	
	}
	
	
	private int recursion(ArbolGeneral<Integer>a,int caudal) {
		if(a.esHoja()) {
			return caudal;
		}
		else {
				ListaGenerica<ArbolGeneral<Integer>> hijos = a.getHijos();
				int minimo_caudal=caudal;
				hijos.comenzar();
				while(!hijos.fin()) {
					int actual_caudal =recursion(hijos.proximo(),caudal/hijos.tamanio());
					System.out.println(actual_caudal);
					if(actual_caudal < minimo_caudal ) 
						minimo_caudal=actual_caudal;
				}
				return minimo_caudal;
			
		}
		
		
	

	}
	
	
	
	public void Imprimir(ArbolGeneral<Integer>a) {
		ArbolGeneral<Integer> arbol;
		ColaGenerica<ArbolGeneral<Integer>> cola = new ColaGenerica<ArbolGeneral<Integer>>();
		cola.encolar(a);
		cola.encolar(null);
		while(! cola.esVacia()){
			arbol = cola.desencolar();
			if(arbol != null) {
				System.out.print(arbol.getDato()+" ");
				ListaGenerica<ArbolGeneral<Integer>> hijos = arbol.getHijos();
				hijos.comenzar();
				while(! hijos.fin()){
					cola.encolar(hijos.proximo());
				}
			}else if (! cola.esVacia()) {
				System.out.println();
				cola.encolar(null);
			}
		}
	}

}
