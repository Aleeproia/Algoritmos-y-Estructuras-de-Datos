package Ejercicio5;

import Ejercicio1.ArbolBinario;
import Ejercicio1.ColaGenerica;

public class ProfundidadDeArbolBinario {

	public int sumaElementosProfundidad(final ArbolBinario<Integer> ab, final int profundidad) {
        final int suma = 0;
        return this.calcularsuma(ab, suma, profundidad);
    }
    
    private int calcularsuma(final ArbolBinario<Integer> ab, int suma, final int profundidad) {
        ArbolBinario<Integer> arbol = null;
        ColaGenerica<ArbolBinario<Integer>> cola = new ColaGenerica<ArbolBinario<Integer>>();
        int nivel = 0;
        cola.encolar(ab);
        cola.encolar(null);
        while (!cola.esVacia() && nivel <= profundidad) {
            arbol = cola.desencolar();
            if (arbol != null) {
                if (nivel == profundidad) {
                    suma += arbol.getDato();
                }
                if (arbol.tieneHijoIzquierdo()) {
                    cola.encolar(arbol.getHijoIzquierdo());
                }
                if (!arbol.tieneHijoDerecho()) {
                    continue;
                }
                cola.encolar(arbol.getHijoDerecho());
            }
            else {
                if (cola.esVacia()) {
                    continue;
                }
                ++nivel;
                cola.encolar(null);
            }
        }
        return suma;
    }
}
