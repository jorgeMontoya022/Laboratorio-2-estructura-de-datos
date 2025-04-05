package co.edu.unoquindio.laboratorio2.juanes.Ej_7;

public class Main {
    public static void main(String[] args) {
        ListaDoble<Integer> lista = new ListaDoble<>();
        lista.addInicio(10);
        lista.addFin(20);
        lista.addFin(30);
        lista.addInicio(40);

        for (Integer num : lista) {
            System.out.println(num);
        }
    }
}
