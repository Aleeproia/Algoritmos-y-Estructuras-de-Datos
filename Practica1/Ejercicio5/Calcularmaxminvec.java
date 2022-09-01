package Ejercicio5;

public class Calcularmaxminvec {
	
	private static int max;
	private static int min;
	private static int prom;
	private static int sumaTotal;
	
	
	public static maxminprom calcular1(int[]vector) {
		int maximo=-1;
		int minimo=999;
		int promedio=0;
		int suma=0;
		maxminprom aux = new maxminprom();
		for(int i=0;i<vector.length;i++) {
			if(vector[i]> maximo) {
				maximo=vector[i];
			}
			if(vector[i]< minimo) {
				minimo=vector[i];
			}
			suma+=vector[i];
		}
		promedio=suma/vector.length;
		aux.setMax(maximo);
		aux.setMin(minimo);
		aux.setProm(promedio);
		return aux;
	}
	
	public static void calcular2(int[]vector,maxminprom mmp) {
		int maximo=-1;
		int minimo=999;
		int promedio=0;
		int suma=0;
		for(int i=0;i<vector.length;i++) {
			if(vector[i]> maximo) {
				maximo=vector[i];
			}
			if(vector[i]< minimo) {
				minimo=vector[i];
			}
			suma+=vector[i];
		}
		promedio=suma/vector.length;
		mmp.setMax(maximo);
		mmp.setMin(minimo);
		mmp.setProm(promedio);
	}
	
	public static void calcular3(int[]vector) {
		int maximo=-1;
		int minimo=999;
		int promedio=0;
		int suma=0;
		for(int i=0;i<vector.length;i++) {
			if(vector[i]> maximo) {
				maximo=vector[i];
			}
			if(vector[i]< minimo) {
				minimo=vector[i];
			}
			suma+=vector[i];
		}
		promedio=suma/vector.length;
		Calcularmaxminvec.setMax(maximo);
		Calcularmaxminvec.setMin(minimo);
		Calcularmaxminvec.setProm(promedio);;
	}
	


	public static int getMax() {
		return max;
	}

	public static void setMax(int max) {
		Calcularmaxminvec.max = max;
	}

	public static int getMin() {
		return min;
	}

	public static void setMin(int min) {
		Calcularmaxminvec.min = min;
	}

	public static int getProm() {
		return prom;
	}

	public static void setProm(int prom) {
		Calcularmaxminvec.prom = prom;
	}

	public static int getSumaTotal() {
		return sumaTotal;
	}

	public static void setSumaTotal(int sumaTotal) {
		Calcularmaxminvec.sumaTotal = sumaTotal;
	}
	
	
	public static void main(String[] args) {
		int[] vector = {5,10,4,33,25};
		
		maxminprom mmp1=calcular1(vector);
		
		System.out.println(mmp1.getMax());
		System.out.println(mmp1.getMin());
		System.out.println(mmp1.getProm());
		
		maxminprom mmp = new maxminprom();
		int[] vector2 = {5,10,3,44,25};
		
		calcular2(vector2,mmp);
		
		System.out.println(mmp.getMax());
		System.out.println(mmp.getMin());
		System.out.println(mmp.getProm());
		
		int[] vector3 = {5,10,1,99,25};
		calcular3(vector3);
		
		System.out.println(Calcularmaxminvec.max);
		System.out.println(Calcularmaxminvec.min);
		System.out.println(Calcularmaxminvec.prom);
	}

}
