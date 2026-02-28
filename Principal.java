import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Pila pila = new Pila();
        Cola cola = new Cola();
        ArbolBinario arbol = new ArbolBinario();

        int opcion;

        do {
            System.out.println("\n--- MENU PRINCIPAL ---");
            System.out.println("1. Operaciones con Pila");
            System.out.println("2. Operaciones con Cola");
            System.out.println("3. Crear y recorrer Árbol Binario");
            System.out.println("0. Salir");
            System.out.print("Seleccione opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {

                case 1:
                    pila.push(10);
                    pila.push(20);
                    pila.mostrar();
                    pila.pop();
                    pila.mostrar();
                    break;

                case 2:
                    cola.insertar(5);
                    cola.insertar(15);
                    cola.mostrar();
                    cola.eliminar();
                    cola.mostrar();
                    break;

                case 3:
                    arbol.crearArbol();
                    System.out.print("Preorden: ");
                    arbol.preOrden(arbol.raiz);
                    System.out.print("\nInorden: ");
                    arbol.inOrden(arbol.raiz);
                    System.out.print("\nPostorden: ");
                    arbol.postOrden(arbol.raiz);
                    System.out.println();
                    break;

                case 0:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 0);
    }
}