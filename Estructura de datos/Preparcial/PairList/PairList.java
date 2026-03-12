package Preparcial.PairList;

import java.util.ArrayList;

public class PairList<K, V> {
    private ArrayList<Pair<K, V>> lista = new ArrayList<>();

    public void agregar(K clave, V valor) {
        Pair<K, V> nuevo = new Pair<>(clave, valor);
        lista.add(nuevo);
    }

    public V obtener(K clave) {
        for (Pair<K, V> p : lista) {
            if (p.getClave().equals(clave)) {
                return p.getValor();
            }
        }
        return null;
    }

    public void eliminar(K clave) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getClave().equals(clave)) {
                lista.remove(i);
                break;
            }
        }
    }

    public void mostrar() {
        for (Pair<K, V> p : lista) {
            System.out.println(p.getClave() + " -> " + p.getValor());
        }
    }
}
