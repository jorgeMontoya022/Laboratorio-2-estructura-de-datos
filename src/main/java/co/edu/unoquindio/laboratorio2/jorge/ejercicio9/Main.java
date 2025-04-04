package co.edu.unoquindio.laboratorio2.jorge.ejercicio9;

public class Main {
    public static void main(String[] args) {
        CircularList lista = new CircularList();
        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.add(40);

        System.out.println("Lista Circular Original:");
        lista.showList();

        // Insertar en diferentes posiciones
        lista.insert(5, 0);  // Insertar al inicio
        lista.insert(25, 3); // Insertar en medio
        lista.insert(50, 6); // Insertar al final

        System.out.println("\nLista después de las inserciones:");
        lista.showList();

        // Buscar elementos
        System.out.println("\n¿Está el 25 en la lista? " + lista.buscar(25)); // true
        System.out.println("¿Está el 100 en la lista? " + lista.buscar(100)); // false
    }

}
