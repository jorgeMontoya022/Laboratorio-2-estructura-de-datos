package co.edu.unoquindio.laboratorio2.jorge.ejercicio1;

public class Main {
    public static void main(String[] args) {
        SimpleList simpleList = new SimpleList();
        simpleList.add(1);
        simpleList.add(2);
        simpleList.add(3);
        simpleList.add(4);
        simpleList.add(5);
        simpleList.add(6);

        System.out.println("Lista original:");
        simpleList.showList(); // Mostrar la lista original

        // Guardar la lista de impares y mostrarla
        SimpleList impares = simpleList.obtenerImparesLista();
        System.out.println("\nLista con los valores en posiciones impares:");
        impares.showList();
    }
}
