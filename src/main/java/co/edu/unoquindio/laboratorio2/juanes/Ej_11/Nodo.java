package co.edu.unoquindio.laboratorio2.juanes.Ej_11;

public class Nodo {
    
    private TerminoPolinomio termino;
    private Nodo nodoSiguiente;

    public Nodo(TerminoPolinomio termino) {
        this.termino = termino;
    }
    
    public Nodo getNodoSiguiente() {
        return nodoSiguiente;
    }
    public void setNodoSiguiente(Nodo nodoSiguiente) {
        this.nodoSiguiente = nodoSiguiente;
    }    
    public TerminoPolinomio getTermino() {
        return termino;
    }
    public void setTermino(TerminoPolinomio termino) {
        this.termino = termino;
    }

}