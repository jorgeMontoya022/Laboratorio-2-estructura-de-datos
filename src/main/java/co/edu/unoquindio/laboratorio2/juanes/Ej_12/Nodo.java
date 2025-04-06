package co.edu.unoquindio.laboratorio2.juanes.Ej_12;

public class Nodo {
    
    private double numero;
    private Nodo nodoSiguiente;
    
    public Nodo(double numero) {
        this.numero = numero;
        nodoSiguiente = null;
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public Nodo getNodoSiguiente() {
        return nodoSiguiente;
    }

    public void setNodoSiguiente(Nodo nodoSiguiente) {
        this.nodoSiguiente = nodoSiguiente;
    }


}
