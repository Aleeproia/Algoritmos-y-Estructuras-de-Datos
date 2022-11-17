package Ejercicio5;

import tp04.ejercicio1.ArbolGeneral;

public class MayorPromedioTest {

	public static void main(String[] args) {
		
		ArbolGeneral<AreaEmpresa> a = new ArbolGeneral<AreaEmpresa>(new AreaEmpresa("M", 5));
		
		ArbolGeneral<AreaEmpresa> izq = new ArbolGeneral<AreaEmpresa>(new AreaEmpresa("J", 13));
		ArbolGeneral<AreaEmpresa> izqIzq = new ArbolGeneral<AreaEmpresa>(new AreaEmpresa("A", 4));
		ArbolGeneral<AreaEmpresa> izqMed = new ArbolGeneral<AreaEmpresa>(new AreaEmpresa("B", 7));
		ArbolGeneral<AreaEmpresa> izqDer = new ArbolGeneral<AreaEmpresa>(new AreaEmpresa("C", 5));
		izq.agregarHijo(izqIzq);
		izq.agregarHijo(izqMed);
		izq.agregarHijo(izqDer);
		
		ArbolGeneral<AreaEmpresa> med = new ArbolGeneral<AreaEmpresa>(new AreaEmpresa("K", 25));
		ArbolGeneral<AreaEmpresa> medIzq = new ArbolGeneral<AreaEmpresa>(new AreaEmpresa("D", 6));
		ArbolGeneral<AreaEmpresa> medMed = new ArbolGeneral<AreaEmpresa>(new AreaEmpresa("E", 10));
		ArbolGeneral<AreaEmpresa> medDer = new ArbolGeneral<AreaEmpresa>(new AreaEmpresa("F", 18));
		med.agregarHijo(medIzq);
		med.agregarHijo(medMed);
		med.agregarHijo(medDer);
		
		ArbolGeneral<AreaEmpresa> der = new ArbolGeneral<AreaEmpresa>(new AreaEmpresa("L", 10));
		ArbolGeneral<AreaEmpresa> derIzq = new ArbolGeneral<AreaEmpresa>(new AreaEmpresa("G", 9));
		ArbolGeneral<AreaEmpresa> derMed = new ArbolGeneral<AreaEmpresa>(new AreaEmpresa("H", 12));
		ArbolGeneral<AreaEmpresa> derDer = new ArbolGeneral<AreaEmpresa>(new AreaEmpresa("I", 19));
		der.agregarHijo(derIzq);
		der.agregarHijo(derMed);
		der.agregarHijo(derDer);
		
		a.agregarHijo(izq);
		a.agregarHijo(med);
		a.agregarHijo(der);
		
		MayorPromedio mp = new MayorPromedio();
		
		System.out.println("el promedio mayor del arbol es: "+mp.mayorprom(a));
	}

}
