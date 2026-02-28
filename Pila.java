// Implementación básica de una pila usando lista enlazada
public class Pila {

    private Nodo cima;

    public Pila() {
        cima = null;
    }

    // Agrega elemento en la cima
    public void push(int valor) {
        Nodo nuevo = new Nodo(valor);
        nuevo.siguiente = cima;
        cima = nuevo;
        System.out.println("Elemento agregado a la pila.");
    }

    // Elimina el elemento superior
    public void pop() {
        if (cima == null) {
            System.out.println("La pila está vacía.");
        } else {
            System.out.println("Elemento eliminado: " + cima.valor);
            cima = cima.siguiente;
        }
    }


    public void mostrar() {
        Nodo auxiliar = cima;

        if (auxiliar == null) {
            System.out.println("La pila está vacía.");
            return;
        }

        while (auxiliar != null) {
            System.out.print(auxiliar.valor + " -> ");
            auxiliar = auxiliar.siguiente;
        }
        System.out.println("null");
    }
}