package Ejercicio3;

import Ejercicio1.ArbolBinario;
import Ejercicio2.ListaEnlazadaGenerica;

public class ContadorArbol
{
    ListaEnlazadaGenerica<Integer> lista;
    
    public ContadorArbol() {
        this.lista = new ListaEnlazadaGenerica<Integer>();
    }
    
    public ListaEnlazadaGenerica<Integer> numerosParesPreOrden(final ArbolBinario<Integer> a) {
        if (a.getDato() % 2 == 0) {
            this.lista.agregarFinal(a.getDato());
        }
        if (a.tieneHijoIzquierdo()) {
            this.numerosParesPreOrden(a.getHijoIzquierdo());
        }
        if (a.tieneHijoDerecho()) {
            this.numerosParesPreOrden(a.getHijoDerecho());
        }
        return this.lista;
    }
    
    public ListaEnlazadaGenerica<Integer> numerosParesInOrden(final ArbolBinario<Integer> a) {
        if (a.tieneHijoIzquierdo()) {
            this.numerosParesInOrden(a.getHijoIzquierdo());
        }
        if (a.getDato() % 2 == 0) {
            this.lista.agregarFinal(a.getDato());
        }
        if (a.tieneHijoDerecho()) {
            this.numerosParesInOrden(a.getHijoDerecho());
        }
        return this.lista;
    }
    
    public ListaEnlazadaGenerica<Integer> numerosParesPostOrden(final ArbolBinario<Integer> a) {
        if (a.tieneHijoIzquierdo()) {
            this.numerosParesPostOrden(a.getHijoIzquierdo());
        }
        if (a.tieneHijoDerecho()) {
            this.numerosParesPostOrden(a.getHijoDerecho());
        }
        if (a.getDato() % 2 == 0) {
            this.lista.agregarFinal(a.getDato());
        }
        return this.lista;
    }
}
