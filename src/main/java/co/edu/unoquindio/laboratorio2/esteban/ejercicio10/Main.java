package co.edu.unoquindio.laboratorio2.esteban.ejercicio10;

public class Main {

    public static void main(String[] args) {
        ListaEnlazada<Integer> lista1 = new ListaEnlazada<Integer>();
        ListaEnlazada<Integer> lista2 = new ListaEnlazada<Integer>();

        lista1.add(2);
        lista1.add(3);
        lista2.add(5);
        lista2.add(6);

        ListaEnlazada.concatenar(lista1, lista2);
    }
}

