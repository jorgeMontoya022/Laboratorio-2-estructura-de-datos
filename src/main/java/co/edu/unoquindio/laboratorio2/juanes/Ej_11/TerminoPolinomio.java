package co.edu.unoquindio.laboratorio2.juanes.Ej_11;

public class TerminoPolinomio {
    
    private Double coeficiente;
    private Double exponente;
    
    public TerminoPolinomio(double coeficiente, double exponente) {
        this.coeficiente = coeficiente;
        this.exponente = exponente;
    }

    public Double getCoeficiente() {
        return coeficiente;
    }

    public void setCoeficiente(Double coeficiente) {
        this.coeficiente = coeficiente;
    }

    public Double getExponente() {
        return exponente;
    }

    public void setExponente(Double exponente) {
        this.exponente = exponente;
    }

    public Double operarTermino(Double x){
        Double resultado = 0.0;
        resultado += coeficiente * Math.pow(x, exponente);
        return resultado;
    }

}
