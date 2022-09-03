package Ejercicio2_3;

import tp02.ejercicio2.ListaEnlazadaGenerica;

public class TestListaEnlazadaGenerica {

	public static void main(String[] args) {
		ListaEnlazadaGenerica<Estudiante> lista= new ListaEnlazadaGenerica<Estudiante>();
		
		Estudiante est1 = new Estudiante("Alejandro","Proia","1b","alejandro@hotmail.com","2342");
		Estudiante est2 = new Estudiante("Ova","Proia","2b","Ova@hotmail.com","234213");
		Estudiante est3 = new Estudiante("Juli","Proia","3b","Juli@hotmail.com","234242");
		Estudiante est4 = new Estudiante("Matias","Gomez","4b","Matias@hotmail.com","234253");
		
		lista.agregarFinal(est1);
		lista.agregarFinal(est2);
		lista.agregarFinal(est3);
		lista.agregarFinal(est4);
		
		while(!lista.fin()) {
			System.out.println(lista.proximo().tusDatos());
		}

	}

}
