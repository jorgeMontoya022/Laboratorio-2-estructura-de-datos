package co.edu.unoquindio.laboratorio2.ejercicio13;

public class Lista {

    Nodo front;

    public void add(int dato){
        Nodo nodo = new Nodo (dato);
        if (front == null){
            front = nodo;
        }else{
            Nodo aux = front;
            while (aux.next != null){
                aux = aux.next;
            }
            aux.next = nodo;
        }
    }

    public int getMaximaDistancia(int clave){
        return maximaDistancia(front, clave, 0, -1, 0);
    }

    private int maximaDistancia(Nodo front, int clave, int posicion, int primerPosicion, int maximaDistancia){
        if (front== null){
            return maximaDistancia;
        }

        if(front.dato == clave){
            if(primerPosicion == -1){
                primerPosicion = posicion;
            }else{
               int distancia = posicion - primerPosicion;
               if(distancia> maximaDistancia){
                maximaDistancia = distancia;
               } primerPosicion = posicion; 
            }
        } return maximaDistancia(front.next, clave, posicion+1, primerPosicion, maximaDistancia);



    }
}
