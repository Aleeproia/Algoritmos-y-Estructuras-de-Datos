package Ejercicio1;

public class ArbolBinario<T>
{
    private T dato;
    private ArbolBinario<T> hijoIzquierdo;
    private ArbolBinario<T> hijoDerecho;
    
    public ArbolBinario() {
    }
    
    public ArbolBinario(final T dato) {
        this.dato = dato;
    }
    
    public T getDato() {
        return this.dato;
    }
    
    public void setDato(final T dato) {
        this.dato = dato;
    }
    
    public ArbolBinario<T> getHijoIzquierdo() {
        return this.hijoIzquierdo;
    }
    
    public ArbolBinario<T> getHijoDerecho() {
        return this.hijoDerecho;
    }
    
    public void agregarHijoIzquierdo(final ArbolBinario<T> hijo) {
        this.hijoIzquierdo = hijo;
    }
    
    public void agregarHijoDerecho(final ArbolBinario<T> hijo) {
        this.hijoDerecho = hijo;
    }
    
    public void eliminarHijoIzquierdo() {
        this.hijoIzquierdo = null;
    }
    
    public void eliminarHijoDerecho() {
        this.hijoDerecho = null;
    }
    
    public boolean esVacio() {
        return this.getDato() == null && !this.tieneHijoIzquierdo() && !this.tieneHijoDerecho();
    }
    
    public boolean esHoja() {
        return !this.tieneHijoIzquierdo() && !this.tieneHijoDerecho();
    }
    
    @Override
    public String toString() {
        return this.getDato().toString();
    }
    
    public boolean tieneHijoIzquierdo() {
        return this.hijoIzquierdo != null;
    }
    
    public boolean tieneHijoDerecho() {
        return this.hijoDerecho != null;
    }
    
    public int contarHojas() {
        int cant = 0;
        if (this.esHoja()) {
            ++cant;
        }
        if (this.tieneHijoIzquierdo()) {
            cant += this.getHijoIzquierdo().contarHojas();
        }
        if (this.tieneHijoDerecho()) {
            cant += this.getHijoDerecho().contarHojas();
        }
        return cant;
    }
    
    public ArbolBinario<T> espejo() {
        if (this.esHoja()) {
            return this;
        }
        final ArbolBinario<T> aux = this.hijoIzquierdo;
        this.agregarHijoIzquierdo(this.hijoDerecho);
        this.agregarHijoDerecho(aux);
        if (this.tieneHijoIzquierdo()) {
            this.getHijoIzquierdo().espejo();
        }
        if (this.tieneHijoDerecho()) {
            this.getHijoDerecho().espejo();
        }
        return aux;
    }
    
    public void entreNiveles(int n, int m) {
		ArbolBinario<T> arbol = null;
		ColaGenerica<ArbolBinario<T>> cola = new ColaGenerica<ArbolBinario<T>>();
		int nivel = 0;
		cola.encolar(this);
		cola.encolar(null);
		while (! cola.esVacia() && nivel <= m) {
			arbol = cola.desencolar();
			if (arbol != null) {
				if (nivel >= n)
					System.out.print(arbol.getDato() + " ");
				if (arbol.tieneHijoIzquierdo())
					cola.encolar(arbol.getHijoIzquierdo());
				if (arbol.tieneHijoDerecho())
					cola.encolar(arbol.getHijoDerecho());
			} else if (!cola.esVacia()) {
				System.out.println();
				nivel++;
				cola.encolar(null);
			}
		}
	}
    
    public void recorridoPorNiveles() {
		ArbolBinario<T> arbol = null;
		ColaGenerica<ArbolBinario<T>> cola = new ColaGenerica<ArbolBinario<T>>();
		cola.encolar(this);
		cola.encolar(null);
		while (! cola.esVacia()) {
			arbol = cola.desencolar();
			if (arbol != null) {
				System.out.print(arbol.getDato() + " ");
				if (arbol.tieneHijoIzquierdo())
					cola.encolar(arbol.getHijoIzquierdo());
				if (arbol.tieneHijoDerecho())
					cola.encolar(arbol.getHijoDerecho());
			} else if (! cola.esVacia()) {
				System.out.println();
				cola.encolar(null);
			}
		}
	}
}
