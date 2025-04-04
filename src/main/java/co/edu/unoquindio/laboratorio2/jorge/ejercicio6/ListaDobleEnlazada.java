package co.edu.unoquindio.laboratorio2.jorge.ejercicio6;

public class ListaDobleEnlazada {
    private NodoDoble nodoInicial;
    private int size;

    public ListaDobleEnlazada() {
        this.nodoInicial = null;
        this.size = 0;

    }

    public void add(int valor) {
        NodoDoble nuevoNodo = new NodoDoble(valor);
        if (isEmpty()) {
            nodoInicial = nuevoNodo;
        } else {
            NodoDoble nodoActual = nodoInicial;
            while (nodoActual.getNodoSiguiente() != null) {
                nodoActual = nodoActual.getNodoSiguiente();
            }
            nodoActual.setNodoSiguiente(nuevoNodo);
            nuevoNodo.setNodoAnterior(nodoActual);
        }
        size++;
    }

    public void showList() {
        if (isEmpty()) {
            throw new RuntimeException("La lista está vacía");
        } else {
            NodoDoble nodoActual = nodoInicial;
            while (nodoActual != null) {
                System.out.println(nodoActual.getValor() + " ⇄ ");
                nodoActual = nodoActual.getNodoSiguiente();
            }
        }
    }

    public void imprimirHaciaAtras() {
        if (isEmpty()) {
            throw new RuntimeException("La lista está vacía");
        } else {
            NodoDoble nodoActual = nodoInicial;
            while (nodoActual.getNodoSiguiente() != null) {
                nodoActual = nodoActual.getNodoSiguiente();
            }
            while (nodoActual != null) {
                System.out.println(nodoActual.getValor() + " ⇄ ");
                nodoActual = nodoActual.getNodoAnterior();
            }
        }
    }


    public boolean isEmpty() {
        return nodoInicial == null;
    }

    public int getSize() {
        return size;
    }
}
