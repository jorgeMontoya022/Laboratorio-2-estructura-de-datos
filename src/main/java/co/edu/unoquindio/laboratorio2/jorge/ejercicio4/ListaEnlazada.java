package co.edu.unoquindio.laboratorio2.jorge.ejercicio4;

public class ListaEnlazada {
    private Nodo nodoInicial;
    private int size;

    public ListaEnlazada() {
        this.nodoInicial = null;
        this.size = 0;
    }

    public void add(int valor) {
        Nodo nuevoNodo = new Nodo(valor);
        if (isEmpty()) {
            nodoInicial = nuevoNodo;
        } else {
            Nodo nodoAux = nodoInicial;
            while (nodoAux.getNodoSiguiente() != null) {
                nodoAux = nodoAux.getNodoSiguiente();
            }
            nodoAux.setNodoSiguiente(nuevoNodo);
        }
        size++;

    }

    public ListaEnlazada mostrarValoresImpares() {
        ListaEnlazada nuevaLista = new ListaEnlazada();
        if (isEmpty()) {
            throw new RuntimeException("la lista está vacía");
        } else {
            Nodo nodoAux = nodoInicial;
            while (nodoAux != null) {
                if (nodoAux.getValor()%2!=0){
                    nuevaLista.add(nodoAux.getValor());
                }
                nodoAux = nodoAux.getNodoSiguiente();
            }
        }
        return nuevaLista;
    }

    public void showList() {
        if (isEmpty()) {
            throw new RuntimeException("No hay elementos en la lista");
        }
        Nodo nodoActual = nodoInicial;
        while (nodoActual != null) {
            System.out.println(nodoActual.getValor());
            nodoActual = nodoActual.getNodoSiguiente();
        }
    }

    public boolean isEmpty() {
        return nodoInicial == null;
    }
}
