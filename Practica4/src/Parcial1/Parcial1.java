package Parcial1;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp04.ejercicio1.ArbolGeneral;
import tp04.ejercicio1.ColaGenerica;

public class Parcial1 {
	
	
	 /*Sea un árbol general en donde cada nodo tiene un valor numérico, usted debe devolver el camino
	 determinado por el valor que posee cada nodo. Es decir, el camino comienza en el nodo raíz, luego
	 debe seguir por el hijo que se encuentra en la posición indicada por el valor en el nodo raíz y así debe
	 seguir hasta llegar a su hoja. Para el siguiente árbol, el camino a retornar es GEC*/
	
	public ListaGenerica<String> devolverletra(ArbolGeneral<Variables>a){
		ListaGenerica<String> lista = new ListaEnlazadaGenerica<String>();
		recursion(a,lista);
		return lista;
	}
	
	private void recursion(ArbolGeneral<Variables> a, ListaGenerica<String> lista) {
		lista.agregarFinal(a.getDato().getLetra());
		if(a.tieneHijos()) {
			ListaGenerica<ArbolGeneral<Variables>> hijos = a.getHijos();
			hijos.comenzar();
			int canthijos=0;
			while(!hijos.fin()) {
				canthijos++;
				ArbolGeneral<Variables>aux = hijos.proximo();
				if(a.getDato().getNumero() == canthijos) {
					recursion(aux,lista);
				}
			}
		}
	}













	
	
	



	/*private void recursion(ArbolGeneral<Variables>a,ListaGenerica<String>lista) {
		int ir = a.getDato().getNumero();
		if(a.tieneHijos()) {		
			ListaGenerica<ArbolGeneral<Variables>> hijos = a.getHijos();
			hijos.comenzar();
			int canthijos = 0;
			while(!hijos.fin()) {
				ArbolGeneral<Variables> aux = hijos.proximo();
				canthijos++;
				if(ir == canthijos) {
					lista.agregarFinal(aux.getDato().getLetra());
					recursion(aux,lista);
				}
			
			}
		
		}
		
	}*/
	
	/*public void clonar(ListaGenerica<String>lista,ListaGenerica<String>camino) {
		lista.comenzar();
		while(!lista.fin()) {
			camino.agregarFinal(lista.proximo());
		}
	}*/
	
	public void Imprimir(ArbolGeneral<Variables>a) {
		ArbolGeneral<Variables> arbol;
		ColaGenerica<ArbolGeneral<Variables>> cola = new ColaGenerica<ArbolGeneral<Variables>>();
		cola.encolar(a);
		cola.encolar(null);
		while(! cola.esVacia()){
			arbol = cola.desencolar();
			if(arbol != null) {
				System.out.print(arbol.getDato().getLetra()+" ");
				ListaGenerica<ArbolGeneral<Variables>> hijos = arbol.getHijos();
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
