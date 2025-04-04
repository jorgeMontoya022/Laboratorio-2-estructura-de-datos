package co.edu.unoquindio.laboratorio2.esteban.ejercicio3;

public class ListaEnlazada {

    private Nodo front;

    public void add(int dato){
        Nodo nodo = new Nodo (dato);
        if (front == null){
            front = nodo;
        }else{
            Nodo aux = front;
            while (aux.siguiente != null){
                aux = aux.siguiente;
            }
            aux.siguiente = nodo;
        }
    }

    public void eliminarPares(){

        while (front != null && front.dato % 2 == 0) {
           front = front.siguiente;
        }
        if(front == null) return;
        Nodo aux = front;
        while (aux.siguiente !=null){
            if(aux.siguiente.dato % 2 == 0){
                aux.siguiente = aux.siguiente.siguiente;
            }
            else{
                aux = aux.siguiente;
            }
        }
        }



        public void imprimirLista() {
            Nodo aux = front;
            while (aux != null) {
                System.out.print("El número es "+ aux.getDato() + "\n");
                aux = aux.siguiente;
            }
        }
    }


