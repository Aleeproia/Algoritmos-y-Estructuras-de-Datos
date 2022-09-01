package Ejercicio2;

import java.util.Scanner;


public class Contador {
	
	
	private static Scanner s;

	public static int[] cont(int n) {
		int [] vector= new int[n];
		int aux=1;
		for(int i=0;i<n;i++) {
			vector[i]=n*aux;
			aux++;
		}
		return vector;
	}

	public static void main(String[] args) {
		System.out.print("Ingrese un numero: ");
		s = new Scanner(System.in);
		int n=s.nextInt();
		int[]vec=cont(n);
		for(int i = 0; i < vec.length; i++) {
			System.out.print(vec[i]+ "; ");
		}
		

	}

}
