package co.edu.unoquindio.laboratorio2.esteban.ejercicio2;

public class Main {

    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();
        lista.add(new Persona("Juan", "123456"));
        lista.add(new Persona("Ana", "98765"));
        lista.add(new Persona("Carlos", "1234"));
        lista.add(new Persona("Sofía", "567890"));
        lista.add(new Persona("Luis", "1111"));

        System.out.println("Lista completa:");
        lista.imprimirLista();

        System.out.println("\nPersonas con cédula de longitud par:");
        ListaEnlazada filtrada = lista.cedulaPar();
        filtrada.imprimirLista();
    }
}
