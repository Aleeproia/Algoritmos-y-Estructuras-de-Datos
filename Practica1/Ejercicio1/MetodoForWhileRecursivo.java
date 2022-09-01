package Ejercicio1;



public class MetodoForWhileRecursivo {
	
	
	public static void BucleFor(int num1,int num2) {
		for(int i=num1;i <= num2;i++) {
			System.out.println(i);
		}
		
	}
	public static void BucleWhile(int num1,int num2) {
		while(num1 <= num2) {
			System.out.println(num1);
			num1++;
		}
	}
	public static void Recursivo(int num1,int num2) {
		if(num1 <= num2) {
			System.out.println(num1);
			num1++;
			Recursivo(num1,num2);
		}
		
	}

	public static void main(String[] args) {
		
		System.out.println("--------------");
		BucleFor(5,11);
		System.out.println("--------------");
		BucleWhile(5,11);
		System.out.println("--------------");
		Recursivo(5,11);

	}

}
