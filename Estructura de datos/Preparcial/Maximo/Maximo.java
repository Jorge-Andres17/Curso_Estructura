package Preparcial.Maximo;

import java.util.ArrayList;

public class Maximo {

    public static <T extends Comparable<T>> T maximo(ArrayList<T> lista) {
        if (lista == null || lista.isEmpty()) {
            return null;
        }
        T max = lista.get(0);
        for (int i = 1; i < lista.size(); i++) {
            T actual = lista.get(i);
            if (actual.compareTo(max) > 0) {
                max = actual;
            }
        }

        return max;
    }

     public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(4);
        numeros.add(1);
        numeros.add(9);
        numeros.add(3);
        numeros.add(7);

        Integer max = maximo(numeros);

        System.out.println(max); // 9
    }
}
