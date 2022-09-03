package Ejercicio1_5;

import tp02.ejercicio1.ListaDeEnterosConArreglos;


public class RecorrerRecursivo {
	
	
	public void recorrerRecursivo(ListaDeEnterosConArreglos lista) {
		recursivo(lista,-1);
		
	}
	
	private void recursivo(ListaDeEnterosConArreglos lista,int elem) {
		if(!lista.fin()) {
			elem = lista.proximo();
			System.out.print(elem);
			recursivo(lista,elem);
		}
	}

	public static void main(String[] args) {
		ListaDeEnterosConArreglos lista = new ListaDeEnterosConArreglos();
		
		lista.agregarFinal(2);
		lista.agregarFinal(4);
		lista.agregarFinal(6);
		lista.agregarFinal(7);
		
		RecorrerRecursivo r = new RecorrerRecursivo();
		
		r.recorrerRecursivo(lista);
		
	}

}
