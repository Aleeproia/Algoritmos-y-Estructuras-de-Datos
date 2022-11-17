package Ejercicio3;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp04.ejercicio1.ArbolGeneral;


public class RecorridosAG {
	
	public ListaGenerica<Integer> numerosImparesMayoresQuePreOrden (ArbolGeneral<Integer> a, Integer n){
		ListaGenerica<Integer> lista = new ListaEnlazadaGenerica<Integer>();
		PreOrden(a,n,lista);
		return lista;
	}
	
	
	public void PreOrden(ArbolGeneral<Integer> a,int n,ListaGenerica<Integer> lista) {
		if((a.getDato() % 2 != 0)&&(a.getDato() > n)){
			lista.agregarFinal(a.getDato());
		}
        System.out.println("Cuando entro al metodo: "+a.getDato());
        if(a.tieneHijos()){
            ListaGenerica<ArbolGeneral<Integer>> hijos = a.getHijos();
            System.out.println("asd");
            hijos.comenzar();
            while (!hijos.fin()) {
                PreOrden(hijos.proximo(),n,lista);
            	System.out.println("termina la recursion: ");
            }
            	
        }
        


    }
	
	public ListaGenerica<Integer> numerosImparesMayoresQueInOrden (ArbolGeneral<Integer> a, Integer n){
		ListaGenerica<Integer> lista = new ListaEnlazadaGenerica<Integer>();
		InOrden(a,n,lista);
		return lista;
	}
	
	private void InOrden (ArbolGeneral<Integer> a,int n,ListaGenerica<Integer> lista){
		ListaGenerica <ArbolGeneral<Integer>> hijos = a.getHijos();
		hijos.comenzar();
		if (!hijos.esVacia())
			InOrden(hijos.proximo(),n,lista);
		if((a.getDato() % 2 != 0)&&(a.getDato() > n))
			lista.agregarFinal(a.getDato());
		while (!hijos.fin() && !hijos.esVacia()) {
			InOrden(hijos.proximo(),n,lista);
		}
	}


	public ListaGenerica<Integer> PostOrden (ArbolGeneral<Integer> a, Integer n){
		ListaGenerica<Integer> lista = new ListaEnlazadaGenerica<Integer>();
		PostOrden(a,n,lista);
		return lista;
	}

	private void PostOrden (ArbolGeneral<Integer> a,int n,ListaGenerica<Integer> lista){
		if(a.tieneHijos()) {
			ListaGenerica <ArbolGeneral<Integer>> hijos = a.getHijos();
			hijos.comenzar();
			while (hijos.fin()) 
				PostOrden(a,n,lista);
		}
		if((a.getDato() % 2 != 0)&&(a.getDato() > n))
			lista.agregarFinal(a.getDato());
		
	}
	


}
