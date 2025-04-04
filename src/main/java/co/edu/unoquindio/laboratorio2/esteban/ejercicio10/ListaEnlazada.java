package co.edu.unoquindio.laboratorio2.esteban.ejercicio10;

public class ListaEnlazada<T> {

    Nodo<T> front;

    public void add(T dato){
        Nodo <T> nuevo = new Nodo<T>(dato);
        if (front == null){
            front = nuevo;
        }
        else{
            Nodo<T> aux = front;
            while (aux.siguiente != null){
                aux = aux.siguiente;
            }
            aux.siguiente = nuevo;

        }
    }

    public void imprimirLista(){
        Nodo <T> aux = front;
        while (aux != null){
            System.out.println(aux.dato);
            aux = aux.siguiente;
        }

    }
    public static <T> ListaEnlazada<T> concatenar (ListaEnlazada<T> lista1,  ListaEnlazada<T> lista2){
        ListaEnlazada<T> resultado = new ListaEnlazada<T>();

        Nodo<T> aux = lista1.front;
        while (aux != null){
            resultado.add(aux.dato);
            aux = aux.siguiente;
        }

        aux = lista2.front;
        while(aux!= null){
            resultado.add(aux.dato);
            aux=aux.siguiente; 
               }
        resultado.imprimirLista();
        return resultado;
    }

}






