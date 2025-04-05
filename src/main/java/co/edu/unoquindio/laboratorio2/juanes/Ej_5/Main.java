package co.edu.unoquindio.laboratorio2.juanes.Ej_5;

public class Main {
    public static void main(String[] args) {

        ListaSimpleRepite lista = new ListaSimpleRepite();
        

        lista.add(5.0);
        lista.add(5.0);
        lista.add(53);
        lista.add(53);
        lista.add(false);
        lista.add("E");

        imprimirOcurrenciaElemento(lista, 53);


    }

    // Obtener la cantidad de veces que se repite un elemento.
    private static <T> int obtenerOcurrenciasElemento(ListaSimpleRepite lista, T elemento){

        int cantidad = 0;
        
        if(!lista.isVacia()){
            
            Nodo<T> nodoAux = lista.getNodoInicial();

            while (nodoAux != null) {
                if(nodoAux.getElemento().equals(elemento)){
                    cantidad++;
                }
                nodoAux = nodoAux.getNodoSiguiente();
            }

            return cantidad;

        }else{
            return cantidad;
        }
        
    }

    public static <T> void imprimirOcurrenciaElemento(ListaSimpleRepite lista, T elemento){
        
        int ocurrencia = obtenerOcurrenciasElemento(lista, elemento);
        if(ocurrencia == 1){
            System.out.println("El valor aparece un total de: " + ocurrencia + " vez.");
        } else{
            System.out.println("El valor aparece un total de: " + ocurrencia + " veces.");
        }
    }


}