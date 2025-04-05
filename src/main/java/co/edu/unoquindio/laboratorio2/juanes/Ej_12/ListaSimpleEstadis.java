package co.edu.unoquindio.laboratorio2.juanes.Ej_12;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ListaSimpleEstadis implements Iterable<Double> {

    private Nodo nodoInicial;
    private int tamanio;

    // Constructor, Gets y Sets.
    public ListaSimpleEstadis() {
        nodoInicial = null;
        tamanio = 0;
    }

    public ListaSimpleEstadis(Nodo nodoInicial) {
        this.nodoInicial = nodoInicial;
    }

    public Nodo getNodoInicial() {
        return nodoInicial;
    }
    public int getTamanio() {
        return tamanio;
    }
    public void setNodoInicial(Nodo nodoInicial) {
        this.nodoInicial = nodoInicial;
    }
    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    // Verificar que no esté vacía.
    public boolean isVacia(){
        return tamanio <= 0;
    }

    // Añade nuevo nodo al final.
    public void add(int num){
        Nodo nuevoNodo = new Nodo(num);
        if(isVacia()){
            nodoInicial = nuevoNodo;
        } else{
            Nodo nodoAux = nodoInicial;
            while(nodoAux.getNodoSiguiente() != null){
                nodoAux = nodoAux.getNodoSiguiente();
            }
            nodoAux.setNodoSiguiente(nuevoNodo);
        }
        tamanio++;
    }

    @Override
    public Iterator<Double> iterator() {
        return new IteradorLista();
    }

    private class IteradorLista implements Iterator<Double> {

        private Nodo nodoActual = nodoInicial;

        @Override
        public boolean hasNext() {
            return nodoActual != null;
        }

        @Override
        public Double next() {
            if(!hasNext()){
                throw new NoSuchElementException ("No hay siguiente");
            }
            double num = nodoActual.getNumero();
            nodoActual = nodoActual.getNodoSiguiente();
            return num;
        }
    }

    
}