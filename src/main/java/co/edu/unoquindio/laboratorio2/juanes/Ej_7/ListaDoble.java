package co.edu.unoquindio.laboratorio2.juanes.Ej_7;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ListaDoble<T> implements Iterable<T>{

    private Nodo<T> nodoInicial;
    private Nodo<T> nodoFinal;
    private int tamanio;

    // Constructor, Gets y Sets.
    public ListaDoble() {
        nodoInicial = null;
        nodoFinal = null;
        tamanio = 0;
    }

    public Nodo<T> getNodoInicial() {
        return nodoInicial;
    }
    public void setNodoInicial(Nodo<T> nodoInicial) {
        this.nodoInicial = nodoInicial;
    }
    public Nodo<T> getNodoFinal() {
        return nodoFinal;
    }
    public void setNodoFinal(Nodo<T> nodoFinal) {
        this.nodoFinal = nodoFinal;
    }
    public int getTamanio() {
        return tamanio;
    }
    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }


    // Verificar que no esté vacía.
    private boolean isVacia(){
        return tamanio <= 0;
    }

    // Añade nuevo nodo al inicio.
    public void addInicio(T elem){
        Nodo<T> nuevoNodo = new Nodo<T>(elem);
        if(isVacia()){
            nodoInicial = nuevoNodo;
            nodoFinal = nuevoNodo;
        } else{
            nodoInicial.setNodoAnterior(nuevoNodo);
            nuevoNodo.setNodoSiguiente(nodoInicial);
            nodoInicial = nuevoNodo;
        }
        tamanio++;
    }

    // Añade nuevo nodo al final.
    public void addFin(T elem){
        Nodo<T> nuevoNodo = new Nodo<T>(elem);
        if(isVacia()){
            nodoInicial = nuevoNodo;
            nodoFinal = nuevoNodo;
        } else{
            nodoFinal.setNodoSiguiente(nuevoNodo);
            nuevoNodo.setNodoAnterior(nodoFinal);
            nodoFinal = nuevoNodo;
        }
        tamanio++;
    }

    @Override
    public Iterator<T> iterator() {
        return new IteradorLista();
    }

    private class IteradorLista implements Iterator<T> {

        private Nodo<T> nodoActual = nodoInicial;

        @Override
        public boolean hasNext() {
            return nodoActual != null;
        }

        @Override
        public T next() {
            if(!hasNext()){
                throw new NoSuchElementException ("No hay siguiente");
            }
            T elemento = nodoActual.getElemento();
            nodoActual = nodoActual.getNodoSiguiente();
            return elemento;
        }
    }

}