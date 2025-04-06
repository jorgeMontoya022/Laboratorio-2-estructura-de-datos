package co.edu.unoquindio.laboratorio2.ejercicio13;

public class Main {

    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.add(9);
        lista.add(4);
        lista.add(6);
        lista.add(8);
        lista.add(4);
        lista.add(5);
        lista.add(4);
        lista.add(4);

        int clave = 4;
        int resultado = lista.getMaximaDistancia(clave);
        System.out.println(resultado);

    }
}
