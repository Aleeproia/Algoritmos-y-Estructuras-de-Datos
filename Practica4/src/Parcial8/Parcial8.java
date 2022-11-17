package Parcial8;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp04.ejercicio1.ArbolGeneral;
import tp04.ejercicio1.ColaGenerica;

public class Parcial8 {
	
	public ListaGenerica<Integer> resolver(ArbolGeneral<Integer>a){
		ListaGenerica<Integer>lista= new ListaEnlazadaGenerica<Integer>();
		recursion(a,lista);
		return lista;
	}
	
	private void recursion(ArbolGeneral<Integer>a,ListaGenerica<Integer>lista) { 
		ListaGenerica<ArbolGeneral<Integer>>hijos= a.getHijos();
		hijos.comenzar();
		int suma=0;
		while(!hijos.fin()) {
			ArbolGeneral<Integer> aux = hijos.proximo();
			suma+=aux.getDato();
			recursion(aux,lista);
		}
		if((hijos.tamanio() % 2) !=0) {
			lista.agregarFinal(suma);
		}
	
	}
	/*private void recursion(ArbolGeneral<Integer>a,ListaGenerica<Integer>lista) {
		ListaGenerica<ArbolGeneral<Integer>>hijos= a.getHijos();
		hijos.comenzar();
		int suma=0;
		while(!hijos.fin()) {
			ArbolGeneral<Integer> aux = hijos.proximo();
			suma+=aux.getDato();
			recursion(aux,lista);
		}
		if((hijos.tamanio() % 2) !=0) {
			lista.agregarFinal(suma);
		}
	}*/
		
	
	
	
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
