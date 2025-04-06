package co.edu.unoquindio.laboratorio2.juanes.Ej_5;

public class Nodo<T> {
    
    private T elemento;
    private Nodo<T> nodoSiguiente;
    
    public Nodo(T elemento) {
        this.elemento = elemento;
        nodoSiguiente = null;
    }

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public Nodo<T> getNodoSiguiente() {
        return nodoSiguiente;
    }

    public void setNodoSiguiente(Nodo<T> nodoSiguiente) {
        this.nodoSiguiente = nodoSiguiente;
    }

}
