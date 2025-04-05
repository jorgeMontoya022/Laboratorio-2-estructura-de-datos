package co.edu.unoquindio.laboratorio2.juanes.Ej_11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Polinomio polinomio = new Polinomio();

        System.out.println("Ingresa los términos del polinomio (Ingresa coeficiente 0 para finalizar):");

        while (true) {
            
            System.out.print("Coeficiente: ");
            double coef = sc.nextDouble();
            if (coef == 0) {
                break;
            }

            System.out.print("Exponente: ");
            double exp = sc.nextDouble();

            polinomio.agregarTermino(coef, exp);
        }

        System.out.println("\nLista de resultados del polinomio (con x de 0.0 a 5.0):");
        polinomio.imprimirResultados();

        sc.close();
    }
}
