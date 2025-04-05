package co.edu.unoquindio.laboratorio2.juanes.Ej_12;

public class Main {
    public static void main(String[] args) {
        
        ListaSimpleEstadis lista = new ListaSimpleEstadis();
        
        lista.add(57);
        lista.add(62);
        lista.add(48);
        lista.add(53);
        lista.add(60);
        lista.add(46);

        calcularMedia(lista);
        calcularDesviacionEstandar(lista);


    }

    // Obtener los números de los nodos impares.
    private static double media(ListaSimpleEstadis lista){

        double media = 0;
        double sumatoria = 0;

        for (Double xi : lista) {
            sumatoria += xi;
        }

        media = sumatoria / lista.getTamanio();
        return media;
    }

    private static double desviacionEstandar(ListaSimpleEstadis lista){

        double desviacionEst = 0;
        double media = media(lista);
        double sumatoria = 0;
        double varianza = 0;

        for (Double xi : lista) {
            sumatoria += Math.pow((xi-media), 2);
        }

        if(lista.getTamanio() == 1){
            varianza = sumatoria;
        }else {
            varianza = sumatoria / (lista.getTamanio() - 1);
        }

        desviacionEst = Math.sqrt(varianza);

        return desviacionEst;
    }

    public static void calcularMedia(ListaSimpleEstadis lista){
        if(!lista.isVacia()){
            System.out.println("Media de los números: " + media(lista));
        } else{
            System.out.println("La lista está vacía.");
        }
    }

    public static void calcularDesviacionEstandar(ListaSimpleEstadis lista){
        if(!lista.isVacia()){
            System.out.println("Desviación Estándar de los números: " + desviacionEstandar(lista));
        } else{
            System.out.println("La lista está vacía.");
        }
    }

}
