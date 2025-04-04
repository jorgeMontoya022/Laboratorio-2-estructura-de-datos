package co.edu.unoquindio.laboratorio2.jorge.ejercicio1;

public class SimpleList {
    private int size;
    private Nodo nodoInicial;

    public SimpleList() {
        this.size = 0;
        this.nodoInicial = null;
    }

    public void add(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        if (isEmpty()) {
            nodoInicial = nuevoNodo;
        } else {
            Nodo nodoActual = nodoInicial;
            while (nodoActual.getNodoSiguiente() != null) {
                nodoActual = nodoActual.getNodoSiguiente();
            }
            nodoActual.setNodoSiguiente(nuevoNodo);
        }
        size++;

    }

    public SimpleList obtenerImparesLista() {
        SimpleList nuevaLista = new SimpleList();
        Nodo nodoActual = nodoInicial;
        int index = 0;
        while (nodoActual != null) {
            if (index % 2 != 0) {
                nuevaLista.add(nodoActual.getDato());

            }
            nodoActual = nodoActual.getNodoSiguiente();
            index++;

        }
        return nuevaLista;
    }

    public void showList() {
        if (isEmpty()) {
            throw new RuntimeException("No hay elementos en la lista");
        }
        Nodo nodoActual = nodoInicial;
        while (nodoActual != null) {
            System.out.println(nodoActual.getDato());
            nodoActual = nodoActual.getNodoSiguiente();
        }
    }

    public boolean isEmpty() {
        return nodoInicial == null;
    }

}
