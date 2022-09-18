package Ejercicio1;

public class ArbolBinarioTest {

	public static void main(String[] args) {
		
		ArbolBinario<Character> a = new ArbolBinario<Character>('A');
        ArbolBinario<Character> b = new ArbolBinario<Character>('B');
        ArbolBinario<Character> c = new ArbolBinario<Character>('C');
        ArbolBinario<Character> d = new ArbolBinario<Character>('D');
        ArbolBinario<Character> e = new ArbolBinario<Character>('E');
        ArbolBinario<Character> f = new ArbolBinario<Character>('F');
        ArbolBinario<Character> g = new ArbolBinario<Character>('G');
        
        a.agregarHijoIzquierdo(b);
        a.agregarHijoDerecho(c);
        b.agregarHijoIzquierdo(d);
        b.agregarHijoDerecho(g);
        c.agregarHijoIzquierdo(e);
        c.agregarHijoDerecho(f);
        System.out.println(a.contarHojas());
        a.recorridoPorNiveles();
        System.out.println(a.contarHojas());
        a.espejo();
        a.recorridoPorNiveles();

	}

}
