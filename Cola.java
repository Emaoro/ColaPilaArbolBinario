// Implementación de una cola usando lista enlazada
public class Cola {

    private Nodo inicio;
    private Nodo ultimo;

    public Cola() {
        inicio = null;
        ultimo = null;
    }

    // Inserta elemento al final
    public void insertar(int valor) {
        Nodo nuevo = new Nodo(valor);

        if (ultimo == null) {
            inicio = nuevo;
            ultimo = nuevo;
        } else {
            ultimo.siguiente = nuevo;
            ultimo = nuevo;
        }

        System.out.println("Elemento agregado a la cola.");
    }

    // Elimina los primeros elementos
    public void eliminar() {
        if (inicio == null) {
            System.out.println("La cola está vacía.");
        } else {
            System.out.println("Elemento eliminado: " + inicio.valor);
            inicio = inicio.siguiente;

            if (inicio == null) {
                ultimo = null;
            }
        }
    }

    public void mostrar() {
        Nodo auxiliar = inicio;

        if (auxiliar == null) {
            System.out.println("La cola está vacía.");
            return;
        }

        while (auxiliar != null) {
            System.out.print(auxiliar.valor + " -> ");
            auxiliar = auxiliar.siguiente;
        }
        System.out.println("null");
    }
}