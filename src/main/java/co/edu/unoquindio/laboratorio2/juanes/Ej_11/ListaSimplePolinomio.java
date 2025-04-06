package co.edu.unoquindio.laboratorio2.juanes.Ej_11;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ListaSimplePolinomio implements Iterable<TerminoPolinomio> {

    private Nodo nodoInicial;
    private int tamanio;

    // Constructor, Gets y Sets.
    public ListaSimplePolinomio() {
        nodoInicial = null;
        tamanio = 0;
    }

    public ListaSimplePolinomio(Nodo nodoInicial) {
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
    private boolean isEmpty(){
        return tamanio <= 0;
    }

    // Añade nuevo nodo al final.
    public void add(TerminoPolinomio termino){

        Nodo nuevoNodo = new Nodo(termino);

        if(isEmpty()){
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
    public Iterator<TerminoPolinomio> iterator() {
        return new IteradorLista();
    }

    private class IteradorLista implements Iterator<TerminoPolinomio> {

        private Nodo nodoActual = nodoInicial;

        @Override
        public boolean hasNext() {
            return nodoActual != null;
        }

        @Override
        public TerminoPolinomio next() {
            if(!hasNext()){
                throw new NoSuchElementException ("No hay siguiente nodo");
            }
            TerminoPolinomio termino = nodoActual.getTermino();
            nodoActual = nodoActual.getNodoSiguiente();
            return termino;
        }
    }
}