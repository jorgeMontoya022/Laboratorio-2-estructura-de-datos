package co.edu.unoquindio.laboratorio2.esteban.ejercicio2;

public class Nodo {

    Persona persona;
    Nodo siguiente;

    public Nodo(Persona persona){
        this.persona = persona;

    }

    public Persona getPersona() {
        return persona;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }


}
