package co.edu.unoquindio.laboratorio2.jorge.ejercicio1;

public class Nodo{
    private int dato;
    private Nodo nodoSiguiente;

    public Nodo(int dato) {
        this.nodoSiguiente = null;
        this.dato = dato;
    }

    public int getDato(){
        return dato;
    }

    public Nodo getNodoSiguiente() {
        return nodoSiguiente;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public void setNodoSiguiente(Nodo nodoSiguiente) {
        this.nodoSiguiente = nodoSiguiente;
    }
}
