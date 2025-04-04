package co.edu.unoquindio.laboratorio2.esteban.ejercicio2;

public class ListaEnlazada {

    private Nodo nodoPrimero;

    public void add(Persona persona){
 
        Nodo nuevoNodo = new Nodo(persona);
        if (nodoPrimero == null){
            nodoPrimero = nuevoNodo;
        }
        else{
            Nodo nodoAux = nodoPrimero;
            while( nodoAux.siguiente != null){
                nodoAux = nodoAux.siguiente;
            }
            nodoAux.siguiente = nuevoNodo;
        }
    }

    public ListaEnlazada cedulaPar(){
        ListaEnlazada resultadoPares = new ListaEnlazada();
        Nodo nodoAux = nodoPrimero;
        while (nodoAux != null){
            if(nodoAux.persona.getCedula().length()%2 == 0){
                resultadoPares.add(nodoAux.persona);
            }
            nodoAux = nodoAux.siguiente;
        }
        return resultadoPares;

    }

    public void imprimirLista(){
        Nodo nodoAux = nodoPrimero;
        while (nodoAux != null) {

            System.out.println("La cedula del usuario es " + nodoAux.persona.getCedula());
            nodoAux = nodoAux.siguiente;
        }
    }
}


