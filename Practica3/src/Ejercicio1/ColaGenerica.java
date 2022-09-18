package Ejercicio1;

import Ejercicio2.ListaEnlazadaGenerica;
import Ejercicio2.ListaGenerica;

public class ColaGenerica<T>{
	private ListaGenerica<T> cola;
	
	public ColaGenerica(){
		this.cola = new ListaEnlazadaGenerica<T>();
	}
	
	public void encolar(T elem){
		this.cola.agregarFinal(elem);
	}
	
	public T desencolar(){
		T aux = this.cola.elemento(1);
		this.cola.eliminarEn(1);
		return aux;
	}
	
	public T tope(){
		return this.cola.elemento(1);
	}
	
	public boolean esVacia()
	{
		return this.cola.esVacia();
	}
}
