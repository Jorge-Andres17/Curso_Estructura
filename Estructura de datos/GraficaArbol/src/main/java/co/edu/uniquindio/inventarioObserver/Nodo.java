package co.edu.uniquindio.inventarioObserver;

import java.awt.Color;

/**
 * Clase que representa un nodo dentro de un Árbol Binario de Búsqueda (BST).
 * Cada nodo contiene un valor, referencias a sus hijos izquierdo y derecho,
 * información visual (color) y coordenadas para su representación gráfica.
 */
class Nodo {

    /** Valor almacenado en el nodo */
    int dato;

    /** Referencia al hijo izquierdo */
    Nodo izquierdo;

    /** Referencia al hijo derecho */
    Nodo derecho;

    /** Color actual del nodo (usado para visualización en la interfaz gráfica) */
    Color colorActual = Color.BLUE;

    /** Coordenada X del nodo en el panel gráfico */
    int x;

    /** Coordenada Y del nodo en el panel gráfico */
    int y;

    /**
     * Constructor que inicializa el nodo con un valor específico.
     *
     * @param dato valor a almacenar en el nodo
     */
    public Nodo(int dato) {
        this.dato = dato;
    }
}