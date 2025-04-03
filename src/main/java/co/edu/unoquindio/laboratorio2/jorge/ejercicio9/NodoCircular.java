package co.edu.unoquindio.laboratorio2.jorge.ejercicio9;

public class NodoCircular {
    private NodoCircular nodoSiguiente;
    private  int valor;

    public NodoCircular(int valor){
        this.valor = valor;
        this.nodoSiguiente = null;
    }

    public NodoCircular getNodoSiguiente() {
        return nodoSiguiente;
    }

    public void setNodoSiguiente(NodoCircular nodoSiguiente) {
        this.nodoSiguiente = nodoSiguiente;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
