package Ejercicio5;

import tp02.ejercicio2.ListaGenerica;
import tp04.ejercicio1.ArbolGeneral;
import tp04.ejercicio1.ColaGenerica;

public class MayorPromedio {
	
	public int mayorprom(ArbolGeneral<AreaEmpresa> a) {
		return recorridoPorNiveles(a);
	}
	
	
	private int recorridoPorNiveles(ArbolGeneral<AreaEmpresa> a) {
		int total=0;
		int max=-1;
		int cant_nodos=0;
		ArbolGeneral<AreaEmpresa> arbol;
		ColaGenerica<ArbolGeneral<AreaEmpresa>> cola = new ColaGenerica<ArbolGeneral<AreaEmpresa>>();
		cola.encolar(a);
		cola.encolar(null);
		while(! cola.esVacia()){
			arbol = cola.desencolar();
			if(arbol != null) {
				total+=arbol.getDato().getTardanza();
				cant_nodos+=1;
				if(arbol.tieneHijos()) {
					ListaGenerica<ArbolGeneral<AreaEmpresa>> hijos = arbol.getHijos();
					hijos.comenzar();
					while(! hijos.fin()){
						cola.encolar(hijos.proximo());
					}
				}
			}
			else
				if (! cola.esVacia()) {
					if((total / cant_nodos) > max) {
						max=total / cant_nodos; 
					}
					total = 0;
					cant_nodos=0;
					cola.encolar(null);
				}
		}
		return max;
	}
}
