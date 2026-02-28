import java.util.Scanner;

// Árbol binario que se construye desde la raíz preguntando por hijos
public class ArbolBinario {

    NodoArbol raiz;
    Scanner sc = new Scanner(System.in);

    // Método para crear el árbol desde la raíz
    public void crearArbol() {
        System.out.print("Ingrese el valor de la raíz: ");
        int valor = sc.nextInt();
        raiz = new NodoArbol(valor);
        agregarHijos(raiz);
    }

    // Método recursivo para agregar hijos
    private void agregarHijos(NodoArbol nodo) {

        System.out.print("¿Desea agregar hijo izquierdo a " + nodo.valor + "? (1=Si, 0=No): ");
        int opcion = sc.nextInt();

        if (opcion == 1) {
            System.out.print("Ingrese valor del hijo izquierdo: ");
            int valorIzq = sc.nextInt();
            nodo.izquierdo = new NodoArbol(valorIzq);
            agregarHijos(nodo.izquierdo);
        }

        System.out.print("¿Desea agregar hijo derecho a " + nodo.valor + "? (1=Si, 0=No): ");
        opcion = sc.nextInt();

        if (opcion == 1) {
            System.out.print("Ingrese valor del hijo derecho: ");
            int valorDer = sc.nextInt();
            nodo.derecho = new NodoArbol(valorDer);
            agregarHijos(nodo.derecho);
        }
    }

    // Recorrido Preorden: Raíz - Izquierda - Derecha
    public void preOrden(NodoArbol nodo) {
        if (nodo == null) return;

        System.out.print(nodo.valor + " ");
        preOrden(nodo.izquierdo);
        preOrden(nodo.derecho);
    }

    // Recorrido Inorden: Izquierda - Raíz - Derecha
    public void inOrden(NodoArbol nodo) {
        if (nodo == null) return;

        inOrden(nodo.izquierdo);
        System.out.print(nodo.valor + " ");
        inOrden(nodo.derecho);
    }

    // Recorrido Postorden: Izquierda - Derecha - Raíz
    public void postOrden(NodoArbol nodo) {
        if (nodo == null) return;

        postOrden(nodo.izquierdo);
        postOrden(nodo.derecho);
        System.out.print(nodo.valor + " ");
    }
}