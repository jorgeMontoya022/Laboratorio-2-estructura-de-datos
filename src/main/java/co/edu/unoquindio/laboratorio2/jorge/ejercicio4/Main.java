package co.edu.unoquindio.laboratorio2.jorge.ejercicio4;

public class Main {
    public static void main(String[] args) {
        ListaEnlazada listaEnlazada = new ListaEnlazada();
        listaEnlazada.add(3);
        listaEnlazada.add(4);
        listaEnlazada.add(6);
        listaEnlazada.add(8);
        listaEnlazada.add(9);

        System.out.println("Lista original");
        listaEnlazada.showList();

        System.out.println("\nImpares");
        ListaEnlazada impares = listaEnlazada.mostrarValoresImpares();
        impares.showList();


    }
}
