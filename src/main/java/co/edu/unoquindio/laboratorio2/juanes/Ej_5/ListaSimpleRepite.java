package co.edu.unoquindio.laboratorio2.juanes.Ej_5;

public class ListaSimpleRepite<T> {

    private Nodo<T> nodoInicial;
    private int tamanio;

    // Constructor, Gets y Sets.
    public ListaSimpleRepite() {
        nodoInicial = null;
        tamanio = 0;
    }

    public ListaSimpleRepite(Nodo<T> nodoInicial) {
        this.nodoInicial = nodoInicial;
    }

    public Nodo<T> getNodoInicial() {
        return nodoInicial;
    }
    public int getTamanio() {
        return tamanio;
    }
    public void setNodoInicial(Nodo<T> nodoInicial) {
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
    public void add(T elem){
        Nodo<T> nuevoNodo = new Nodo<T>(elem);
        if(isVacia()){
            nodoInicial = nuevoNodo;
        } else{
            Nodo<T> nodoAux = nodoInicial;
            while(nodoAux.getNodoSiguiente() != null){
                nodoAux = nodoAux.getNodoSiguiente();
            }
            nodoAux.setNodoSiguiente(nuevoNodo);
        }
        tamanio++;
    }
    
}