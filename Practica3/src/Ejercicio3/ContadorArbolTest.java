package Ejercicio3;

import Ejercicio1.ArbolBinario;
import Ejercicio2.ListaEnlazadaGenerica;

public class ContadorArbolTest {

	public static void main(String[] args) {
		ArbolBinario<Integer> a = new ArbolBinario<Integer>(2);
        ArbolBinario<Integer> b = new ArbolBinario<Integer>(4);
        ArbolBinario<Integer> c = new ArbolBinario<Integer>(3);
        ArbolBinario<Integer> d = new ArbolBinario<Integer>(6);
        ArbolBinario<Integer> e = new ArbolBinario<Integer>(10);
        ArbolBinario<Integer> f = new ArbolBinario<Integer>(5);
        ArbolBinario<Integer> g = new ArbolBinario<Integer>(7);
        
        a.agregarHijoIzquierdo(b);
        a.agregarHijoDerecho(c);
        b.agregarHijoIzquierdo(d);
        b.agregarHijoDerecho(g);
        c.agregarHijoIzquierdo(e);
        c.agregarHijoDerecho(f);
        
        ContadorArbol cont1 = new ContadorArbol();
        ContadorArbol cont2 = new ContadorArbol();
        ContadorArbol cont3 = new ContadorArbol();
        
        ListaEnlazadaGenerica<Integer> lista1 = cont1.numerosParesPreOrden(a);
        ListaEnlazadaGenerica<Integer> lista2 = cont2.numerosParesInOrden(a);
        ListaEnlazadaGenerica<Integer> lista3 = cont3.numerosParesPostOrden(a);
        
        lista1.comenzar();
        lista2.comenzar();
        lista3.comenzar();
        
        for (int i = 1; i <= lista1.tamanio(); ++i) {
            System.out.println(lista1.elemento(i));
            System.out.println(lista2.elemento(i));
            System.out.println(lista3.elemento(i));
        }


	}

}
