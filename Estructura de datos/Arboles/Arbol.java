package Arboles;

public class Arbol<T> {

    private Nodo<T> raiz;

    public Arbol() {
        this.raiz = null;
    }

    public Nodo<T> getRaiz() {
        return raiz;
    }

    public void setRaiz(Nodo<T> raiz) {
        this.raiz = raiz;
    }

    public boolean estaVacio() {
        return raiz == null;
    }

    public void insertarRaiz(T dato) {
        if (raiz == null) {
            raiz = new Nodo<>(dato);
        } else {
            System.out.println("La raíz ya existe");
        }
    }
}