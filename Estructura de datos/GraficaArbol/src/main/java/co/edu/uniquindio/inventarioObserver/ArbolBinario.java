package co.edu.uniquindio.inventarioObserver;

import java.awt.Color;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Clase que representa un Árbol Binario de Búsqueda (BST).
 * Permite realizar operaciones como inserción, eliminación,
 * recorridos, cálculo de altura, peso, hojas, entre otros.
 */
public class ArbolBinario {

    /** Nodo raíz del árbol */
    public Nodo raiz;

    /**
     * Agrega un nuevo dato al árbol binario de búsqueda.
     *
     * @param dato valor a insertar
     */
    public void agregar(int dato) {
        raiz = agregarRecursivo(raiz, dato);
    }

    /**
     * Método recursivo para insertar un nodo en el árbol.
     *
     * @param actual nodo actual
     * @param dato valor a insertar
     * @return nodo actualizado
     */
    private Nodo agregarRecursivo(Nodo actual, int dato) {
        if (actual == null) return new Nodo(dato);

        if (dato < actual.dato)
            actual.izquierdo = agregarRecursivo(actual.izquierdo, dato);
        else if (dato > actual.dato)
            actual.derecho = agregarRecursivo(actual.derecho, dato);

        return actual;
    }

    /**
     * Elimina un dato del árbol.
     *
     * @param dato valor a eliminar
     */
    public void eliminar(int dato) {
        raiz = eliminarRec(raiz, dato);
    }

    /**
     * Método recursivo para eliminar un nodo.
     *
     * @param n nodo actual
     * @param dato valor a eliminar
     * @return nodo actualizado
     */
    private Nodo eliminarRec(Nodo n, int dato) {
        if (n == null) return null;

        if (dato < n.dato)
            n.izquierdo = eliminarRec(n.izquierdo, dato);
        else if (dato > n.dato)
            n.derecho = eliminarRec(n.derecho, dato);
        else {
            // Caso 1: sin hijo izquierdo
            if (n.izquierdo == null) return n.derecho;

            // Caso 2: sin hijo derecho
            if (n.derecho == null) return n.izquierdo;

            // Caso 3: dos hijos
            n.dato = obtenerNodoMenor(n.derecho).dato;
            n.derecho = eliminarRec(n.derecho, n.dato);
        }

        return n;
    }

    /**
     * Elimina todos los nodos del árbol.
     */
    public void borrarArbol() {
        raiz = null;
    }

    /**
     * Verifica si el árbol está vacío.
     *
     * @return true si está vacío, false en caso contrario
     */
    public boolean estaVacio() {
        return raiz == null;
    }

    /**
     * Obtiene el número total de nodos del árbol.
     *
     * @return cantidad de nodos
     */
    public int obtenerPeso() {
        return contarNodos(raiz);
    }

    /**
     * Cuenta recursivamente los nodos.
     */
    private int contarNodos(Nodo n) {
        return n == null ? 0 : 1 + contarNodos(n.izquierdo) + contarNodos(n.derecho);
    }

    /**
     * Calcula la altura del árbol.
     *
     * @return altura del árbol
     */
    public int obtenerAltura() {
        return calcularAltura(raiz);
    }

    /**
     * Método recursivo para calcular la altura.
     */
    private int calcularAltura(Nodo n) {
        return n == null ? 0 : 1 + Math.max(
                calcularAltura(n.izquierdo),
                calcularAltura(n.derecho)
        );
    }

    /**
     * Cuenta la cantidad de nodos hoja del árbol.
     *
     * @return número de hojas
     */
    public int contarHojas() {
        return contarHojasRec(raiz);
    }

    /**
     * Método recursivo para contar hojas.
     */
    private int contarHojasRec(Nodo n) {
        if (n == null) return 0;
        if (n.izquierdo == null && n.derecho == null) return 1;
        return contarHojasRec(n.izquierdo) + contarHojasRec(n.derecho);
    }

    /**
     * Obtiene el valor mínimo del árbol.
     *
     * @return valor menor o -1 si el árbol está vacío
     */
    public int obtenerMenor() {
        if (raiz == null) return -1;
        return obtenerNodoMenor(raiz).dato;
    }

    /**
     * Obtiene el nodo con menor valor desde un nodo dado.
     */
    private Nodo obtenerNodoMenor(Nodo n) {
        while (n.izquierdo != null) n = n.izquierdo;
        return n;
    }

    /**
     * Realiza un recorrido del árbol según el tipo indicado.
     *
     * Tipos válidos:
     * - "Preorden"
     * - "Postorden"
     * - "Inorden"
     * - "Amplitud"
     *
     * @param tipo tipo de recorrido
     * @return cadena con el recorrido
     */
    public String recorrido(String tipo) {
        StringBuilder sb = new StringBuilder();

        if (tipo.equals("Preorden")) pre(raiz, sb);
        else if (tipo.equals("Postorden")) post(raiz, sb);
        else if (tipo.equals("Inorden")) in(raiz, sb);
        else if (tipo.equals("Amplitud")) amplitud(raiz, sb);

        return sb.toString();
    }

    /** Recorrido en preorden */
    private void pre(Nodo n, StringBuilder sb) {
        if (n != null) {
            sb.append(n.dato).append(" ");
            pre(n.izquierdo, sb);
            pre(n.derecho, sb);
        }
    }

    /** Recorrido en postorden */
    private void post(Nodo n, StringBuilder sb) {
        if (n != null) {
            post(n.izquierdo, sb);
            post(n.derecho, sb);
            sb.append(n.dato).append(" ");
        }
    }

    /** Recorrido en inorden */
    private void in(Nodo n, StringBuilder sb) {
        if (n != null) {
            in(n.izquierdo, sb);
            sb.append(n.dato).append(" ");
            in(n.derecho, sb);
        }
    }

    /**
     * Recorrido por amplitud (BFS).
     */
    private void amplitud(Nodo n, StringBuilder sb) {
        if (n == null) return;

        Queue<Nodo> cola = new LinkedList<>();
        cola.add(n);

        while (!cola.isEmpty()) {
            Nodo aux = cola.poll();
            sb.append(aux.dato).append(" ");

            if (aux.izquierdo != null) cola.add(aux.izquierdo);
            if (aux.derecho != null) cola.add(aux.derecho);
        }
    }

    /**
     * Reinicia los colores de todos los nodos a azul.
     * (Útil para visualización gráfica del árbol)
     *
     * @param n nodo desde donde iniciar
     */
    public void resetColores(Nodo n) {
        if (n == null) return;

        n.colorActual = Color.BLUE;

        resetColores(n.izquierdo);
        resetColores(n.derecho);
    }
}