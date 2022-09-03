package Ejercicio1_3;

import tp02.ejercicio1.*;

public class TestListaDeEnterosEnlazada {

	public static void main(String[] args) {
		
		ListaDeEnterosEnlazada lista = new ListaDeEnterosEnlazada();
		
		lista.agregarFinal(2);
		lista.agregarFinal(4);
		lista.agregarFinal(6);
		lista.agregarFinal(7);
		
		lista.comenzar();
		while(!lista.fin()) {
			System.out.print(lista.proximo()+" ");
		}

	}

}
