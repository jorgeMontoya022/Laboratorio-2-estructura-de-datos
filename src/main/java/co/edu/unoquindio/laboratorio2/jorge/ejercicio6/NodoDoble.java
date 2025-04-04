package co.edu.unoquindio.laboratorio2.jorge.ejercicio6;

public class NodoDoble {
    private int valor;
    private NodoDoble nodoSiguiente;
    private NodoDoble nodoAnterior;

    public NodoDoble(int valor){
        this.valor = valor;
        nodoSiguiente = null;
        nodoAnterior = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public NodoDoble getNodoSiguiente() {
        return nodoSiguiente;
    }

    public void setNodoSiguiente(NodoDoble nodoSiguiente) {
        this.nodoSiguiente = nodoSiguiente;
    }

    public NodoDoble getNodoAnterior() {
        return nodoAnterior;
    }

    public void setNodoAnterior(NodoDoble nodoAnterior) {
        this.nodoAnterior = nodoAnterior;
    }
}
