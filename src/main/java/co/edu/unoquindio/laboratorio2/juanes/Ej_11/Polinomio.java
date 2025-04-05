package co.edu.unoquindio.laboratorio2.juanes.Ej_11;

// Clase polinomio que implementa la lista y pueda ser manejado por usuario. 
public class Polinomio {

    private ListaSimplePolinomio lista;

    public Polinomio() {
        this.lista = new ListaSimplePolinomio();
    }

    public void agregarTermino(double coef, double expo){
        lista.add(new TerminoPolinomio(coef, expo));
    }

    public double operarPolinomio(double x){
        double total = 0;
        for(TerminoPolinomio termino : lista){
            total += termino.operarTermino(x);
        }
        return total;
    }

    public void imprimirResultados(){
        for(double x = 0; x <= 5.0; x += 0.5){
            System.out.println("x = " + x + " --> " + "Resultado: " + operarPolinomio(x));
        }
    }
}
