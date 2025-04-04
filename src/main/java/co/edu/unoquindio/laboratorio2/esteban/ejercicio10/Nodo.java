package co.edu.unoquindio.laboratorio2.esteban.ejercicio10;

public class Nodo<T> {

    T dato;
    Nodo<T> siguiente;

    public Nodo(T dato){
        this.dato = dato;

    }

    public T getDato() {
        return dato;
    }

    public Nodo<T> getSiguiente() {
        return siguiente;
    }

}
