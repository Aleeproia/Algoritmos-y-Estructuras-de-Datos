package Parcial9;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp04.ejercicio1.ArbolGeneral;

public class Parcial9 {
	
	
	
	public ListaGenerica<Integer> caminoMasLargo(ArbolGeneral<Integer>a){
		ListaGenerica<Integer>lista = new ListaEnlazadaGenerica<Integer>();
		ListaGenerica<Integer>lista2= new ListaEnlazadaGenerica<Integer>();
		lista.comenzar();
		lista2.comenzar();
		recursion(a,lista,lista2);
		return lista2;
	}

	private void recursion(ArbolGeneral<Integer> a, ListaGenerica<Integer> lista,ListaGenerica<Integer> lista2) {
		lista.agregarFinal(a.getDato());
		if(a.esHoja()) {
			if(lista.tamanio() > lista2.tamanio()) {
				clonar(lista,lista2);
			}
		}else {
			ListaGenerica<ArbolGeneral<Integer>>hijos =a.getHijos();
			hijos.comenzar();
			while(!hijos.fin()) {
				recursion(hijos.proximo(),lista,lista2);
				lista.eliminarEn(lista.tamanio());
			}
		}
		
		
		
	}
	
	public void clonar(ListaGenerica<Integer>lista,ListaGenerica<Integer>lista2) {
		lista.comenzar();
		lista2.comenzar();
		/*while(!lista2.fin()) 
			lista2.eliminar(lista2.proximo());*/
		
		while(!lista.fin()) 
			lista2.agregarFinal(lista.proximo());
		
	}

}
