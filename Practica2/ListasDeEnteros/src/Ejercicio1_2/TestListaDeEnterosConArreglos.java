package Ejercicio1_2;

import tp02.ejercicio1.*;

public class TestListaDeEnterosConArreglos {
	
	
	public static void main(String[] args) {
		
		ListaDeEnterosConArreglos lista = new ListaDeEnterosConArreglos();
		
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
