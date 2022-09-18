package Ejercicio4;

import Ejercicio1.ArbolBinario;

public class RedBinariaLlena {

	public int retardoReenvio(final ArbolBinario<Integer> ab) {
        return this.retardoReenvioo(ab);
    }
    
    private int retardoReenvioo(final ArbolBinario<Integer> arbol) {
        int cantIzq = 0;
        int cantDer = 0;
        int max = -1;
        if (arbol.esHoja()) {
            return arbol.getDato();
        }
        if (arbol.tieneHijoIzquierdo()) {
            cantIzq = this.retardoReenvioo(arbol.getHijoIzquierdo());
        }
        if (arbol.tieneHijoDerecho()) {
            cantDer = this.retardoReenvioo(arbol.getHijoDerecho());
        }
        max = Math.max(cantIzq, cantDer);
        return arbol.getDato() + max;
    }
}
