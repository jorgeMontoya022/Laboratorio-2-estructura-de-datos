package co.edu.unoquindio.laboratorio2.juanes.Ej_7;

public class Nodo<T> {
    
    private T elemento;
    private Nodo<T> nodoAnterior;
    private Nodo<T> nodoSiguiente;
    
    public Nodo(T elemento) {
        this.elemento = elemento;
        this.nodoAnterior = null;
        this.nodoSiguiente = null;
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

    public Nodo<T> getNodoAnterior() {
        return nodoAnterior;
    }

    public void setNodoAnterior(Nodo<T> nodoAnterior) {
        this.nodoAnterior = nodoAnterior;
    }


}
