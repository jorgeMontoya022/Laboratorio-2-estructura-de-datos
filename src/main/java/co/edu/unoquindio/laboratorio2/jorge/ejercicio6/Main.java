package co.edu.unoquindio.laboratorio2.jorge.ejercicio6;

public class Main {
    public static void main(String[] args) {
        ListaDobleEnlazada lista = new ListaDobleEnlazada();
        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.add(40);

        System.out.println("Recorriendo la lista hacia adelante:");
        lista.showList();

        System.out.println("\nRecorriendo la lista hacia atrás:");
        lista.imprimirHaciaAtras();
    }

}
