package Ejercicio5;

import Ejercicio1.ArbolBinario;

public class ProfundidadDeArbolBinarioTest {

	public static void main(String[] args) {
		
		ArbolBinario<Integer> a = new ArbolBinario<Integer>(3);
        ArbolBinario<Integer> b = new ArbolBinario<Integer>(5);
        ArbolBinario<Integer> c = new ArbolBinario<Integer>(3);
        ArbolBinario<Integer> d = new ArbolBinario<Integer>(6);
        ArbolBinario<Integer> e = new ArbolBinario<Integer>(10);
        ArbolBinario<Integer> f = new ArbolBinario<Integer>(5);
        ArbolBinario<Integer> g = new ArbolBinario<Integer>(7);
        ArbolBinario<Integer> h = new ArbolBinario<Integer>(8);
        
        a.agregarHijoIzquierdo(b);
        a.agregarHijoDerecho(c);
        b.agregarHijoIzquierdo(d);
        b.agregarHijoDerecho(g);
        c.agregarHijoIzquierdo(e);
        c.agregarHijoDerecho(f);
        d.agregarHijoIzquierdo(h);
        a.recorridoPorNiveles();
        final ProfundidadDeArbolBinario p = new ProfundidadDeArbolBinario();
        System.out.println();
        System.out.println(" La suma de dicha profunidad es : " + p.sumaElementosProfundidad(a, 1));

	}

}
