package Parcial5;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp04.ejercicio1.ArbolGeneral;
import tp04.ejercicio1.ColaGenerica;

public class Parcial5 {
	
	
	
	public ListaGenerica<ListaEnlazadaGenerica<String>> caminosPares(ArbolGeneral<String>a){
		ListaGenerica<ListaEnlazadaGenerica<String>> caminos= new ListaEnlazadaGenerica<ListaEnlazadaGenerica<String>>();
		ListaEnlazadaGenerica<String>lista = new ListaEnlazadaGenerica<String>();
		recursion(a,caminos,lista);
		return caminos;
	}
	
	
	
	private void recursion(ArbolGeneral<String> a, ListaGenerica<ListaEnlazadaGenerica<String>> caminos,ListaGenerica<String>lista) {
		lista.agregarFinal(a.getDato());
		if(a.esHoja()) {
			if((lista.tamanio() % 2) == 0) {
				clonar(caminos,lista);
			}			
		}
		else{
			ListaGenerica<ArbolGeneral<String>> hijos = a.getHijos();
			hijos.comenzar();
			while(!hijos.fin()) {
				recursion(hijos.proximo(),caminos,lista);
				lista.eliminarEn(lista.tamanio());
			}
		
		}
		
	}

	private void clonar(ListaGenerica<ListaEnlazadaGenerica<String>> caminos, ListaGenerica<String> caminoActual) {

        ListaEnlazadaGenerica<String> nuevo= new ListaEnlazadaGenerica<String>();
        caminoActual.comenzar();
        while (!caminoActual.fin()){
            nuevo.agregarFinal(caminoActual.proximo());
        }
        caminos.agregarFinal(nuevo);
    }

	public void Imprimir(ArbolGeneral<String>a) {
		ArbolGeneral<String> arbol;
		ColaGenerica<ArbolGeneral<String>> cola = new ColaGenerica<ArbolGeneral<String>>();
		cola.encolar(a);
		cola.encolar(null);
		while(! cola.esVacia()){
			arbol = cola.desencolar();
			if(arbol != null) {
				System.out.print(arbol.getDato()+" ");
				ListaGenerica<ArbolGeneral<String>> hijos = arbol.getHijos();
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
