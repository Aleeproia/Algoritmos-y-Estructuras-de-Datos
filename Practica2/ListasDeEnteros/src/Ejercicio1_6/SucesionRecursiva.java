package Ejercicio1_6;


import tp02.ejercicio1.ListaDeEnterosConArreglos;

public class SucesionRecursiva {

	public ListaDeEnterosConArreglos recorrerRecursivo(int num) {
		ListaDeEnterosConArreglos listaaux = new ListaDeEnterosConArreglos();
		listaaux.comenzar();
		recursivo(listaaux,num);
		return listaaux;
	}
	
	private void recursivo(ListaDeEnterosConArreglos listaaux,int num) {
		if(num != 1) {
			listaaux.agregarFinal(num);
			if(num%2==0) {
				num=num/2;
			}
			else {
				num = (3*num)+1;
			}
			recursivo(listaaux,num);
		}
		else {
			listaaux.agregarFinal(num);
		}
	}

	public static void main(String[] args) {
		
		SucesionRecursiva s = new SucesionRecursiva();
		
		ListaDeEnterosConArreglos lista = s.recorrerRecursivo(6);
		
		lista.comenzar();
		while(!lista.fin()) {
			System.out.print(lista.proximo()+" ");
		}
		
		
	
	}
}
