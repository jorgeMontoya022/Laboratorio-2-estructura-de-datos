package co.edu.unoquindio.laboratorio2.jorge.ejercicio9;

public class CircularList {
    private NodoCircular nodoInicial;
    private int size;

    public CircularList() {
        this.nodoInicial = null;
        this.size = 0;
    }

    public void add(int valor) {
        NodoCircular nuevoNodo = new NodoCircular(valor);
        if (isEmpty()) {
            nodoInicial = nuevoNodo;
            nodoInicial.setNodoSiguiente(nodoInicial); // Apunta a sí mismo
        } else {
            NodoCircular nodoAux = nodoInicial;
            while (nodoAux.getNodoSiguiente() != nodoInicial) { // Busca el último nodo
                nodoAux = nodoAux.getNodoSiguiente();
            }
            nodoAux.setNodoSiguiente(nuevoNodo);
            nuevoNodo.setNodoSiguiente(nodoInicial); // Cierra el ciclo
        }
        size++;
    }


    public void insert(int valor, int posicion) {
        if (posicion < 0 || posicion > size) {
            throw new IndexOutOfBoundsException("Posición fuera de rango");
        }

        NodoCircular nuevoNodo = new NodoCircular(valor);

        if (posicion == 0) {
            // Insertar al inicio
            if (isEmpty()) {
                nodoInicial = nuevoNodo;
                nodoInicial.setNodoSiguiente(nodoInicial); // Cierra el ciclo
            } else {
                NodoCircular nodoAux = nodoInicial;
                while (nodoAux.getNodoSiguiente() != nodoInicial) {
                    nodoAux = nodoAux.getNodoSiguiente();
                }
                nuevoNodo.setNodoSiguiente(nodoInicial);
                nodoAux.setNodoSiguiente(nuevoNodo);
                nodoInicial = nuevoNodo; // Actualiza el nuevo inicio
            }
        } else {
            // Insertar en cualquier otra posición
            NodoCircular nodoAux = nodoInicial;
            for (int i = 0; i < posicion - 1; i++) {
                nodoAux = nodoAux.getNodoSiguiente();
            }
            nuevoNodo.setNodoSiguiente(nodoAux.getNodoSiguiente());
            nodoAux.setNodoSiguiente(nuevoNodo);
        }

        size++;
    }


    public void showList() {
        if (isEmpty()) {
            throw new RuntimeException("La lista está vacía");
        } else {
            NodoCircular nodoActual = nodoInicial;
            System.out.print(nodoActual.getValor() + " → "); // Imprimir el primer nodo

            nodoActual = nodoActual.getNodoSiguiente();
            while (nodoActual != nodoInicial) { // Recorre hasta volver al inicio
                System.out.print(nodoActual.getValor() + " → ");
                nodoActual = nodoActual.getNodoSiguiente();
            }
            System.out.println("(inicio)");
        }
    }


    public boolean buscar(int valor) {
        if (isEmpty()) {
            return false;
        }
        NodoCircular nodoActual = nodoInicial;
        do {
            if (nodoActual.getValor() == valor) {
                return true;
            }
            nodoActual = nodoActual.getNodoSiguiente();
        } while (nodoActual != nodoInicial); // Evita un bucle infinito

        return false;
    }



    public boolean isEmpty() {
        return nodoInicial == null;
    }

    public int getSize() {
        return size;
    }
}
